package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.model.PermissionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

@Service
public class PermissionService {
    @Autowired
    private SecLkpRoleRepository roleRepository;
    @Autowired
    private SecLkpPermissionRepository permissionRepository;
    @Autowired
    private SecLkpRolePermissionRepository rolePermissionRepository;
    @Autowired
    private SecLkpPermissionCategoryRepository permissionCategoryRepository;

    private List<PermissionCacheEntry> cachedPermissions = new ArrayList<>();

    @PostConstruct
    @Scheduled(cron = "0 0 4 * * ?")
    public void refreshCache() {
        Date now = java.sql.Date.valueOf(LocalDate.now());
        cachedPermissions = permissionRepository.findAll().stream()
            .filter(p -> p.getDeprecatedDate() == null || p.getDeprecatedDate().after(now))
            .flatMap(p -> rolePermissionRepository.findAll().stream()
                .filter(rp -> rp.getPermissionId().equals(p.getPermissionId()))
                .map(rp -> {
                    SecLkpRole role = roleRepository.findById(rp.getRoleId()).orElse(null);
                    SecLkpPermissionCategory cat = permissionCategoryRepository.findById(p.getPermissionCategoryId()).orElse(null);
                    return new PermissionCacheEntry(
                        rp.getRoleId(),
                        cat != null ? cat.getPermissionCategoryNm() : null,
                        p.getPermissionId(),
                        p.getPermissionNm(),
                        p.getAdGroup(),
                        rp.getDefaultFlag()
                    );
                })
            )
            .collect(Collectors.toList());
    }

    public List<PermissionDto> getPermission(String roleId, String permissionCategoryName) {
        return cachedPermissions.stream()
            .filter(e -> e.role_id.equals(roleId))
            .filter(e -> e.permission_category_name != null && e.permission_category_name.equals(permissionCategoryName))
            .map(e -> new PermissionDto(e.permission_id, e.permission_nm, e.ad_group, e.default_flag))
            .collect(Collectors.toList());
    }

    private static class PermissionCacheEntry {
        public String role_id;
        public String permission_category_name;
        public String permission_id;
        public String permission_nm;
        public String ad_group;
        public String default_flag;
        public PermissionCacheEntry(String role_id, String permission_category_name, String permission_id, String permission_nm, String ad_group, String default_flag) {
            this.role_id = role_id;
            this.permission_category_name = permission_category_name;
            this.permission_id = permission_id;
            this.permission_nm = permission_nm;
            this.ad_group = ad_group;
            this.default_flag = default_flag;
        }
    }
} 
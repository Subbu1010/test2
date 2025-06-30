package com.example.demo.service;

import com.example.demo.entity.SecLkpRole;
import com.example.demo.repository.SecLkpRoleRepository;
import com.example.demo.model.RoleDto;
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
public class RoleService {
    @Autowired
    private SecLkpRoleRepository roleRepository;

    private List<RoleDto> cachedRoles = new ArrayList<>();

    @PostConstruct
    @Scheduled(cron = "0 0/5 * * * ?")
    public void refreshCache() {
        Date now = java.sql.Date.valueOf(LocalDate.now());
        cachedRoles = roleRepository.findAll().stream()
                .filter(role -> role.getDeprecatedDate() == null || role.getDeprecatedDate().after(now))
                .map(role -> new RoleDto(
                        role.getRoleId(),
                        role.getRoleNm(),
                        role.getAdGroup(),
                        role.getRecordOrder(),
                        null
                ))
                .collect(Collectors.toList());
    }

    public List<RoleDto> getRoles() {
        return cachedRoles;
    }
} 
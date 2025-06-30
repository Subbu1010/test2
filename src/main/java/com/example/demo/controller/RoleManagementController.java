package com.example.demo.controller;

import com.example.demo.service.RoleService;
import com.example.demo.service.ChannelService;
import com.example.demo.service.AuditLevelService;
import com.example.demo.service.PermissionService;
import com.example.demo.model.RoleDto;
import com.example.demo.model.ChannelDto;
import com.example.demo.model.AuditLevelDto;
import com.example.demo.model.PermissionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleManagementController {
    @Autowired
    private RoleService roleService;
    @Autowired
    private ChannelService channelService;
    @Autowired
    private AuditLevelService auditLevelService;
    @Autowired
    private PermissionService permissionService;

    @GetMapping("/roles")
    public List<RoleDto> getRoles() {
        return roleService.getRoles();
    }

    @GetMapping("/channels")
    public List<ChannelDto> getChannels() {
        return channelService.getChannels();
    }

    @GetMapping("/audit-levels")
    public List<AuditLevelDto> getAuditLevels() {
        return auditLevelService.getAuditLevels();
    }

    @GetMapping("/permissions")
    public List<PermissionDto> getPermission(@RequestParam String role_id, @RequestParam String permission_category_name) {
        return permissionService.getPermission(role_id, permission_category_name);
    }
} 
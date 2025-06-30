package com.example.demo.model;

public class PermissionDto {
    public String permission_id;
    public String permission_nm;
    public String ad_group;
    public String default_flag;

    public PermissionDto(String permission_id, String permission_nm, String ad_group, String default_flag) {
        this.permission_id = permission_id;
        this.permission_nm = permission_nm;
        this.ad_group = ad_group;
        this.default_flag = default_flag;
    }
} 
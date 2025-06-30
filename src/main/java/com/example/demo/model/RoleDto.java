package com.example.demo.model;

public class RoleDto {
    public String role_id;
    public String role_nm;
    public String ad_group;
    public Integer record_order;
    public String default_flag;

    public RoleDto(String role_id, String role_nm, String ad_group, Integer record_order, String default_flag) {
        this.role_id = role_id;
        this.role_nm = role_nm;
        this.ad_group = ad_group;
        this.record_order = record_order;
        this.default_flag = default_flag;
    }
} 
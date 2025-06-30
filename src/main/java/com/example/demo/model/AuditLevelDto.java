package com.example.demo.model;

public class AuditLevelDto {
    public String audit_level_id;
    public String audit_level_nm;
    public String ad_group;
    public String approver_soeid;
    public String approver_fname;
    public String approver_lname;
    public String approver_group;
    public String resource_id;
    public Integer record_order;
    public String default_flag;

    public AuditLevelDto(String audit_level_id, String audit_level_nm, String ad_group, String approver_soeid, String approver_fname, String approver_lname, String approver_group, String resource_id, Integer record_order, String default_flag) {
        this.audit_level_id = audit_level_id;
        this.audit_level_nm = audit_level_nm;
        this.ad_group = ad_group;
        this.approver_soeid = approver_soeid;
        this.approver_fname = approver_fname;
        this.approver_lname = approver_lname;
        this.approver_group = approver_group;
        this.resource_id = resource_id;
        this.record_order = record_order;
        this.default_flag = default_flag;
    }
} 
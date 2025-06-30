package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sec_lkp_audit_level")
@Data
@NoArgsConstructor
public class SecLkpAuditLevel {
    @Id
    @Column(name = "audit_level_id")
    private String auditLevelId;

    @Column(name = "audit_level_nm")
    private String auditLevelNm;

    @Column(name = "ad_group")
    private String adGroup;

    @Column(name = "approver_soeid")
    private String approverSoeid;

    @Column(name = "approver_fname")
    private String approverFname;

    @Column(name = "approver_lname")
    private String approverLname;

    @Column(name = "approver_group")
    private String approverGroup;

    @Column(name = "resource_id")
    private String resourceId;

    @Column(name = "record_order")
    private Integer recordOrder;

    @Column(name = "activated_date")
    private Date activatedDate;

    @Column(name = "deprecated_date")
    private Date deprecatedDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_date")
    private Date modifiedDate;
} 
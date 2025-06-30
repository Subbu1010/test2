package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sec_lkp_role")
@Data
@NoArgsConstructor
public class SecLkpRole {
    @Id
    @Column(name = "role_id")
    private String roleId;

    @Column(name = "role_nm")
    private String roleNm;

    @Column(name = "role_desc")
    private String roleDesc;

    @Column(name = "ad_group")
    private String adGroup;

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
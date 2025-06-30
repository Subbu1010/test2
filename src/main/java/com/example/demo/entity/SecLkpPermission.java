package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sec_lkp_permission")
@Data
@NoArgsConstructor
public class SecLkpPermission {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "permission_category_id")
    private Integer permissionCategoryId;

    @Column(name = "permission_id")
    private String permissionId;

    @Column(name = "permission_nm")
    private String permissionNm;

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
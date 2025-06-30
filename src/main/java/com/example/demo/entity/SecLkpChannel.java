package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sec_lkp_channel")
@Data
@NoArgsConstructor
public class SecLkpChannel {
    @Id
    @Column(name = "channel_id")
    private String channelId;

    @Column(name = "channel_nm")
    private String channelNm;

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
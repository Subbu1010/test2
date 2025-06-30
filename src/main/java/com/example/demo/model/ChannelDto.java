package com.example.demo.model;

public class ChannelDto {
    public String channel_id;
    public String channel_nm;
    public String ad_group;
    public Integer record_order;
    public String default_flag;

    public ChannelDto(String channel_id, String channel_nm, String ad_group, Integer record_order, String default_flag) {
        this.channel_id = channel_id;
        this.channel_nm = channel_nm;
        this.ad_group = ad_group;
        this.record_order = record_order;
        this.default_flag = default_flag;
    }
} 
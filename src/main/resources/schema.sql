CREATE TABLE sec_lkp_role (
    role_id VARCHAR(50) PRIMARY KEY,
    role_nm VARCHAR(50),
    role_desc VARCHAR(255),
    ad_group VARCHAR(100),
    record_order INT,
    activated_date DATE,
    deprecated_date DATE,
    created_by VARCHAR(10),
    created_date DATE,
    modified_by VARCHAR(10),
    modified_date DATE
);

CREATE TABLE sec_lkp_channel (
    channel_id VARCHAR(50) PRIMARY KEY,
    channel_nm VARCHAR(50),
    ad_group VARCHAR(100),
    record_order INT,
    activated_date DATE,
    deprecated_date DATE,
    created_by VARCHAR(10),
    created_date DATE,
    modified_by VARCHAR(10),
    modified_date DATE
);

CREATE TABLE sec_lkp_audit_level (
    audit_level_id VARCHAR(30) PRIMARY KEY,
    audit_level_nm VARCHAR(30),
    ad_group VARCHAR(100),
    approver_soeid VARCHAR(10),
    approver_fname VARCHAR(50),
    approver_lname VARCHAR(50),
    approver_group VARCHAR(100),
    resource_id VARCHAR(30),
    record_order INT,
    activated_date DATE,
    deprecated_date DATE,
    created_by VARCHAR(10),
    created_date DATE,
    modified_by VARCHAR(10),
    modified_date DATE
);

CREATE TABLE sec_lkp_permission_category (
    permission_category_id INT PRIMARY KEY,
    permission_category_nm VARCHAR(30),
    activated_date DATE,
    deprecated_date DATE,
    created_by VARCHAR(10),
    created_date DATE,
    modified_by VARCHAR(10),
    modified_date DATE
);

CREATE TABLE sec_lkp_permission (
    id INT PRIMARY KEY,
    permission_category_id INT,
    permission_id VARCHAR(50),
    permission_nm VARCHAR(50),
    ad_group VARCHAR(100),
    record_order INT,
    activated_date DATE,
    deprecated_date DATE,
    created_by VARCHAR(10),
    created_date DATE,
    modified_by VARCHAR(10),
    modified_date DATE,
    CONSTRAINT fk_permission_category FOREIGN KEY (permission_category_id) REFERENCES sec_lkp_permission_category(permission_category_id)
);

CREATE TABLE sec_lkp_role_permission (
    id INT PRIMARY KEY,
    role_id VARCHAR(50),
    permission_id VARCHAR(50),
    default_flag VARCHAR(10),
    activated_date DATE,
    deprecated_date DATE,
    created_by VARCHAR(10),
    created_date DATE,
    modified_by VARCHAR(10),
    modified_date DATE,
    CONSTRAINT fk_role FOREIGN KEY (role_id) REFERENCES sec_lkp_role(role_id)
); 
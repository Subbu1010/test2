INSERT INTO sec_lkp_role (role_id, role_nm, role_desc, ad_group, record_order, activated_date, deprecated_date, created_by, created_date, modified_by, modified_date) VALUES
('ADMIN', 'Administrator', 'Admin role', 'AD_ADMIN', 1, '2023-01-01', NULL, 'SYS', '2023-01-01', 'SYS', '2023-01-01'),
('USER', 'User', 'User role', 'AD_USER', 2, '2023-01-01', '2099-12-31', 'SYS', '2023-01-01', 'SYS', '2023-01-01'),
('GUEST', 'Guest', 'Guest role', 'AD_GUEST', 3, '2023-01-01', '2022-12-31', 'SYS', '2023-01-01', 'SYS', '2023-01-01');

INSERT INTO sec_lkp_channel (channel_id, channel_nm, ad_group, record_order, activated_date, deprecated_date, created_by, created_date, modified_by, modified_date) VALUES
('WEB', 'Web Channel', 'AD_WEB', 1, '2023-01-01', NULL, 'SYS', '2023-01-01', 'SYS', '2023-01-01'),
('MOBILE', 'Mobile Channel', 'AD_MOBILE', 2, '2023-01-01', '2099-12-31', 'SYS', '2023-01-01', 'SYS', '2023-01-01'),
('API', 'API Channel', 'AD_API', 3, '2023-01-01', '2022-12-31', 'SYS', '2023-01-01', 'SYS', '2023-01-01');

INSERT INTO sec_lkp_audit_level (audit_level_id, audit_level_nm, ad_group, approver_soeid, approver_fname, approver_lname, approver_group, resource_id, record_order, activated_date, deprecated_date, created_by, created_date, modified_by, modified_date) VALUES
('AL1', 'Level 1', 'AD_AUDIT1', 'SOEID1', 'John', 'Doe', 'GRP1', 'RES1', 1, '2023-01-01', NULL, 'SYS', '2023-01-01', 'SYS', '2023-01-01'),
('AL2', 'Level 2', 'AD_AUDIT2', 'SOEID2', 'Jane', 'Smith', 'GRP2', 'RES2', 2, '2023-01-01', '2099-12-31', 'SYS', '2023-01-01', 'SYS', '2023-01-01'),
('AL3', 'Level 3', 'AD_AUDIT3', 'SOEID3', 'Alice', 'Brown', 'GRP3', 'RES3', 3, '2023-01-01', '2022-12-31', 'SYS', '2023-01-01', 'SYS', '2023-01-01');

INSERT INTO sec_lkp_permission_category (permission_category_id, permission_category_nm, activated_date, deprecated_date, created_by, created_date, modified_by, modified_date) VALUES
(1, 'Category1', '2023-01-01', NULL, 'SYS', '2023-01-01', 'SYS', '2023-01-01'),
(2, 'Category2', '2023-01-01', '2099-12-31', 'SYS', '2023-01-01', 'SYS', '2023-01-01');

INSERT INTO sec_lkp_permission (id, permission_category_id, permission_id, permission_nm, ad_group, record_order, activated_date, deprecated_date, created_by, created_date, modified_by, modified_date) VALUES
(1, 1, 'PERM1', 'Permission 1', 'AD_PERM1', 1, '2023-01-01', NULL, 'SYS', '2023-01-01', 'SYS', '2023-01-01'),
(2, 1, 'PERM2', 'Permission 2', 'AD_PERM2', 2, '2023-01-01', '2099-12-31', 'SYS', '2023-01-01', 'SYS', '2023-01-01'),
(3, 2, 'PERM3', 'Permission 3', 'AD_PERM3', 3, '2023-01-01', '2022-12-31', 'SYS', '2023-01-01', 'SYS', '2023-01-01');

INSERT INTO sec_lkp_role_permission (id, role_id, permission_id, default_flag, activated_date, deprecated_date, created_by, created_date, modified_by, modified_date) VALUES
(1, 'ADMIN', 'PERM1', 'Y', '2023-01-01', NULL, 'SYS', '2023-01-01', 'SYS', '2023-01-01'),
(2, 'USER', 'PERM2', 'N', '2023-01-01', '2099-12-31', 'SYS', '2023-01-01', 'SYS', '2023-01-01'),
(3, 'ADMIN', 'PERM2', 'Y', '2023-01-01', NULL, 'SYS', '2023-01-01', 'SYS', '2023-01-01'); 
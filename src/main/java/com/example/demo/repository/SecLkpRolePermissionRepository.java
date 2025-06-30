package com.example.demo.repository;

import com.example.demo.entity.SecLkpRolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecLkpRolePermissionRepository extends JpaRepository<SecLkpRolePermission, Integer> {
} 
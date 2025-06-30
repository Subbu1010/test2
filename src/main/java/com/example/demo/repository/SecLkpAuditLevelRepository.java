package com.example.demo.repository;

import com.example.demo.entity.SecLkpAuditLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecLkpAuditLevelRepository extends JpaRepository<SecLkpAuditLevel, String> {
} 
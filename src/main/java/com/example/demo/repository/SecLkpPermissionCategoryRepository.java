package com.example.demo.repository;

import com.example.demo.entity.SecLkpPermissionCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecLkpPermissionCategoryRepository extends JpaRepository<SecLkpPermissionCategory, Integer> {
    SecLkpPermissionCategory findByPermissionCategoryNm(String permissionCategoryNm);
} 
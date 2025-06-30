package com.example.demo.repository;

import com.example.demo.entity.SecLkpChannel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecLkpChannelRepository extends JpaRepository<SecLkpChannel, String> {
} 
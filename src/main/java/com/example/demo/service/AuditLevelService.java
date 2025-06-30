package com.example.demo.service;

import com.example.demo.entity.SecLkpAuditLevel;
import com.example.demo.repository.SecLkpAuditLevelRepository;
import com.example.demo.model.AuditLevelDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

@Service
public class AuditLevelService {
    @Autowired
    private SecLkpAuditLevelRepository auditLevelRepository;

    private List<AuditLevelDto> cachedAuditLevels = new ArrayList<>();

    @PostConstruct
    @Scheduled(cron = "0 0 4 * * ?")
    public void refreshCache() {
        Date now = java.sql.Date.valueOf(LocalDate.now());
        cachedAuditLevels = auditLevelRepository.findAll().stream()
                .filter(auditLevel -> auditLevel.getDeprecatedDate() == null || auditLevel.getDeprecatedDate().after(now))
                .map(auditLevel -> new AuditLevelDto(
                        auditLevel.getAuditLevelId(),
                        auditLevel.getAuditLevelNm(),
                        auditLevel.getAdGroup(),
                        auditLevel.getApproverSoeid(),
                        auditLevel.getApproverFname(),
                        auditLevel.getApproverLname(),
                        auditLevel.getApproverGroup(),
                        auditLevel.getResourceId(),
                        auditLevel.getRecordOrder(),
                        null
                ))
                .collect(Collectors.toList());
    }

    public List<AuditLevelDto> getAuditLevels() {
        return cachedAuditLevels;
    }
} 
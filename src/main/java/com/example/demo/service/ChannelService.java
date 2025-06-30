package com.example.demo.service;

import com.example.demo.entity.SecLkpChannel;
import com.example.demo.repository.SecLkpChannelRepository;
import com.example.demo.model.ChannelDto;
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
public class ChannelService {
    @Autowired
    private SecLkpChannelRepository channelRepository;

    private List<ChannelDto> cachedChannels = new ArrayList<>();

    @PostConstruct
    @Scheduled(cron = "0 0 4 * * ?")
    public void refreshCache() {
        Date now = java.sql.Date.valueOf(LocalDate.now());
        cachedChannels = channelRepository.findAll().stream()
                .filter(channel -> channel.getDeprecatedDate() == null || channel.getDeprecatedDate().after(now))
                .map(channel -> new ChannelDto(
                        channel.getChannelId(),
                        channel.getChannelNm(),
                        channel.getAdGroup(),
                        channel.getRecordOrder(),
                        null
                ))
                .collect(Collectors.toList());
    }

    public List<ChannelDto> getChannels() {
        return cachedChannels;
    }
} 
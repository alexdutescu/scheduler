package com.myproject.scheduler;

import com.myproject.scheduler.data.FileProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ScheduledFileProcessor {

    private final FileProperties fileProperties;

    @Scheduled(fixedRateString = "#{@fileProperties.frequency}")
    public void processFile() {
      log.info("File path {}, file frequency {}",fileProperties.getPath(), fileProperties.getFrequency());
    }
}

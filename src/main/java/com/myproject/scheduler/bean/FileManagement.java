package com.myproject.scheduler.bean;

import com.myproject.scheduler.data.FileProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "file-management")
@Getter
@Setter
public class FileManagement {

    private String path;
    private Integer frequency;

    @Bean
    public FileProperties fileProperties() {
        return new FileProperties(path, frequency);
    }
}

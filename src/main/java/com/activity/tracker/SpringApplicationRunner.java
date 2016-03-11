package com.activity.tracker;

import com.activity.tracker.config.MainConfig;
import org.springframework.boot.SpringApplication;

public class SpringApplicationRunner {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainConfig.class, args);
    }
}

package com.activity.tracker.config;

import com.activity.tracker.example.module.dao.ExampleDAO;
import com.activity.tracker.example.module.dao.ExampleDAOImpl;
import com.activity.tracker.example.module.service.ExampleService;
import com.activity.tracker.example.module.service.ExampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "com.activity.tracker.example.module"
})
public class ExampleConfig {
    @Autowired
    private ExampleDAO exampleDAO;

    @Bean
    public ExampleDAO exampleDAO() {
        return new ExampleDAOImpl();
    }

    @Bean
    public ExampleService exampleService() {
        return new ExampleServiceImpl(exampleDAO);
    }
}

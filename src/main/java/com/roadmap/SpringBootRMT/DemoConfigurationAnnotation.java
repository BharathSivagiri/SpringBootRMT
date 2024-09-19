package com.roadmap.SpringBootRMT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfigurationAnnotation
{
    @Bean
    public Demo demo()
    {
        return new Demo();
    }
}

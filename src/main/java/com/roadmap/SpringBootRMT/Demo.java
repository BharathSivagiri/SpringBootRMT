package com.roadmap.SpringBootRMT;

import org.springframework.stereotype.Component;

@Component("demobean")
public class Demo
{
    public void demo()
    {
        System.out.println("This is a @Bean annotated class");
    }
}

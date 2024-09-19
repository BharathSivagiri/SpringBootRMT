package com.roadmap.SpringBootRMT;

import org.springframework.stereotype.Component;

@Component
public class DemoComponentAnnotation
{
    public void comp()
    {
        System.out.println("This is a @Component annotated class");
    }
}

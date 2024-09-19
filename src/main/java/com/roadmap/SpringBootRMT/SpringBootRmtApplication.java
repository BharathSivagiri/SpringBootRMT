package com.roadmap.SpringBootRMT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootRmtApplication
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(SpringBootRmtApplication.class, args);

		DemoComponentAnnotation dComponent = context.getBean(DemoComponentAnnotation.class);
		dComponent.comp();

		Demo dm = context.getBean("demobean", Demo.class);
		dm.demo();
	}
}

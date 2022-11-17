package com.imooc.evnet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.imooc")
public class EventCcontroller {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EventCcontroller.class);
        System.out.println(applicationContext.getBean("eventTestListener"));
        applicationContext.publishEvent(new EventTest("测试事件"));
    }
}

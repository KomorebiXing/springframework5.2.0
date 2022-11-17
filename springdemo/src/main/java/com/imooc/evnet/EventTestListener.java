package com.imooc.evnet;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventTestListener {


    @EventListener
    public void test(EventTest test) {
        System.out.println("测试事件" + test);
    }

}

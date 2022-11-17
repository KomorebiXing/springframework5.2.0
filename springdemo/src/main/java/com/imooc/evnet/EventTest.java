package com.imooc.evnet;


public class EventTest {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public EventTest(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EventTest{" +
                "value='" + value + '\'' +
                '}';
    }
}

package com.chtti.springboot.demo.Demo6JDBC.bean;

public class BeanTester {

    public void test1(){
        Message message = new Message(5,"Ting");
        System.out.println(message.toString());
        message.setId(6);
        message.setName("Kenn");
        System.out.println(message.toString());
    }
}

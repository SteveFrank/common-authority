package com.hello.service;

/**
 * @author frankq
 * @date 2021/12/6
 */
public class HelloService {

    private String name;
    private String address;

    public HelloService(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String sayHello() {
        return "您好! 我的名字叫 " + name + "，我来自 " + address;
    }

}

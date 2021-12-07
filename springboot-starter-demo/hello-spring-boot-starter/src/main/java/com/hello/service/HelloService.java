package com.hello.service;

import com.hello.log.MyLog;

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

    @MyLog(desc = "测试sayHello方法")
    public String sayHello() {
        return "您好! 我的名字叫 " + name + "，我来自 " + address;
    }

}

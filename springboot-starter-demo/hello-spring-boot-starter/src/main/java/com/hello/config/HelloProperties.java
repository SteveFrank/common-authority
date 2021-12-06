package com.hello.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author frankq
 * @date 2021/12/6
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "HelloProperties{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

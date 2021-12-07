package com.cdw.package3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: cdw
 * @date: 2021/11/23 13:42
 * @description:
 */
@Component("school")
public class School {
    @Value("dddd")
    private String name;
    @Value("东北那嘎达")
    private String address;


    public School() {
    }

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

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
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

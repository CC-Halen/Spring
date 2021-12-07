package com.cdw.package2;

/**
 * @author: cdw
 * @date: 2021/11/23 13:42
 * @description:
 */
public class School {
    private String name;
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

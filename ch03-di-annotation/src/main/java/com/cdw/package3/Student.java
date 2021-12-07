package com.cdw.package3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: cdw
 * @date: 2021/11/23 13:22
 * @description:
 */
@Component("student3")
public class Student {
//    @Value("cdw")
    @Value("${name}")
    private String name;
//    @Value("33")
    @Value("${age}")
    private Integer age;

    @Autowired
    private School school;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}

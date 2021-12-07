package com.cdw.package5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author: cdw
 * @date: 2021/11/23 13:22
 * @description:
 */
@Component("student5")
public class Student {
    //    @Value("cdw")
    @Value("${name}")
    private String name;
    //    @Value("33")
    @Value("${age}")
    private Integer age;


//    @Resource()  默认byName，没有就是byType
    @Resource(name = "school5")
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

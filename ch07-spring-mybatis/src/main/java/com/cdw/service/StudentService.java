package com.cdw.service;

import com.cdw.domain.Student;

import java.util.List;

/**
 * @author: cdw
 * @date: 2021/11/24 10:44
 * @description:
 */
public interface StudentService {
    int addStudent(Student student);
    List<Student> queryStudent();
}

package com.cdw.service;

import com.cdw.domain.Student;

/**
 * @author: cdw
 * @date: 2021/11/25 10:42
 * @description:
 */
public interface StudentService {
    int addStudent(Student student);

    Student findStudentById(Integer id);
}

package com.cdw.dao;

import com.cdw.domain.Student;

import java.util.List;

/**
 * @author: cdw
 * @date: 2021/11/24 10:35
 * @description:
 */
public interface StudentDao {
    int insertStudent(Student student);

    List<Student> selectStudents();
}

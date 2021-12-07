package com.cdw.service.impl;

import com.cdw.dao.StudentDao;
import com.cdw.domain.Student;
import com.cdw.service.StudentService;

import java.util.List;

/**
 * @author: cdw
 * @date: 2021/11/24 10:44
 * @description:
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;


    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    public List<Student> queryStudent() {
        return studentDao.selectStudents();
    }
}

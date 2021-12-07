package com.cdw.service.impl;

import com.cdw.dao.StudentDao;
import com.cdw.domain.Student;
import com.cdw.service.StudentService;

/**
 * @author: cdw
 * @date: 2021/11/25 10:44
 * @description:
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int res = studentDao.insertStudent(student);
        return res;
    }

    @Override
    public Student findStudentById(Integer id) {
        Student student = studentDao.selectById(id);
        return student;
    }
}

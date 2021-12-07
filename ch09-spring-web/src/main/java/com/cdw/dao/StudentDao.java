package com.cdw.dao;

import com.cdw.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: cdw
 * @date: 2021/11/25 10:19
 * @description:
 */
public interface StudentDao {
    int insertStudent(Student student);

    Student selectById(@Param("stu_id") Integer id);

}

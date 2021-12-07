package com.cdw;

import com.cdw.dao.StudentDao;
import com.cdw.domain.Student;
import com.cdw.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author: cdw
 * @date: 2021/11/24 11:06
 * @description:
 */
public class MyTest {
    @Test
    public void test1() {
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        String[] names = context.getBeanDefinitionNames();
        for (String name : names)
            System.out.println("名字是："+name);
    }


    @Test
    public void test2(){
        String config = "applicationContext.xml";
        ApplicationContext text = new ClassPathXmlApplicationContext(config);

        StudentDao studentDao = (StudentDao) text.getBean("studentDao");
        Student student = new Student();
        student.setName("赵四");
        student.setAge(35);
        studentDao.insertStudent(student);

    }


    @Test
    public void test3(){
        String config = "applicationContext.xml";
        ApplicationContext text = new ClassPathXmlApplicationContext(config);

        StudentService studentService = (StudentService) text.getBean("studentService");
        Student student = new Student();
        student.setName("刘能");
        student.setAge(45);
        studentService.addStudent(student);

    }

    @Test
    public void test4(){
        String config = "applicationContext.xml";
        ApplicationContext text = new ClassPathXmlApplicationContext(config);

        StudentService studentService = (StudentService) text.getBean("studentService");
        List<Student> students = studentService.queryStudent();
        students.forEach(System.out::println);

    }




}

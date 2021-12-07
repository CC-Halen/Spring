package com.cdw.controller;

import com.cdw.domain.Student;
import com.cdw.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: cdw
 * @date: 2021/11/25 10:48
 * @description:
 */
public class AddStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));


        /**
         * 方式一：
         * 创建容器，调用service
         *         String config = "spring-beans.xml";
         *         ApplicationContext text = new ClassPathXmlApplicationContext(config);
         *
         *         StudentService studentService = (StudentService) text.getBean("studentService");
         */


        /**
         * 方式二：
         *  WebApplicationContext webContext = null;
         *         String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
         *         ServletContext context = getServletContext();
         *
         *         Object attribute = context.getAttribute(key);
         *         if (attribute != null) {
         *             webContext = (WebApplicationContext) attribute;
         *         }
         *
         *         StudentService service = (StudentService) webContext.getBean("studentService");
         */


        //方式三
        WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());

        StudentService service = (StudentService) context.getBean("studentService");

        Student student = new Student(name, age);

        int res = service.addStudent(student);

        //返回处理结果
        request.getRequestDispatcher("/show.jsp").forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

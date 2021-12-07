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
 * @date: 2021/11/25 11:08
 * @description:
 */
public class QueryStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        int stu_id = Integer.parseInt(request.getParameter("stu_id"));

//        String config = "spring-beans.xml";
//        ApplicationContext context = new ClassPathXmlApplicationContext(config);

//        WebApplicationContext webContext = null;
//        String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
//        ServletContext context = getServletContext();
//
//        Object attribute = context.getAttribute(key);
//        if (attribute!=null) {
//            webContext = (WebApplicationContext) attribute;
//        }

        //方式三
        WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());

        StudentService service = (StudentService) context.getBean("studentService");
        Student student = service.findStudentById(stu_id);



        System.out.println(student);

        request.setAttribute("student",student);
        request.getRequestDispatcher("/show.jsp").forward(request,response);
    }
}

package com.practice.servlet;

import com.practice.model.Student;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/students")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Student> students = (List<Student>) session.getAttribute("students");

        if (students == null) {
            students = new ArrayList<>();
            session.setAttribute("students", students);
        }

        request.setAttribute("students", students);
        request.getRequestDispatcher("/student-list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String department = request.getParameter("department");
        String email = request.getParameter("email");

        if (isValid(id) && isValid(name) && isValid(department) && isValid(email)) {
            HttpSession session = request.getSession();
            List<Student> students = (List<Student>) session.getAttribute("students");

            if (students == null) {
                students = new ArrayList<>();
                session.setAttribute("students", students);
            }

            students.add(new Student(id.trim(), name.trim(), department.trim(), email.trim()));
        }

        response.sendRedirect(request.getContextPath() + "/students");
    }

    private boolean isValid(String value) {
        return value != null && !value.trim().isEmpty();
    }
}

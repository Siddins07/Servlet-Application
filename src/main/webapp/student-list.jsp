<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List,com.practice.model.Student" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student List</title>
    <style>
        body { font-family: Arial, sans-serif; background: #f3f6fb; margin: 0; padding: 40px; }
        .container { max-width: 900px; margin: auto; background: white; padding: 28px; border-radius: 12px; }
        h1 { color: #203864; }
        table { width: 100%; border-collapse: collapse; margin-top: 20px; }
        th, td { padding: 12px; border-bottom: 1px solid #ddd; text-align: left; }
        th { background: #203864; color: white; }
        a { display: inline-block; margin-top: 20px; color: #203864; }
    </style>
</head>
<body>
<div class="container">
    <h1>Registered Students</h1>
    <table>
        <tr><th>ID</th><th>Name</th><th>Department</th><th>Email</th></tr>
        <%
            List<Student> students = (List<Student>) request.getAttribute("students");
            if (students != null && !students.isEmpty()) {
                for (Student student : students) {
        %>
        <tr>
            <td><%= student.getId() %></td>
            <td><%= student.getName() %></td>
            <td><%= student.getDepartment() %></td>
            <td><%= student.getEmail() %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr><td colspan="4">No students added yet.</td></tr>
        <% } %>
    </table>
    <a href="index.html">Add another student</a>
</div>
</body>
</html>

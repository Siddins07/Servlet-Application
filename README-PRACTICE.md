# Maven Web Application Practice - Student Management

This practice module uses Java 21, Maven, JSP, Servlets and Apache Tomcat 9.

## Features
- Enter a student ID, name, department and email.
- Submit the form to a Java Servlet.
- Store the students in the current HTTP session.
- Display the students in a JSP table.

## Project structure
src/main/java/com/practice/model/Student.java
src/main/java/com/practice/servlet/StudentServlet.java
src/main/webapp/index.html
src/main/webapp/student-list.jsp
src/main/webapp/WEB-INF/web.xml
pom.xml

## Run in Eclipse
1. Clone this repository.
2. Select File -> Import -> Maven -> Existing Maven Projects.
3. Choose the cloned project folder and finish.
4. Right-click the project -> Maven -> Update Project.
5. Add Apache Tomcat 9 in the Servers view.
6. Right-click the project -> Run As -> Run on Server.
7. Open the application context root, then submit the student form.

The servlet uses javax.servlet because Tomcat 9 implements the Java EE Servlet API. The student list is kept in the HTTP session, so this is a learning demo and not a permanent database.
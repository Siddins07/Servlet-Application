package com.practice.model;

public class Student {
    private String id;
    private String name;
    private String department;
    private String email;

    public Student(String id, String name, String department, String email) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getEmail() { return email; }
}

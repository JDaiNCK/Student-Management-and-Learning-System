package com.example.studentmanagement;

//package com.example.studentmanagement.backend.model;

public class User {
    private String studentId;
    private String password;
    private String lastName;
    private String firstName;

    public User(String studentId, String password, String lastName, String firstName) {
        this.studentId = studentId;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getPassword() {
        return password;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}

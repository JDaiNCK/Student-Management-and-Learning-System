package com.example.studentmanagement.data;

import java.util.ArrayList;
import java.util.Arrays;

public class UsersData {
    public static ArrayList<User> userList = new ArrayList<>(Arrays.asList(
            new User("1", "test@liceo.edu.ph", "Test", "User", "12345"),
            new User("2", "sample@liceo.edu.ph", "Sample", "User", "password")
    ));

    public static User currentUser = null;
}
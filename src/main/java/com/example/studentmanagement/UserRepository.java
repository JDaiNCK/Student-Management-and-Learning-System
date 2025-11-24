package com.example.studentmanagement;

import com.example.studentmanagement.backend.model.User;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.io.*;
import java.util.*;

public class UserRepository {
    private static final String FILE = "src/main/resources/users.json";
    private List<User> users = new ArrayList<>();
    private Gson gson = new Gson();

    public UserRepository() {
        load();
    }

    //Authenticate login
    public boolean authenticate(String studentId, String password) {
        return users.stream()
                .anyMatch(u -> u.getStudentId().equals(studentId) && u.getPassword().equals(password));
    }

    //Add new user with duplicate check
    public boolean addUser(User newUser) {
        // Prevent empty fields
        if (newUser.getStudentId() == null || newUser.getStudentId().isEmpty() ||
                newUser.getPassword() == null || newUser.getPassword().isEmpty() ||
                newUser.getFirstName() == null || newUser.getFirstName().isEmpty() ||
                newUser.getLastName() == null || newUser.getLastName().isEmpty()) {
            System.out.println("All fields must be filled. Account not created.");
            return false;
        }

        // Prevent duplicate Student IDs
        boolean exists = users.stream()
                .anyMatch(u -> u.getStudentId().equals(newUser.getStudentId()));

        if (exists) {
            System.out.println("Student ID already exists. Cannot create account.");
            return false; // account not created
        }

        users.add(newUser);
        save();
        System.out.println("Account created successfully!");
        return true; // account created
    }

    // Find user by Student ID (used for Forgot Password)
    public User findUserByStudentId(String studentId) {
        return users.stream()
                .filter(u -> u.getStudentId().equals(studentId))
                .findFirst()
                .orElse(null);
    }

    //Save users list into local JSON file
    private void save() {
        try (Writer writer = new FileWriter(FILE)) {
            gson.toJson(users, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //  Load users list from local JSON file
    private void load() {
        try (Reader reader = new FileReader(FILE)) {
            users = gson.fromJson(reader, new TypeToken<List<User>>(){}.getType());
            if (users == null) {
                users = new ArrayList<>(); // safeguard if file is empty
            }
        } catch (IOException e) {
            users = new ArrayList<>(); // start fresh if file not found
        }
    }
}

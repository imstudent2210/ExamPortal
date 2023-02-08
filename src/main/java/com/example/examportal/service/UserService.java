package com.example.examportal.service;

import com.example.examportal.model.User;
import com.example.examportal.model.UserRole;

import java.util.Set;

public interface UserService {
    // creating a new user
    public User creatUser(User user, Set<UserRole> userRole);
    public User findUser(String username);
}

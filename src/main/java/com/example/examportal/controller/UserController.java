package com.example.examportal.controller;

import com.example.examportal.model.Role;
import com.example.examportal.model.User;
import com.example.examportal.model.UserRole;
import com.example.examportal.repository.UserRepository;
import com.example.examportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;
    @PostMapping("/create")
    public User creatUser(@RequestBody User user) throws Exception{
        Set<UserRole> roles = new HashSet<>();

        Role role = new Role();
        role.setRoleID(2L);
        role.setRoleName("User");

        UserRole userRole = new UserRole();
        userRole.setRole(role);
        userRole.setUser(user);

        roles.add(userRole);

    return this.userService.creatUser(user,roles);
    }

    @GetMapping("/get")
    List<User> getUser(){
        return userRepository.findAll() ;
    }
    @GetMapping("/get/{username}")
    User getUserByName(@PathVariable("username") String username){
        return this.userService.findUser(username);
    }
}

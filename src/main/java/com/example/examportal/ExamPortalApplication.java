package com.example.examportal;

import com.example.examportal.model.Role;
import com.example.examportal.model.User;
import com.example.examportal.model.UserRole;
import com.example.examportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamPortalApplication {

    @Autowired
    private UserService userService;
    public static void main(String[] args) {
        SpringApplication.run(ExamPortalApplication.class, args);

    }

//    public void run(String... args) throws Exception{
//        System.out.printf("========================");
//
//        User user = new User();
//        user.setUsername("fdfdfdsf");
//        user.setPhone("admin");
//
//        Role role = new Role();
//        role.setRoleID(1L);
//        role.setRoleName("admin");
//
//        Set<UserRole>  userRoles = new HashSet<>();
//        UserRole userRole = new UserRole();
//        userRole.setRole(role);
//        userRoles.add(userRole);
//
//        User user1 = this.userService.creatUser(user,userRoles);
//        System.out.println(user1.getUsername());
//        System.out.println(user1.getPhone());
//
//
//
//




//    }

}

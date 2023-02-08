package com.example.examportal.service.impl;

import com.example.examportal.model.User;
import com.example.examportal.model.UserRole;
import com.example.examportal.repository.RoleRepository;
import com.example.examportal.repository.UserRepository;
import com.example.examportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public User creatUser(User user, Set<UserRole> userRole) {
       User local = this.userRepository.findByUsername(user.getUsername());
       if(local!=null){
           System.out.println("User is ready");
       }
       else{
           for(UserRole ur:userRole){
               roleRepository.save(ur.getRole());
           }

           user.getUserRole().addAll(userRole);
           local = this.userRepository.save(user);

       }
       return local;
    }

    @Override
    public User findUser(String username) {
        return this.userRepository.findByUsername(username);
    }
}

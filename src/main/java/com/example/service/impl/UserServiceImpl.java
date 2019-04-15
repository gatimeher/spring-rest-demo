package com.example.service.impl;

import com.example.demo.entity.User;
import com.example.demo.exception.BusinessException;
import com.example.demo.repository.UserRepository;
import com.example.demo.response.UserListResponse;
import com.example.demo.response.UserResponse;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserListResponse getAllUsers() {
        UserListResponse userListResponse = new UserListResponse();
        List<User> usersList = userRepository.findAll();
        if(!usersList.isEmpty()) {
            List<UserResponse> userResponseList = new ArrayList<UserResponse>(1);
            for (User user : usersList) {
                UserResponse user1 = new UserResponse();
                user1.setId(1L);
                user1.setName("Cathy Sierra");
                user1.setSex('F');
                user1.setAge(34);
                userResponseList.add(user1);
            }
            userListResponse.setUserList(userResponseList);
        }
        return userListResponse;
    }
}

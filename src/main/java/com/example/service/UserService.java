package com.example.service;

import com.example.demo.exception.BusinessException;
import com.example.demo.response.UserListResponse;

public interface UserService {

    public UserListResponse getAllUsers();
}

package com.example.demo.endpoint;

import com.example.demo.exception.BusinessException;
import com.example.demo.response.UserListResponse;
import com.example.service.UserService;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    Environment env;

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserListResponse> getAllUsers() {
        UserListResponse userListResponse = userService.getAllUsers();
        return new ResponseEntity<UserListResponse>(userListResponse, HttpStatus.OK);
    }


}

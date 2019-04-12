package com.example.demo.endpoint;

import com.example.demo.response.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getAllUsers(){
        User user = new User();
        user.setId(1L);
        user.setName("Gati K Meher");
        user.setSex('M');
        user.setAge(37);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}

package com.user.user.controller;

import com.user.user.ValueObject.ResponseTemplateVo;
import com.user.user.dto.UserDto;
import com.user.user.model.User;
import com.user.user.services.Impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @PostMapping("/save")
    public User saveUser(@RequestBody UserDto userDto){
       return userService.saveUser(userDto);
    }

    @GetMapping("getDepAndUser/{userid}")
    public ResponseTemplateVo getUserWithDepartment(@PathVariable Integer userid){
        return userService.getUserWithDepartment(userid);
    }
}

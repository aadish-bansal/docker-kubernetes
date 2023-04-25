package com.nagarro.dockerKubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserController {
    @GetMapping("/test")
    public String test(){
        return "Test from user controller ";
    }
}

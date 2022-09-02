package com.testdeploymaven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("/helloUser")
    public String helloUser(){
        return "hello user";
    }
}

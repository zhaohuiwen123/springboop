package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/hello")
    public  String  login(){
        return "hello world!!";
    }
    @RequestMapping("closed")
    public String  close(){
        return "This door is closed!";
    }
}
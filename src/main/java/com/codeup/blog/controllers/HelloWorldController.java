package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")

    @ResponseBody

    public String hello(){
        return "Hello, World!!";
    }

    @ResponseBody

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name){

        return "Hello, " + name + "!!";
    }

    @GetMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String helloFullName(@PathVariable String firstName, @PathVariable String lastName) {

        return "<h3>Hello " + firstName + " " + lastName + " !!</h3>";

    }

    @GetMapping("/square/{number}")
    @ResponseBody
    public Double square(@PathVariable Double number) {

        return number *number;

    }
}

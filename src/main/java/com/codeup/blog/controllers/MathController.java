package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{number1}/{number}")
    @ResponseBody
    public Integer add(@PathVariable Integer number1, @PathVariable Integer number) {
        return  number1 + number;

    }
    @GetMapping("/subtract/{number1}/{number}")
    @ResponseBody
    public Integer subtract(@PathVariable Integer number1, @PathVariable Integer number) {
        return  number1 - number;

    }
    @GetMapping("/multiply/{number1}/{number}")
    @ResponseBody
    public Integer multiply(@PathVariable Integer number1, @PathVariable Integer number) {
        return  number1 * number;

    }
    @GetMapping("/divide/{number1}/{number}")
    @ResponseBody
    public Double divide(@PathVariable Double number1, @PathVariable Double number) {
        return  number1 / number;

    }


}

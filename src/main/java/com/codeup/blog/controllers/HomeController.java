package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

   @GetMapping("/")
   @ResponseBody
    public String showLandingMapping(){
        return "<h2>This is the landing page!</h2>";
    }


}

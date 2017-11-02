package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostsController {

@GetMapping("/posts")
@ResponseBody
    public String posts() {
        return  "<h3>posts index page</h3>";

    }
    @GetMapping("/posts/{id}")
    @ResponseBody
    public String posts(@PathVariable long id) {
        return  "<h3>view an individual post</h3>";

    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String posts(@PathVariable String create) {
        return  "<h3>view the form for creating a post</h3>";

    }
//    @PostMapping("/posts/create")
//    @ResponseBody
//    public String posts(String create) {
//        return  "<h3>create a new post</h3>";
//
//    }
}

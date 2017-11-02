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
    public String showAll() {
        return  "posts index page";

    }
    @GetMapping("/posts/{id}")
    @ResponseBody
    public String showPost(@PathVariable long id) {
        return  "view an individual post" + id;

    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String showCreateForms() {
        return  "view the form for creating a post";

    }
    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(String create) {
        return  "create a new post";

    }
}

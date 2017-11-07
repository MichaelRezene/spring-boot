package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import com.codeup.blog.services.PostSvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostsController {
    private final PostSvc service;

    // Constructor injection
    public PostsController(PostSvc service) {
        this.service = service;
    }

    @GetMapping("/posts")
    public String showAll(Model vModel) {
        vModel.addAttribute("posts", service.findAll());
        return "posts/index";
    }

    // auto-boxing
    //int -> Integer
    // long -> Long

    // Extra step needed in this case
    // Boxing is not automatic
    // int -> long -> Long X
    // This is fine because it doesn't interact with objects, they're both primitive types
    // int -> long

    @GetMapping("/posts/{id}")
    public String showPost(@PathVariable int id, Model vModel){
        vModel.addAttribute("post", service.findById(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String showCreateForm(){
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post posts){
        service.save(posts);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String veiwFormEdit(@PathVariable int id, Model vModel){
        Post existingPost = service.findById(id);
        vModel.addAttribute("post", existingPost);

        return "posts/edit";
    }

}
package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import com.codeup.blog.repository.PostRepository;
import com.codeup.blog.services.PostSvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostsController {
    private final PostSvc service;

    // Constructor injection
    public PostsController(PostSvc service, PostRepository postDao) {
        this.service = service;
    }

    @GetMapping("/posts")
    public String showAll(Model vModel) {
        vModel.addAttribute("posts", service.findAll());
        return "posts/index";
    


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
package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;

import com.codeup.blog.repository.PostRepository;
import com.codeup.blog.services.PostSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostsController {
    private final PostSvc service;
//    private final PostRepository postDao;




    // Constructor injection
   @Autowired
    public PostsController(PostSvc service) {
        this.service = service;
//        this.postDao = postDao;
    }

    @GetMapping("/posts")
    public String showAll(Model vModel) {
//        List<Post> = service.findAll();
        vModel.addAttribute("posts", service.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String showPost(@PathVariable int id, Model vModel){
        vModel.addAttribute("post", service.findById(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String showCreateForm(Model vModel){
        vModel.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post){
        service.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String showEditForm(Model vModel, @PathVariable long id){
        Post existingPost = service.findById(id);
        vModel.addAttribute("post", existingPost);
//        service.save(post);
        return "posts/edit";

    }

    @PostMapping("/posts/{id}/edit")
    public String createEditForm(Model vModel, @PathVariable long id){
        Post existingPost = service.findById(id);
        vModel.addAttribute("post", existingPost);
        return "posts/edit";

    }

}


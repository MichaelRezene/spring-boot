package com.codeup.blog.controllers;

import com.codeup.blog.models.User;
import com.codeup.blog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private PasswordEncoder encoder;
    private UserRepository repository;

    public UserController(PasswordEncoder encoder, UserRepository repository) {
        this.encoder = encoder;
        this.repository = repository;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "users/registration";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        // TODO: Validate the input
        // TODO: double check that the username is not already in use
        String hash = encoder.encode(user.getPassword());
        user.setPassword(hash);
        repository.save(user);
        return "redirect:/login";
    }
}

package com.stackroute.controller;

import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
    @ModelAttribute("user")
    public User setUpUserForm(){
        return new User();
    }

    @GetMapping("/")
    public String registration(){
        return "loginForm";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user, Model model){
       // System.out.println("Email" + user.getEmail());
        model.addAttribute("message","User saved successfully");
        return "success";
    }
}

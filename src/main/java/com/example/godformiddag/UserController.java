package com.example.godformiddag;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UserController {

    @GetMapping("/register")
    public String visForm(Model model){
        model.addAttribute("user", new User());
        return "register";

    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model){
        model.addAttribute("user", user);
        return "success";

    }

    @GetMapping("/success")
    public String success(){
        return "index";
    }


}

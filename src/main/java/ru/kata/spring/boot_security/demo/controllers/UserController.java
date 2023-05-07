package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.spring.boot_security.demo.entities.User;

@Controller
public class UserController {

    @GetMapping("/user")
    public String user(Model model, Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        model.addAttribute("current_user", user);
        return "user";
    }
}

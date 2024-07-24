package web.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String showUserHomePage(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user", user);
        return "user/home";
    }
}
package com.franktran.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String viewLogin(User user, Model model) {
        model.addAttribute("user", user);
        return "login";
    }

    @RequestMapping("submit-login")
    public String submitLogin(User user, Model model) {
        model.addAttribute("user", user);
        return "welcome";
    }
}

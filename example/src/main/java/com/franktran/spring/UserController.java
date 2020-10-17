package com.franktran.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String viewUser(Model model) {
        User ty = new User("teo", "123");
//        model.addAttribute("ty", ty);
        return "user";
    }

    @RequestMapping("/register")
    public String register(User ty) {
//        System.out.println(user);
        return "user";
    }
}

package com.franktran.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class HelloWorldController {

    @RequestMapping("/product")
    public String viewProduct() {
        return "product";
    }

    @RequestMapping("/about")
    public String viewAbout() {
        return "about";
    }

    @RequestMapping("/hello")
    public String display(String user, String pass, Model model) {
//        if ("admin".equals(username) && "123".equals(password)) {
//            String message = "Hello " + username;
//            model.addAttribute("message", message);
            return "viewpage";
//        } else {
//            String msg="Sorry "+ username+". You entered an incorrect password";
//            model.addAttribute("message", msg);
//            return "errorpage";
//        }
    }
}

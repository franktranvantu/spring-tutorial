package com.franktran.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String viewHello() {
        return "hello";
    }

    @RequestMapping("/hello-again")
    public String redirect() {
        return "hello-again";
    }
}

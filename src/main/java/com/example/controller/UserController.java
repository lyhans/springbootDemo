package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/index")
    public ModelAndView index(ModelAndView modelAndView) {
        System.out.println("sdafsdf");
//        modelAndView.setViewName("test");
        return modelAndView;
    }
}
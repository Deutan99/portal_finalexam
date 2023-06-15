package com.boot.portal_final.v1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/templates")
public class HomeCtrl {

    @GetMapping({"/" , "/home"})
    public String doHome() {

        return "/home/home";
    }


    @GetMapping("/home2")
    public String doHome2Get() {
        System.out.println("Get");
        return "/home/home";
    }

    @PostMapping("/home2")
    public String doHome2Post() {
        System.out.println("Post");
        return "/home/home";
    }
}

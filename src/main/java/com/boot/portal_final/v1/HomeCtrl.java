package com.boot.portal_final.v1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {

    @RequestMapping({"/" , "/templates/home"})
    public String doHome() {

        return "/home/home";
    }
}
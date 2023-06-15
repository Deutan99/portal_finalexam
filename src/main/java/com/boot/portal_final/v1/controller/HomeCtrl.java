package com.boot.portal_final.v1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/templates")
public class HomeCtrl {

    @GetMapping({"/" , "/home"})
    public String doHome() {

        return "/home/home";
    }

    @GetMapping("/rest2")
    @ResponseBody
    public  String doRest2() {

        String strHtml = "<html><body> Hi Rest , Controller + ResponseBody !!! <hr> Hi. </body></html>";
        return strHtml;
    }
}

package com.boot.portal_final.v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberCtrl {

    @RequestMapping("/templates/member")
    public String doMember() {
        return "/member/member";
    }
}

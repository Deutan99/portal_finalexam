package com.boot.portal_final.v1.controller;

import com.boot.portal_final.v1.service.MenuSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class MenuCtrl {

    @Autowired
    MenuSvc menuSvc;
    @RequestMapping("/templates/menu")
    public String doMenu(Model model) {


        //Data 만들기, List, Map
        List<Map<String, Object>> list = menuSvc.doList();



        //Data 송부
        model.addAttribute("list", list);
        model.addAttribute("hello", "=========== MenuCon ===========");
        return "/menu/menu";
    }
}

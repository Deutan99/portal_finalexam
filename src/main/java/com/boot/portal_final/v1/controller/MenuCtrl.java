package com.boot.portal_final.v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class MenuCtrl {

    @RequestMapping("/templates/menu")
    public String doMenu(Model model) {

        //Data 만들기, List, Map
        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> map = new HashMap<>();
        map.put("No", "1");
        map.put("name", "아이스아메리카노");
        map.put("kind", "커피");
        map.put("price", "5,000");
        map.put("reg_day", "2023.06.15");
        map.put("mod_day", "2023.06.15");
        list.add(map);

        map.clear();

        map.put("No", "2");
        map.put("name", "카푸치노");
        map.put("kind", "커피");
        map.put("price", "6,000");
        map.put("reg_day", "2023.06.15");
        map.put("mod_day", "2023.06.15");
        list.add(map);


        //Data 송부
        model.addAttribute("list", list);
        model.addAttribute("hello", "=========== MenuCon ===========");
        return "/menu/menu";
    }
}

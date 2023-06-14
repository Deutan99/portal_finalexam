package com.boot.portal_final.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuCtrl {

    @RequestMapping("/templates/menu")
    public String doMenu() {
        return "/menu/menu";
    }
}

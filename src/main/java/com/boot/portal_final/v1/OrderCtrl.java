package com.boot.portal_final.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderCtrl {

    @RequestMapping("/templates/order")
    public String doOrder() {
        return "/order/order";
    }
}

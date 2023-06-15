package com.boot.portal_final.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHome {
    @GetMapping("templates/rest")
    public String doRest() {
        String strHtml = "Hello Rest Controller";

        strHtml = "<html>\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "</head>" +
                "</body>" +
                "<h1> * 회사 직원 리스트 </h1>\n" +
                "<h1> HTML -> Servlet </h1>\n" +
                "<p>\n" +
                "<table style='width: 400px;'>\n" +
                "<a href='./index.html'> * Home </a>\n" +
                "<p>\n" +
                "<table style='width: 400px;'>\n" +
                "<tr style = 'height: 40px'>\n" +
                "<th>No</th>\n" +
                "<th align='center'>이름</th>\n" +
                "<th align='center'>나이</th>\n" +
                "<th align='center'>등록일자</th>\n" +
                "</tr>\n";

        return strHtml;
    }
}

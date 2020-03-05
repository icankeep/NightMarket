package com.passer.nightmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        Object user = request.getSession().getAttribute("user");
        if (user == null) {
            return "login";
        }
        return "index";
    }
}

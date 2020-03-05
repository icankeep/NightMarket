package com.passer.nightmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
@Controller
public class MyLogInfoController {
    @RequestMapping("/myLogInfo")
    public String myLogInfo(Model model) {
        return "myLogInfo";
    }
}

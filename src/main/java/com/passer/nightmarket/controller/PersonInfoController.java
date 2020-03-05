package com.passer.nightmarket.controller;

import com.passer.nightmarket.service.UserService;
import generator.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
@Controller
public class PersonInfoController {
    @Autowired
    private UserService userService;

    @RequestMapping("/personInfo")
    public String personInfo(HttpServletRequest request) {
        if (request.getSession().getAttribute("user") == null) {
            return "login";
        }
        return "personInfo";
    }

    @RequestMapping("/personInfo/submit")
    public String personInfoSubmit(HttpServletRequest request) {
        String realName = request.getParameter("realName");
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("address");

        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return "login";
        }
        user.setRealName(realName);
        user.setAddress(address);
        user.setPhoneNumber(phoneNumber);
        userService.updateUser(user);

        return "index";
    }

}

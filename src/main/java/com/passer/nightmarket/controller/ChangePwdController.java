package com.passer.nightmarket.controller;

import com.passer.nightmarket.service.UserService;
import generator.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
@Controller
public class ChangePwdController {
    @Autowired
    private UserService userService;

    @RequestMapping("/changePwd")
    public String changePwd(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return "login";
        }
        return "changePwd";
    }

    @RequestMapping("/changePwd/submit")
    public ModelAndView changePwdSubmit(HttpServletRequest request) {
        String oldPassword = request.getParameter("oldPassword");
        String newPassword1 = request.getParameter("newPassword1");
        String newPassword2 = request.getParameter("newPassword2");

        ModelAndView modelAndView = new ModelAndView();
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            modelAndView.setViewName("login");
            return modelAndView;
        }
        if (user.getPassword().equals(oldPassword)) {
            user.setPassword(newPassword1);
            userService.updateUser(user);
            modelAndView.setViewName("main");
            return modelAndView;
        }
        modelAndView.setViewName("changePwd");
        return modelAndView;
    }
}

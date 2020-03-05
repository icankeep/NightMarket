package com.passer.nightmarket.controller;

import com.passer.nightmarket.service.UserService;
import generator.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/login/submit")
    public ModelAndView submit(HttpServletRequest request) {
        // 提取表单数据
        String nickname = request.getParameter("nickname");
        String password = request.getParameter("password");
        String isAdmin = request.getParameter("isAdmin");

        User user = userService.selectByLoginInfo(nickname, "true".equals(isAdmin) ? true : false, password);
        ModelAndView modelAndView = new ModelAndView();
        if (user == null) {
            modelAndView.setViewName("login");
            return modelAndView;
        }
        modelAndView.setViewName("redirect:/");
        request.getSession().setAttribute("user", user);
        return modelAndView;
    }
}

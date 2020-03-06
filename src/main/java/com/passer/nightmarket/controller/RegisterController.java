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
 * @version：2020/3/3
 */
@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/register/submit")
    public ModelAndView submitData(HttpServletRequest request) {
        // 提取表单数据
        String nickname = request.getParameter("nickname");
        String realName = request.getParameter("realName");
        String address = request.getParameter("address");
        String password = request.getParameter("password1");
        String phoneNumber = request.getParameter("phoneNumber");
        String userType = request.getParameter("userType");

        // 封装数据
        User user = new User();
        user.setNickname(nickname);
        user.setPassword(password);
        user.setIsAdmin("0".equals(userType) ? false : true);
        user.setAddress(address);
        user.setPhoneNumber(phoneNumber);
        user.setRealName(realName);

        userService.insertUser(user);

        ModelAndView modelAndView = new ModelAndView();
        request.getSession().setAttribute("user", user);
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }

}

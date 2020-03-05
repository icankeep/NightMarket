package com.passer.nightmarket.controller;

import com.passer.nightmarket.service.UserService;
import generator.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
@Controller
public class SearchController {

    @Autowired
    private UserService userService;

    @RequestMapping("/search/user")
    public ModelAndView searchUser(HttpServletRequest request) {
        String nickname = request.getParameter("nickname");
        User user = userService.selectByNickname(nickname);
        ModelAndView modelAndView = new ModelAndView();
        if (user == null) {
            modelAndView.setViewName("searchUser");
            modelAndView.addObject("msg", "没有此用户！");
            return modelAndView;
        }
        modelAndView.setViewName("searchUserInfo");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}

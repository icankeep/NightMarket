package com.passer.nightmarket.controller;

import com.passer.nightmarket.service.StallApplyService;
import com.passer.nightmarket.service.StallService;
import com.passer.nightmarket.service.UserStallService;
import generator.Stall;
import generator.StallApply;
import generator.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
@Controller
public class StallController {

    @Autowired
    private StallService stallService;

    @Autowired
    private StallApplyService stallApplyService;

    @Autowired
    private UserStallService userStallService;

    @RequestMapping("/stall")
    public ModelAndView stall(@RequestParam int userId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("stall");
        modelAndView.addObject("stalls", stallService.selectStallList(userId));
        modelAndView.addObject("userId", userId);
        return modelAndView;
    }

    @RequestMapping("/stall/apply")
    public String stall(@RequestParam int userId, @RequestParam int stallId, @RequestParam int otherUserId) {
        stallApplyService.insertStallApply(userId, stallId, Byte.valueOf("0"), otherUserId);
        return "main";
    }

    @RequestMapping("/stall/add")
    public String add(HttpSession session) {
        User user = (User)session.getAttribute("user");
        if (user == null) {
            return "";
        }
        if (user.getIsAdmin()) {
            return "addStall";
        }
        return "searchUser";
    }

    @RequestMapping("/stall/add/submit")
    public ModelAndView submit(HttpServletRequest request) {
        // 提取表单数据
        String stallName = request.getParameter("stallName");
        String stallAddress = request.getParameter("stallAddress");
        String stallInfo = request.getParameter("stallInfo");
        String stallRent = request.getParameter("stallRent");

        Stall stall = new Stall();
        stall.setStallAddress(stallAddress);
        stall.setStallName(stallName);
        stall.setStallInfo(stallInfo);
        stall.setStallRent(new BigDecimal(stallRent));
        User user = (User) request.getSession().getAttribute("user");
        stall.setUserId(user.getUserId());
        stall.setUserNickname(user.getNickname());
        stall.setIsRented(false);
        stallService.insertStall(stall);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }
}

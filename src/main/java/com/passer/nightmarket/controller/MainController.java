package com.passer.nightmarket.controller;


import com.passer.nightmarket.model.MainPageData;
import com.passer.nightmarket.service.NoticeService;
import com.passer.nightmarket.service.StallApplyService;
import com.passer.nightmarket.service.StallService;
import com.passer.nightmarket.service.UserPayService;
import generator.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/3
 */
@Controller
public class MainController {
    @Autowired
    private StallService stallService;
    @Autowired
    private StallApplyService stallApplyService;
    @Autowired
    private UserPayService userPayService;
    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/main")
    public ModelAndView main(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");

        // 获取摊位数据
        User user = (User)session.getAttribute("user");
        List<Stall> stalls = stallService.selectStallList(user.getUserId());
        modelAndView.addObject("stalls", stalls);

        // 获取摊位申请的相关数据
        List<StallApply> stallApplies = stallApplyService.selectStallApplyList(user.getUserId());
        modelAndView.addObject("stallApplies", stallApplies);

        // 获取收入支出的支付数据
        List<UserPay> userPays = userPayService.selectUserPayList(user.getUserId());
        modelAndView.addObject("userPays", userPays);

        // 获取公告的相关数据
        List<Notice> notices = noticeService.selectAboutUserNoticeList(user.getUserId());
        modelAndView.addObject("notices", notices);

        MainPageData data = new MainPageData();
        if(user.getIsAdmin()) {
            // 填充页面数据
            data.setApplyCount(stallApplyService.getToDoApplyCount(user));
            data.setIncomeMoney(userPayService.getCountMoney(user));
            data.setRemainStallCount(stallService.countRemainStall(user.getUserId()));
            data.setStallCount(stalls.size());

            data.setRentStallCount(0);
            data.setPayMoney(new BigDecimal("0"));
            data.setBeforePayStallCount(0);
        } else {
            data.setIncomeMoney(new BigDecimal("0"));
            data.setRemainStallCount(0);
            data.setStallCount(0);

            data.setApplyCount(stallApplyService.getToDoApplyCount(user));
            data.setRentStallCount(stalls.size());
            data.setPayMoney(userPayService.getCountMoney(user));
            data.setBeforePayStallCount(stallApplyService.getToDoApplyCount(user));
        }
        modelAndView.addObject("data", data);
        return modelAndView;
    }

}

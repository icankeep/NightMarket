package com.passer.nightmarket.controller;

import com.passer.nightmarket.service.*;
import generator.*;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
@Controller
public class ApplyController {
    @Autowired
    private StallApplyService stallApplyService;

    @Autowired
    private RelationService relationService;

    @Autowired
    private UserDao userDao;

    @Autowired
    private StallService stallService;

    @Autowired
    private UserStallService userStallService;

    @Autowired
    private UserService userService;

    @Autowired
    private UserPayService userPayService;

    @RequestMapping("/apply")
    public ModelAndView apply(HttpSession session) {
        User user = (User) session.getAttribute("user");
        List<StallApply> stallApplies = stallApplyService.selectStallApplyList(user.getUserId());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("apply");
        modelAndView.addObject("stallApplies", stallApplies);
        return modelAndView;
    }

    @RequestMapping("/apply/deal")
    public ModelAndView deal(HttpSession session, @RequestParam int applyId) {
        User user = (User) session.getAttribute("user");
        StallApply stallApply = stallApplyService.selectByPrimaryKey(applyId);
        User otherUser = userDao.selectByPrimaryKey(stallApply.getOtherUserId() == user.getUserId() ? stallApply.getUserId() : stallApply.getOtherUserId());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("stallApply", stallApply);
        modelAndView.addObject("otherUser", otherUser);
        modelAndView.setViewName("agreeApply");
        return modelAndView;
    }

    @RequestMapping("/apply/agree")
    public String deal(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        int applyId = Integer.valueOf(request.getParameter("applyId"));
        StallApply stallApply = stallApplyService.selectByPrimaryKey(applyId);
        if (user.getIsAdmin()) {
            if (Byte.valueOf("0").equals(stallApply.getStallStatus())) {
                String alipayAccount = request.getParameter("alipayAccount");
                stallApply.setPayAccount(alipayAccount);
                stallApply.setStallStatus(Byte.valueOf("1"));
                stallApplyService.updateStallApply(stallApply);
                return "index";
            } else {
                // 确认租赁关系
                relationService.insertRelation(stallApply.getUserId(), stallApply.getOtherUserId());
                // 更新摊位表
                stallService.updateStallRented(stallApply.getStallId());
                // 更新支付表
                Stall stall = stallService.selectByPrimaryKey(stallApply.getStallId());
                UserPay userPay = new UserPay();
                int incomeUserId = user.getUserId();
                String incomeUserNickname = user.getNickname();
                BigDecimal payMoney = stall.getStallRent();
                String payComment = stallApply.getPayAccount() + "###" + stallApply.getPayOrderNumber();
                userPay.setIncomeUserId(incomeUserId);
                userPay.setIncomeUserNickname(incomeUserNickname);
                userPay.setPayMoney(payMoney);
                userPay.setPayComment(payComment);
                userPay.setPayTime(LocalDateTime.now());
                if (stallApply.getUserId() == user.getUserId()) {
                    userPay.setPayUserId(stallApply.getOtherUserId());
                    User otherUser = userService.selectByPrimaryKey(stallApply.getOtherUserId());
                    userPay.setPayUserNickname(otherUser.getNickname());
                } else {
                    userPay.setPayUserId(stallApply.getUserId());
                    User otherUser = userService.selectByPrimaryKey(stallApply.getUserId());
                    userPay.setPayUserNickname(otherUser.getNickname());
                }
                userPayService.insertUserPay(userPay);
                // 更新租户摊位表
                userStallService.insertUserStall(stallApply.getUserId(), stallApply.getStallId());
                // 删除stall_apply表中数据
                stallApplyService.deleteStallApply(stallApply);
            }
        }
        String payOrderNumber = request.getParameter("payOrderNumber");
        stallApply.setPayOrderNumber(payOrderNumber);
        stallApply.setStallStatus(Byte.valueOf("2"));
        stallApplyService.updateStallApply(stallApply);
        return "index";
    }
}

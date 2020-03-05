package com.passer.nightmarket.controller;

import com.passer.nightmarket.service.NoticeService;
import generator.Notice;
import generator.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/5
 */
@Controller
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/releaseNotice")
    public String releaseNotice() {
        return "releaseNotice";
    }

    @RequestMapping("/notice/release")
    public String releaseNotice(HttpServletRequest request) {
        String noticeTitle = request.getParameter("noticeTitle");
        String noticeContent = request.getParameter("noticeContent");
        User user = (User) request.getSession().getAttribute("user");
        noticeService.insertNotice(noticeTitle, noticeContent, user);
        return "index";
    }
}

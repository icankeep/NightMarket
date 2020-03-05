package com.passer.nightmarket.service;

import generator.Notice;
import generator.NoticeDao;
import generator.NoticeExample;
import generator.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
@Service
public class NoticeService {
    @Autowired
    private NoticeDao noticeDao;
    @Autowired
    private RelationService relationService;

    public int insertNotice(Notice notice) {
        if (notice == null) return -1;
        noticeDao.insert(notice);
        return notice.getNoticeId();
    }

    /**
     * 找到与此人有关的所有公告，自己发布的，或者已经建立Relation关系的人发布的
     * @param userId
     * @return
     */
    public List<Notice> selectAboutUserNoticeList(int userId) {
        List<Integer> userIds = relationService.selectRelationOtherOne(userId);
        userIds.add(userId);
        List<Notice> notices = new ArrayList<>();
        for (Integer id : userIds) {
            notices.addAll(selectNoticeList(id));
        }
        return notices;
    }

    /**
     * 找到此人发布的公告
     * @param userId
     * @return
     */
    public List<Notice> selectNoticeList(int userId) {
        NoticeExample noticeExample = new NoticeExample();
        noticeExample.createCriteria().andReleaseUserIdEqualTo(userId);
        return noticeDao.selectByExample(noticeExample);
    }

    public Notice insertNotice(String noticeTitle, String noticeContent, User releaseUser) {
        Notice notice = new Notice();
        notice.setNoticeContent(noticeContent);
        notice.setNoticeTitle(noticeTitle);
        notice.setReleaseUserId(releaseUser.getUserId());
        notice.setReleaseUserNickname(releaseUser.getNickname());
        notice.setReleaseTime(LocalDateTime.now());
        noticeDao.insert(notice);
        return notice;
    }
}

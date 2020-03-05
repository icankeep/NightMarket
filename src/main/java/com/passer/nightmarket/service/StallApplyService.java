package com.passer.nightmarket.service;

import generator.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
@Service
public class StallApplyService {

    @Autowired
    private StallApplyDao stallApplyDao;

    @Autowired
    private UserDao userDao;

    public List<StallApply> selectStallApplyList(int userId) {
        StallApplyExample stallApplyExample = new StallApplyExample();
        stallApplyExample.createCriteria().andOtherUserIdEqualTo(userId);
        List<StallApply> stallApplies = stallApplyDao.selectByExample(stallApplyExample);
        stallApplyExample = new StallApplyExample();
        stallApplyExample.createCriteria().andUserIdEqualTo(userId);
        stallApplies.addAll(stallApplyDao.selectByExample(stallApplyExample));
        return stallApplies;
    }

    /**
     * 返回待处理的申请个数
     * @param user
     * @return
     */
    public int getToDoApplyCount(User user) {
        if (user.getIsAdmin()) {
            List<Byte> status = new ArrayList<>();
            status.add(Byte.valueOf("0"));
            status.add(Byte.valueOf("2"));
            StallApplyExample stallApplyExample = new StallApplyExample();
            stallApplyExample.createCriteria().andStallStatusIn(status);
            return (int) stallApplyDao.countByExample(stallApplyExample);
        }
        StallApplyExample stallApplyExample = new StallApplyExample();
        stallApplyExample.createCriteria().andStallStatusEqualTo(Byte.valueOf("1"));
        return (int) stallApplyDao.countByExample(stallApplyExample);

    }

    public StallApply insertStallApply(Integer userId, Integer stallId, Byte stallStatus, Integer otherUserId) {
        StallApply stallApply = new StallApply();

        stallApply.setApplyTime(LocalDateTime.now());
        stallApply.setStallId(stallId);
        stallApply.setUserId(userId);
        stallApply.setStallStatus(stallStatus);
        stallApply.setOtherUserId(otherUserId);
        User user = userDao.selectByPrimaryKey(userId);
        User otherUser = userDao.selectByPrimaryKey(otherUserId);
        stallApply.setUserNickname(user.getNickname());
        stallApply.setOtherUserNickname(otherUser.getNickname());
        stallApplyDao.insert(stallApply);
        return stallApply;
    }

    public StallApply selectByPrimaryKey(Integer applyId) {
        return stallApplyDao.selectByPrimaryKey(applyId);
    }

    public void updateStallApply(StallApply stallApply) {
        stallApplyDao.updateByPrimaryKey(stallApply);
    }

    public void deleteStallApply(StallApply stallApply) {
        stallApplyDao.deleteByPrimaryKey(stallApply.getApplyId());
    }
}

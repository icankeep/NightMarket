package com.passer.nightmarket.service;

import generator.*;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
@Service
public class StallService {
    @Autowired
    private StallDao stallDao;

    @Autowired
    private UserStallDao userStallDao;

    @Autowired
    private UserDao userDao;

    public int insertStall(Stall stall) {
        if (stall == null) return -1;
        stallDao.insert(stall);
        return stall.getStallId();
    }

    /**
     * 获取与用户id有关的摊位
     * @param userId
     * @return
     */
    public List<Stall> selectStallList(int userId) {
        User user = userDao.selectByPrimaryKey(userId);
        if (user == null) return null;
        if (user.getIsAdmin()) {
            StallExample stallExample = new StallExample();
            stallExample.createCriteria().andUserIdEqualTo(userId);
            return stallDao.selectByExample(stallExample);
        }
        UserStallExample userStallExample = new UserStallExample();
        userStallExample.createCriteria().andUserIdEqualTo(userId);
        List<UserStall> userStalls = userStallDao.selectByExample(userStallExample);
        List<Stall> stalls = new ArrayList<>();
        for (UserStall userStall : userStalls) {
            stalls.add(stallDao.selectByPrimaryKey(userStall.getStallId()));
        }
        return stalls;
    }

    /**
     * 获取管理员未出租的摊位
     * @param userId
     * @return
     */
    public int countRemainStall(int userId) {
        StallExample stallExample = new StallExample();
        stallExample.createCriteria().andUserIdEqualTo(userId).andIsRentedEqualTo(false);
        return (int)stallDao.countByExample(stallExample);
    }

    public void updateStallRented(int stallId) {
        Stall stall = selectByPrimaryKey(stallId);
        stall.setIsRented(true);
        stall.setRentedTime(LocalDateTime.now());
        stallDao.updateByPrimaryKey(stall);
    }

    public Stall selectByPrimaryKey(int stallId) {
        return stallDao.selectByPrimaryKey(stallId);
    }

}

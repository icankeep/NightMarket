package com.passer.nightmarket.service;

import generator.UserStall;
import generator.UserStallDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
@Service
public class UserStallService {
    @Autowired
    private UserStallDao userStallDao;

    public int insertUserStall(int userId, int stallId) {
        UserStall userStall = new UserStall();
        userStall.setStallId(stallId);
        userStall.setUserId(userId);
        userStallDao.insert(userStall);
        return userStall.getUserStallId();
    }
}

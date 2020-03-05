package com.passer.nightmarket.service;

import generator.User;
import generator.UserDao;
import generator.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public int insertUser(User user) {
        if (user == null) return -1;
        userDao.insert(user);
        return user.getUserId();
    }

    public User selectByLoginInfo(String nickname, Boolean isAdmin, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNicknameEqualTo(nickname).andIsAdminEqualTo(isAdmin).andPasswordEqualTo(password);
        List<User> users = userDao.selectByExample(userExample);
        return users.size() == 0 ? null : users.get(0);
    }

    public void updateUser(User user) {
        if (user == null) return;
        userDao.updateByPrimaryKey(user);
    }

    public User selectByNickname(String nickname) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNicknameEqualTo(nickname);
        List<User> users = userDao.selectByExample(userExample);
        return users.size() == 0 ? null : users.get(0);
    }

    public User selectByPrimaryKey(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }
}

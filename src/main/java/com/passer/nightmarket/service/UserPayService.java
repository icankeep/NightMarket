package com.passer.nightmarket.service;

import generator.User;
import generator.UserPay;
import generator.UserPayDao;
import generator.UserPayExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
@Service
public class UserPayService {
    @Autowired
    private UserPayDao userPayDao;

    /**
     * 获取与此用户有关的所有支付记录
     * @param userId
     * @return
     */
    public List<UserPay> selectUserPayList(int userId) {
        UserPayExample userPayExample = new UserPayExample();
        userPayExample.createCriteria().andPayUserIdEqualTo(userId);
        List<UserPay> userPays = userPayDao.selectByExample(userPayExample);
        userPayExample = new UserPayExample();
        userPayExample.createCriteria().andIncomeUserIdEqualTo(userId);
        userPays.addAll(userPayDao.selectByExample(userPayExample));
        return userPays;
    }

    /**
     * 为避免重写生成文件,选用较低效率的方法获取总额
     * @param
     * @return
     */
    public BigDecimal getCountMoney(User user) {
        BigDecimal countMoney = new BigDecimal("0.00");
        UserPayExample userPayExample = new UserPayExample();
        if (user.getIsAdmin()) {
            userPayExample.createCriteria().andIncomeUserIdEqualTo(user.getUserId());
            List<UserPay> userPays = userPayDao.selectByExample(userPayExample);
            for (UserPay userPay : userPays) {
                countMoney = countMoney.add(userPay.getPayMoney());
            }
        } else {
            userPayExample.createCriteria().andPayUserIdEqualTo(user.getUserId());
            List<UserPay> userPays = userPayDao.selectByExample(userPayExample);
            for (UserPay userPay : userPays) {
                countMoney = countMoney.subtract(userPay.getPayMoney());
            }
        }
        return countMoney;
    }

    public UserPay insertUserPay(UserPay userPay) {
        userPayDao.insert(userPay);
        return userPay;
    }
}

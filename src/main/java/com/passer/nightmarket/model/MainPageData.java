package com.passer.nightmarket.model;

import generator.User;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
public class MainPageData {

    // --- 共用数据 ---
    // 待通过的申请
    private Integer applyCount = 0;


    // --- 管理员页面数据 ---
    // 摊位总数
    private Integer stallCount = 0;

    // 剩余未出租的摊位数
    private Integer remainStallCount = 0;

    // 摊位资金收入
    private BigDecimal incomeMoney = new BigDecimal("0");


    // --- 租户页面数据 ---
    // 租用的摊位总数
    private Integer rentStallCount = 0;

    // 待付款的摊位
    private Integer beforePayStallCount = 0;

    // 租用摊位的支出
    private BigDecimal payMoney = new BigDecimal("0");

    /**
     * 租户
     * @param rentStallCount
     * @param beforePayStallCount
     * @param payMoney
     * @param applyCount
     */
    public MainPageData(Integer rentStallCount, Integer beforePayStallCount, BigDecimal payMoney, Integer applyCount) {
        this.applyCount = applyCount;
        this.rentStallCount = rentStallCount;
        this.beforePayStallCount = beforePayStallCount;
        this.payMoney = payMoney;
    }

    /**
     * 管理员
     * @param applyCount
     * @param stallCount
     * @param remainStallCount
     * @param incomeMoney
     */
    public MainPageData(Integer applyCount, Integer stallCount, Integer remainStallCount, BigDecimal incomeMoney) {
        this.applyCount = applyCount;
        this.stallCount = stallCount;
        this.remainStallCount = remainStallCount;
        this.incomeMoney = incomeMoney;
    }

    public MainPageData(Integer applyCount, Integer stallCount, Integer remainStallCount, BigDecimal incomeMoney, Integer rentStallCount, Integer beforePayStallCount, BigDecimal payMoney) {
        this.applyCount = applyCount;
        this.stallCount = stallCount;
        this.remainStallCount = remainStallCount;
        this.incomeMoney = incomeMoney;
        this.rentStallCount = rentStallCount;
        this.beforePayStallCount = beforePayStallCount;
        this.payMoney = payMoney;
    }

    public MainPageData() {
    }

    public Integer getApplyCount() {
        return applyCount;
    }

    public void setApplyCount(Integer applyCount) {
        this.applyCount = applyCount;
    }

    public Integer getStallCount() {
        return stallCount;
    }

    public void setStallCount(Integer stallCount) {
        this.stallCount = stallCount;
    }

    public Integer getRemainStallCount() {
        return remainStallCount;
    }

    public void setRemainStallCount(Integer remainStallCount) {
        this.remainStallCount = remainStallCount;
    }

    public BigDecimal getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(BigDecimal incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    public Integer getRentStallCount() {
        return rentStallCount;
    }

    public void setRentStallCount(Integer rentStallCount) {
        this.rentStallCount = rentStallCount;
    }

    public Integer getBeforePayStallCount() {
        return beforePayStallCount;
    }

    public void setBeforePayStallCount(Integer beforePayStallCount) {
        this.beforePayStallCount = beforePayStallCount;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }
}

package generator;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * stall_apply
 * @author 
 */
public class StallApply implements Serializable {
    private Integer applyId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 摊位id
     */
    private Integer stallId;

    /**
     * 摊位状态(0待管理员通过申请,1待租户付款,2待管理员确认已付款)
     */
    private Byte stallStatus;

    private LocalDateTime applyTime;

    /**
     * 收到申请的用户id
     */
    private Integer otherUserId;

    /**
     * 该申请是否已被处理
     */
    private Boolean deal;

    private String userNickname;

    private String otherUserNickname;

    /**
     * 支付账号
     */
    private String payAccount;

    /**
     * 支付订单号
     */
    private String payOrderNumber;

    private static final long serialVersionUID = 1L;

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStallId() {
        return stallId;
    }

    public void setStallId(Integer stallId) {
        this.stallId = stallId;
    }

    public Byte getStallStatus() {
        return stallStatus;
    }

    public void setStallStatus(Byte stallStatus) {
        this.stallStatus = stallStatus;
    }

    public LocalDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(LocalDateTime applyTime) {
        this.applyTime = applyTime;
    }

    public Integer getOtherUserId() {
        return otherUserId;
    }

    public void setOtherUserId(Integer otherUserId) {
        this.otherUserId = otherUserId;
    }

    public Boolean getDeal() {
        return deal;
    }

    public void setDeal(Boolean deal) {
        this.deal = deal;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getOtherUserNickname() {
        return otherUserNickname;
    }

    public void setOtherUserNickname(String otherUserNickname) {
        this.otherUserNickname = otherUserNickname;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public String getPayOrderNumber() {
        return payOrderNumber;
    }

    public void setPayOrderNumber(String payOrderNumber) {
        this.payOrderNumber = payOrderNumber;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StallApply other = (StallApply) that;
        return (this.getApplyId() == null ? other.getApplyId() == null : this.getApplyId().equals(other.getApplyId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getStallId() == null ? other.getStallId() == null : this.getStallId().equals(other.getStallId()))
            && (this.getStallStatus() == null ? other.getStallStatus() == null : this.getStallStatus().equals(other.getStallStatus()))
            && (this.getApplyTime() == null ? other.getApplyTime() == null : this.getApplyTime().equals(other.getApplyTime()))
            && (this.getOtherUserId() == null ? other.getOtherUserId() == null : this.getOtherUserId().equals(other.getOtherUserId()))
            && (this.getDeal() == null ? other.getDeal() == null : this.getDeal().equals(other.getDeal()))
            && (this.getUserNickname() == null ? other.getUserNickname() == null : this.getUserNickname().equals(other.getUserNickname()))
            && (this.getOtherUserNickname() == null ? other.getOtherUserNickname() == null : this.getOtherUserNickname().equals(other.getOtherUserNickname()))
            && (this.getPayAccount() == null ? other.getPayAccount() == null : this.getPayAccount().equals(other.getPayAccount()))
            && (this.getPayOrderNumber() == null ? other.getPayOrderNumber() == null : this.getPayOrderNumber().equals(other.getPayOrderNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApplyId() == null) ? 0 : getApplyId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getStallId() == null) ? 0 : getStallId().hashCode());
        result = prime * result + ((getStallStatus() == null) ? 0 : getStallStatus().hashCode());
        result = prime * result + ((getApplyTime() == null) ? 0 : getApplyTime().hashCode());
        result = prime * result + ((getOtherUserId() == null) ? 0 : getOtherUserId().hashCode());
        result = prime * result + ((getDeal() == null) ? 0 : getDeal().hashCode());
        result = prime * result + ((getUserNickname() == null) ? 0 : getUserNickname().hashCode());
        result = prime * result + ((getOtherUserNickname() == null) ? 0 : getOtherUserNickname().hashCode());
        result = prime * result + ((getPayAccount() == null) ? 0 : getPayAccount().hashCode());
        result = prime * result + ((getPayOrderNumber() == null) ? 0 : getPayOrderNumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applyId=").append(applyId);
        sb.append(", userId=").append(userId);
        sb.append(", stallId=").append(stallId);
        sb.append(", stallStatus=").append(stallStatus);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", otherUserId=").append(otherUserId);
        sb.append(", deal=").append(deal);
        sb.append(", userNickname=").append(userNickname);
        sb.append(", otherUserNickname=").append(otherUserNickname);
        sb.append(", payAccount=").append(payAccount);
        sb.append(", payOrderNumber=").append(payOrderNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
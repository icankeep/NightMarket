package generator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * user_pay
 * @author 
 */
public class UserPay implements Serializable {
    private Integer payId;

    /**
     * 支付的用户id
     */
    private Integer payUserId;

    /**
     * 变化金额
     */
    private BigDecimal payMoney;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;

    /**
     * 来源或者去向备注
     */
    private String payComment;

    /**
     * 收入的用户id
     */
    private Integer incomeUserId;

    /**
     * 支付的用户昵称
     */
    private String payUserNickname;

    /**
     * 收入的用户昵称
     */
    private String incomeUserNickname;

    private static final long serialVersionUID = 1L;

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public Integer getPayUserId() {
        return payUserId;
    }

    public void setPayUserId(Integer payUserId) {
        this.payUserId = payUserId;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public String getPayComment() {
        return payComment;
    }

    public void setPayComment(String payComment) {
        this.payComment = payComment;
    }

    public Integer getIncomeUserId() {
        return incomeUserId;
    }

    public void setIncomeUserId(Integer incomeUserId) {
        this.incomeUserId = incomeUserId;
    }

    public String getPayUserNickname() {
        return payUserNickname;
    }

    public void setPayUserNickname(String payUserNickname) {
        this.payUserNickname = payUserNickname;
    }

    public String getIncomeUserNickname() {
        return incomeUserNickname;
    }

    public void setIncomeUserNickname(String incomeUserNickname) {
        this.incomeUserNickname = incomeUserNickname;
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
        UserPay other = (UserPay) that;
        return (this.getPayId() == null ? other.getPayId() == null : this.getPayId().equals(other.getPayId()))
            && (this.getPayUserId() == null ? other.getPayUserId() == null : this.getPayUserId().equals(other.getPayUserId()))
            && (this.getPayMoney() == null ? other.getPayMoney() == null : this.getPayMoney().equals(other.getPayMoney()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getPayComment() == null ? other.getPayComment() == null : this.getPayComment().equals(other.getPayComment()))
            && (this.getIncomeUserId() == null ? other.getIncomeUserId() == null : this.getIncomeUserId().equals(other.getIncomeUserId()))
            && (this.getPayUserNickname() == null ? other.getPayUserNickname() == null : this.getPayUserNickname().equals(other.getPayUserNickname()))
            && (this.getIncomeUserNickname() == null ? other.getIncomeUserNickname() == null : this.getIncomeUserNickname().equals(other.getIncomeUserNickname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPayId() == null) ? 0 : getPayId().hashCode());
        result = prime * result + ((getPayUserId() == null) ? 0 : getPayUserId().hashCode());
        result = prime * result + ((getPayMoney() == null) ? 0 : getPayMoney().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getPayComment() == null) ? 0 : getPayComment().hashCode());
        result = prime * result + ((getIncomeUserId() == null) ? 0 : getIncomeUserId().hashCode());
        result = prime * result + ((getPayUserNickname() == null) ? 0 : getPayUserNickname().hashCode());
        result = prime * result + ((getIncomeUserNickname() == null) ? 0 : getIncomeUserNickname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", payId=").append(payId);
        sb.append(", payUserId=").append(payUserId);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", payTime=").append(payTime);
        sb.append(", payComment=").append(payComment);
        sb.append(", incomeUserId=").append(incomeUserId);
        sb.append(", payUserNickname=").append(payUserNickname);
        sb.append(", incomeUserNickname=").append(incomeUserNickname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
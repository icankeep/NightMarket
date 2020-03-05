package generator;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * log
 * @author 
 */
public class Log implements Serializable {
    private Integer logId;

    /**
     * 操作人id
     */
    private Integer operateUserId;

    /**
     * 操作时间
     */
    private LocalDateTime operateTime;

    /**
     * 操作事件类型(0登录，1发布公告，2提交申请，3通过申请，4确认付款发送付款订单号，5确认收款，6修改密码，7修改个人信息)
     */
    private Byte operateType;

    /**
     * 登录ip
     */
    private String loginIp;

    /**
     * 操作人昵称
     */
    private String operateUserNickname;

    private static final long serialVersionUID = 1L;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getOperateUserId() {
        return operateUserId;
    }

    public void setOperateUserId(Integer operateUserId) {
        this.operateUserId = operateUserId;
    }

    public LocalDateTime getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(LocalDateTime operateTime) {
        this.operateTime = operateTime;
    }

    public Byte getOperateType() {
        return operateType;
    }

    public void setOperateType(Byte operateType) {
        this.operateType = operateType;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getOperateUserNickname() {
        return operateUserNickname;
    }

    public void setOperateUserNickname(String operateUserNickname) {
        this.operateUserNickname = operateUserNickname;
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
        Log other = (Log) that;
        return (this.getLogId() == null ? other.getLogId() == null : this.getLogId().equals(other.getLogId()))
            && (this.getOperateUserId() == null ? other.getOperateUserId() == null : this.getOperateUserId().equals(other.getOperateUserId()))
            && (this.getOperateTime() == null ? other.getOperateTime() == null : this.getOperateTime().equals(other.getOperateTime()))
            && (this.getOperateType() == null ? other.getOperateType() == null : this.getOperateType().equals(other.getOperateType()))
            && (this.getLoginIp() == null ? other.getLoginIp() == null : this.getLoginIp().equals(other.getLoginIp()))
            && (this.getOperateUserNickname() == null ? other.getOperateUserNickname() == null : this.getOperateUserNickname().equals(other.getOperateUserNickname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogId() == null) ? 0 : getLogId().hashCode());
        result = prime * result + ((getOperateUserId() == null) ? 0 : getOperateUserId().hashCode());
        result = prime * result + ((getOperateTime() == null) ? 0 : getOperateTime().hashCode());
        result = prime * result + ((getOperateType() == null) ? 0 : getOperateType().hashCode());
        result = prime * result + ((getLoginIp() == null) ? 0 : getLoginIp().hashCode());
        result = prime * result + ((getOperateUserNickname() == null) ? 0 : getOperateUserNickname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", operateUserId=").append(operateUserId);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", operateType=").append(operateType);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", operateUserNickname=").append(operateUserNickname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
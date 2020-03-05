package generator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * stall
 * @author 
 */
public class Stall implements Serializable {
    private Integer stallId;

    /**
     * 摊位号，摊位名，用于用户辨识
     */
    private String stallName;

    /**
     * 摊位地址
     */
    private String stallAddress;

    /**
     * 摊位描述信息
     */
    private String stallInfo;

    /**
     * 租金
     */
    private BigDecimal stallRent;

    /**
     * 是否已被出租
     */
    private Boolean isRented;

    /**
     * 若出租，出租的时间，未被出租为空
     */
    private LocalDateTime rentedTime;

    /**
     * 摊位所属管理员id
     */
    private Integer userId;

    /**
     * 所属管理员昵称
     */
    private String userNickname;

    private static final long serialVersionUID = 1L;

    public Integer getStallId() {
        return stallId;
    }

    public void setStallId(Integer stallId) {
        this.stallId = stallId;
    }

    public String getStallName() {
        return stallName;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public String getStallAddress() {
        return stallAddress;
    }

    public void setStallAddress(String stallAddress) {
        this.stallAddress = stallAddress;
    }

    public String getStallInfo() {
        return stallInfo;
    }

    public void setStallInfo(String stallInfo) {
        this.stallInfo = stallInfo;
    }

    public BigDecimal getStallRent() {
        return stallRent;
    }

    public void setStallRent(BigDecimal stallRent) {
        this.stallRent = stallRent;
    }

    public Boolean getIsRented() {
        return isRented;
    }

    public void setIsRented(Boolean isRented) {
        this.isRented = isRented;
    }

    public LocalDateTime getRentedTime() {
        return rentedTime;
    }

    public void setRentedTime(LocalDateTime rentedTime) {
        this.rentedTime = rentedTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
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
        Stall other = (Stall) that;
        return (this.getStallId() == null ? other.getStallId() == null : this.getStallId().equals(other.getStallId()))
            && (this.getStallName() == null ? other.getStallName() == null : this.getStallName().equals(other.getStallName()))
            && (this.getStallAddress() == null ? other.getStallAddress() == null : this.getStallAddress().equals(other.getStallAddress()))
            && (this.getStallInfo() == null ? other.getStallInfo() == null : this.getStallInfo().equals(other.getStallInfo()))
            && (this.getStallRent() == null ? other.getStallRent() == null : this.getStallRent().equals(other.getStallRent()))
            && (this.getIsRented() == null ? other.getIsRented() == null : this.getIsRented().equals(other.getIsRented()))
            && (this.getRentedTime() == null ? other.getRentedTime() == null : this.getRentedTime().equals(other.getRentedTime()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserNickname() == null ? other.getUserNickname() == null : this.getUserNickname().equals(other.getUserNickname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStallId() == null) ? 0 : getStallId().hashCode());
        result = prime * result + ((getStallName() == null) ? 0 : getStallName().hashCode());
        result = prime * result + ((getStallAddress() == null) ? 0 : getStallAddress().hashCode());
        result = prime * result + ((getStallInfo() == null) ? 0 : getStallInfo().hashCode());
        result = prime * result + ((getStallRent() == null) ? 0 : getStallRent().hashCode());
        result = prime * result + ((getIsRented() == null) ? 0 : getIsRented().hashCode());
        result = prime * result + ((getRentedTime() == null) ? 0 : getRentedTime().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserNickname() == null) ? 0 : getUserNickname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stallId=").append(stallId);
        sb.append(", stallName=").append(stallName);
        sb.append(", stallAddress=").append(stallAddress);
        sb.append(", stallInfo=").append(stallInfo);
        sb.append(", stallRent=").append(stallRent);
        sb.append(", isRented=").append(isRented);
        sb.append(", rentedTime=").append(rentedTime);
        sb.append(", userId=").append(userId);
        sb.append(", userNickname=").append(userNickname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
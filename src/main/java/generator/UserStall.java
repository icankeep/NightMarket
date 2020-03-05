package generator;

import java.io.Serializable;

/**
 * user_stall
 * @author 
 */
public class UserStall implements Serializable {
    private Integer userStallId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 摊位id
     */
    private Integer stallId;

    private static final long serialVersionUID = 1L;

    public Integer getUserStallId() {
        return userStallId;
    }

    public void setUserStallId(Integer userStallId) {
        this.userStallId = userStallId;
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
        UserStall other = (UserStall) that;
        return (this.getUserStallId() == null ? other.getUserStallId() == null : this.getUserStallId().equals(other.getUserStallId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getStallId() == null ? other.getStallId() == null : this.getStallId().equals(other.getStallId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserStallId() == null) ? 0 : getUserStallId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getStallId() == null) ? 0 : getStallId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userStallId=").append(userStallId);
        sb.append(", userId=").append(userId);
        sb.append(", stallId=").append(stallId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
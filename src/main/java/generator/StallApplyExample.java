package generator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StallApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public StallApplyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    public void setForUpdate(Boolean forUpdate) {
        this.forUpdate = forUpdate;
    }

    public Boolean getForUpdate() {
        return forUpdate;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andApplyIdIsNull() {
            addCriterion("apply_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(Integer value) {
            addCriterion("apply_id =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(Integer value) {
            addCriterion("apply_id <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(Integer value) {
            addCriterion("apply_id >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_id >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(Integer value) {
            addCriterion("apply_id <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("apply_id <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<Integer> values) {
            addCriterion("apply_id in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<Integer> values) {
            addCriterion("apply_id not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("apply_id between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_id not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andStallIdIsNull() {
            addCriterion("stall_id is null");
            return (Criteria) this;
        }

        public Criteria andStallIdIsNotNull() {
            addCriterion("stall_id is not null");
            return (Criteria) this;
        }

        public Criteria andStallIdEqualTo(Integer value) {
            addCriterion("stall_id =", value, "stallId");
            return (Criteria) this;
        }

        public Criteria andStallIdNotEqualTo(Integer value) {
            addCriterion("stall_id <>", value, "stallId");
            return (Criteria) this;
        }

        public Criteria andStallIdGreaterThan(Integer value) {
            addCriterion("stall_id >", value, "stallId");
            return (Criteria) this;
        }

        public Criteria andStallIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stall_id >=", value, "stallId");
            return (Criteria) this;
        }

        public Criteria andStallIdLessThan(Integer value) {
            addCriterion("stall_id <", value, "stallId");
            return (Criteria) this;
        }

        public Criteria andStallIdLessThanOrEqualTo(Integer value) {
            addCriterion("stall_id <=", value, "stallId");
            return (Criteria) this;
        }

        public Criteria andStallIdIn(List<Integer> values) {
            addCriterion("stall_id in", values, "stallId");
            return (Criteria) this;
        }

        public Criteria andStallIdNotIn(List<Integer> values) {
            addCriterion("stall_id not in", values, "stallId");
            return (Criteria) this;
        }

        public Criteria andStallIdBetween(Integer value1, Integer value2) {
            addCriterion("stall_id between", value1, value2, "stallId");
            return (Criteria) this;
        }

        public Criteria andStallIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stall_id not between", value1, value2, "stallId");
            return (Criteria) this;
        }

        public Criteria andStallStatusIsNull() {
            addCriterion("stall_status is null");
            return (Criteria) this;
        }

        public Criteria andStallStatusIsNotNull() {
            addCriterion("stall_status is not null");
            return (Criteria) this;
        }

        public Criteria andStallStatusEqualTo(Byte value) {
            addCriterion("stall_status =", value, "stallStatus");
            return (Criteria) this;
        }

        public Criteria andStallStatusNotEqualTo(Byte value) {
            addCriterion("stall_status <>", value, "stallStatus");
            return (Criteria) this;
        }

        public Criteria andStallStatusGreaterThan(Byte value) {
            addCriterion("stall_status >", value, "stallStatus");
            return (Criteria) this;
        }

        public Criteria andStallStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("stall_status >=", value, "stallStatus");
            return (Criteria) this;
        }

        public Criteria andStallStatusLessThan(Byte value) {
            addCriterion("stall_status <", value, "stallStatus");
            return (Criteria) this;
        }

        public Criteria andStallStatusLessThanOrEqualTo(Byte value) {
            addCriterion("stall_status <=", value, "stallStatus");
            return (Criteria) this;
        }

        public Criteria andStallStatusIn(List<Byte> values) {
            addCriterion("stall_status in", values, "stallStatus");
            return (Criteria) this;
        }

        public Criteria andStallStatusNotIn(List<Byte> values) {
            addCriterion("stall_status not in", values, "stallStatus");
            return (Criteria) this;
        }

        public Criteria andStallStatusBetween(Byte value1, Byte value2) {
            addCriterion("stall_status between", value1, value2, "stallStatus");
            return (Criteria) this;
        }

        public Criteria andStallStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("stall_status not between", value1, value2, "stallStatus");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(LocalDateTime value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(LocalDateTime value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(LocalDateTime value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(LocalDateTime value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<LocalDateTime> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<LocalDateTime> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdIsNull() {
            addCriterion("other_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdIsNotNull() {
            addCriterion("other_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdEqualTo(Integer value) {
            addCriterion("other_user_id =", value, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdNotEqualTo(Integer value) {
            addCriterion("other_user_id <>", value, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdGreaterThan(Integer value) {
            addCriterion("other_user_id >", value, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_user_id >=", value, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdLessThan(Integer value) {
            addCriterion("other_user_id <", value, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("other_user_id <=", value, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdIn(List<Integer> values) {
            addCriterion("other_user_id in", values, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdNotIn(List<Integer> values) {
            addCriterion("other_user_id not in", values, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdBetween(Integer value1, Integer value2) {
            addCriterion("other_user_id between", value1, value2, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("other_user_id not between", value1, value2, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andDealIsNull() {
            addCriterion("deal is null");
            return (Criteria) this;
        }

        public Criteria andDealIsNotNull() {
            addCriterion("deal is not null");
            return (Criteria) this;
        }

        public Criteria andDealEqualTo(Boolean value) {
            addCriterion("deal =", value, "deal");
            return (Criteria) this;
        }

        public Criteria andDealNotEqualTo(Boolean value) {
            addCriterion("deal <>", value, "deal");
            return (Criteria) this;
        }

        public Criteria andDealGreaterThan(Boolean value) {
            addCriterion("deal >", value, "deal");
            return (Criteria) this;
        }

        public Criteria andDealGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deal >=", value, "deal");
            return (Criteria) this;
        }

        public Criteria andDealLessThan(Boolean value) {
            addCriterion("deal <", value, "deal");
            return (Criteria) this;
        }

        public Criteria andDealLessThanOrEqualTo(Boolean value) {
            addCriterion("deal <=", value, "deal");
            return (Criteria) this;
        }

        public Criteria andDealIn(List<Boolean> values) {
            addCriterion("deal in", values, "deal");
            return (Criteria) this;
        }

        public Criteria andDealNotIn(List<Boolean> values) {
            addCriterion("deal not in", values, "deal");
            return (Criteria) this;
        }

        public Criteria andDealBetween(Boolean value1, Boolean value2) {
            addCriterion("deal between", value1, value2, "deal");
            return (Criteria) this;
        }

        public Criteria andDealNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deal not between", value1, value2, "deal");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNull() {
            addCriterion("user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("user_nickname =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("user_nickname <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("user_nickname >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nickname >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("user_nickname <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("user_nickname <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("user_nickname like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("user_nickname not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("user_nickname in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("user_nickname not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("user_nickname between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("user_nickname not between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andOtherUserNicknameIsNull() {
            addCriterion("other_user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andOtherUserNicknameIsNotNull() {
            addCriterion("other_user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andOtherUserNicknameEqualTo(String value) {
            addCriterion("other_user_nickname =", value, "otherUserNickname");
            return (Criteria) this;
        }

        public Criteria andOtherUserNicknameNotEqualTo(String value) {
            addCriterion("other_user_nickname <>", value, "otherUserNickname");
            return (Criteria) this;
        }

        public Criteria andOtherUserNicknameGreaterThan(String value) {
            addCriterion("other_user_nickname >", value, "otherUserNickname");
            return (Criteria) this;
        }

        public Criteria andOtherUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("other_user_nickname >=", value, "otherUserNickname");
            return (Criteria) this;
        }

        public Criteria andOtherUserNicknameLessThan(String value) {
            addCriterion("other_user_nickname <", value, "otherUserNickname");
            return (Criteria) this;
        }

        public Criteria andOtherUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("other_user_nickname <=", value, "otherUserNickname");
            return (Criteria) this;
        }

        public Criteria andOtherUserNicknameLike(String value) {
            addCriterion("other_user_nickname like", value, "otherUserNickname");
            return (Criteria) this;
        }

        public Criteria andOtherUserNicknameNotLike(String value) {
            addCriterion("other_user_nickname not like", value, "otherUserNickname");
            return (Criteria) this;
        }

        public Criteria andOtherUserNicknameIn(List<String> values) {
            addCriterion("other_user_nickname in", values, "otherUserNickname");
            return (Criteria) this;
        }

        public Criteria andOtherUserNicknameNotIn(List<String> values) {
            addCriterion("other_user_nickname not in", values, "otherUserNickname");
            return (Criteria) this;
        }

        public Criteria andOtherUserNicknameBetween(String value1, String value2) {
            addCriterion("other_user_nickname between", value1, value2, "otherUserNickname");
            return (Criteria) this;
        }

        public Criteria andOtherUserNicknameNotBetween(String value1, String value2) {
            addCriterion("other_user_nickname not between", value1, value2, "otherUserNickname");
            return (Criteria) this;
        }

        public Criteria andPayAccountIsNull() {
            addCriterion("pay_account is null");
            return (Criteria) this;
        }

        public Criteria andPayAccountIsNotNull() {
            addCriterion("pay_account is not null");
            return (Criteria) this;
        }

        public Criteria andPayAccountEqualTo(String value) {
            addCriterion("pay_account =", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotEqualTo(String value) {
            addCriterion("pay_account <>", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountGreaterThan(String value) {
            addCriterion("pay_account >", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountGreaterThanOrEqualTo(String value) {
            addCriterion("pay_account >=", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLessThan(String value) {
            addCriterion("pay_account <", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLessThanOrEqualTo(String value) {
            addCriterion("pay_account <=", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLike(String value) {
            addCriterion("pay_account like", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotLike(String value) {
            addCriterion("pay_account not like", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountIn(List<String> values) {
            addCriterion("pay_account in", values, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotIn(List<String> values) {
            addCriterion("pay_account not in", values, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountBetween(String value1, String value2) {
            addCriterion("pay_account between", value1, value2, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotBetween(String value1, String value2) {
            addCriterion("pay_account not between", value1, value2, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayOrderNumberIsNull() {
            addCriterion("pay_order_number is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderNumberIsNotNull() {
            addCriterion("pay_order_number is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderNumberEqualTo(String value) {
            addCriterion("pay_order_number =", value, "payOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPayOrderNumberNotEqualTo(String value) {
            addCriterion("pay_order_number <>", value, "payOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPayOrderNumberGreaterThan(String value) {
            addCriterion("pay_order_number >", value, "payOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPayOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pay_order_number >=", value, "payOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPayOrderNumberLessThan(String value) {
            addCriterion("pay_order_number <", value, "payOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPayOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("pay_order_number <=", value, "payOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPayOrderNumberLike(String value) {
            addCriterion("pay_order_number like", value, "payOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPayOrderNumberNotLike(String value) {
            addCriterion("pay_order_number not like", value, "payOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPayOrderNumberIn(List<String> values) {
            addCriterion("pay_order_number in", values, "payOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPayOrderNumberNotIn(List<String> values) {
            addCriterion("pay_order_number not in", values, "payOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPayOrderNumberBetween(String value1, String value2) {
            addCriterion("pay_order_number between", value1, value2, "payOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPayOrderNumberNotBetween(String value1, String value2) {
            addCriterion("pay_order_number not between", value1, value2, "payOrderNumber");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
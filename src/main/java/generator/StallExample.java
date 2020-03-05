package generator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public StallExample() {
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

        public Criteria andStallNameIsNull() {
            addCriterion("stall_name is null");
            return (Criteria) this;
        }

        public Criteria andStallNameIsNotNull() {
            addCriterion("stall_name is not null");
            return (Criteria) this;
        }

        public Criteria andStallNameEqualTo(String value) {
            addCriterion("stall_name =", value, "stallName");
            return (Criteria) this;
        }

        public Criteria andStallNameNotEqualTo(String value) {
            addCriterion("stall_name <>", value, "stallName");
            return (Criteria) this;
        }

        public Criteria andStallNameGreaterThan(String value) {
            addCriterion("stall_name >", value, "stallName");
            return (Criteria) this;
        }

        public Criteria andStallNameGreaterThanOrEqualTo(String value) {
            addCriterion("stall_name >=", value, "stallName");
            return (Criteria) this;
        }

        public Criteria andStallNameLessThan(String value) {
            addCriterion("stall_name <", value, "stallName");
            return (Criteria) this;
        }

        public Criteria andStallNameLessThanOrEqualTo(String value) {
            addCriterion("stall_name <=", value, "stallName");
            return (Criteria) this;
        }

        public Criteria andStallNameLike(String value) {
            addCriterion("stall_name like", value, "stallName");
            return (Criteria) this;
        }

        public Criteria andStallNameNotLike(String value) {
            addCriterion("stall_name not like", value, "stallName");
            return (Criteria) this;
        }

        public Criteria andStallNameIn(List<String> values) {
            addCriterion("stall_name in", values, "stallName");
            return (Criteria) this;
        }

        public Criteria andStallNameNotIn(List<String> values) {
            addCriterion("stall_name not in", values, "stallName");
            return (Criteria) this;
        }

        public Criteria andStallNameBetween(String value1, String value2) {
            addCriterion("stall_name between", value1, value2, "stallName");
            return (Criteria) this;
        }

        public Criteria andStallNameNotBetween(String value1, String value2) {
            addCriterion("stall_name not between", value1, value2, "stallName");
            return (Criteria) this;
        }

        public Criteria andStallAddressIsNull() {
            addCriterion("stall_address is null");
            return (Criteria) this;
        }

        public Criteria andStallAddressIsNotNull() {
            addCriterion("stall_address is not null");
            return (Criteria) this;
        }

        public Criteria andStallAddressEqualTo(String value) {
            addCriterion("stall_address =", value, "stallAddress");
            return (Criteria) this;
        }

        public Criteria andStallAddressNotEqualTo(String value) {
            addCriterion("stall_address <>", value, "stallAddress");
            return (Criteria) this;
        }

        public Criteria andStallAddressGreaterThan(String value) {
            addCriterion("stall_address >", value, "stallAddress");
            return (Criteria) this;
        }

        public Criteria andStallAddressGreaterThanOrEqualTo(String value) {
            addCriterion("stall_address >=", value, "stallAddress");
            return (Criteria) this;
        }

        public Criteria andStallAddressLessThan(String value) {
            addCriterion("stall_address <", value, "stallAddress");
            return (Criteria) this;
        }

        public Criteria andStallAddressLessThanOrEqualTo(String value) {
            addCriterion("stall_address <=", value, "stallAddress");
            return (Criteria) this;
        }

        public Criteria andStallAddressLike(String value) {
            addCriterion("stall_address like", value, "stallAddress");
            return (Criteria) this;
        }

        public Criteria andStallAddressNotLike(String value) {
            addCriterion("stall_address not like", value, "stallAddress");
            return (Criteria) this;
        }

        public Criteria andStallAddressIn(List<String> values) {
            addCriterion("stall_address in", values, "stallAddress");
            return (Criteria) this;
        }

        public Criteria andStallAddressNotIn(List<String> values) {
            addCriterion("stall_address not in", values, "stallAddress");
            return (Criteria) this;
        }

        public Criteria andStallAddressBetween(String value1, String value2) {
            addCriterion("stall_address between", value1, value2, "stallAddress");
            return (Criteria) this;
        }

        public Criteria andStallAddressNotBetween(String value1, String value2) {
            addCriterion("stall_address not between", value1, value2, "stallAddress");
            return (Criteria) this;
        }

        public Criteria andStallInfoIsNull() {
            addCriterion("stall_info is null");
            return (Criteria) this;
        }

        public Criteria andStallInfoIsNotNull() {
            addCriterion("stall_info is not null");
            return (Criteria) this;
        }

        public Criteria andStallInfoEqualTo(String value) {
            addCriterion("stall_info =", value, "stallInfo");
            return (Criteria) this;
        }

        public Criteria andStallInfoNotEqualTo(String value) {
            addCriterion("stall_info <>", value, "stallInfo");
            return (Criteria) this;
        }

        public Criteria andStallInfoGreaterThan(String value) {
            addCriterion("stall_info >", value, "stallInfo");
            return (Criteria) this;
        }

        public Criteria andStallInfoGreaterThanOrEqualTo(String value) {
            addCriterion("stall_info >=", value, "stallInfo");
            return (Criteria) this;
        }

        public Criteria andStallInfoLessThan(String value) {
            addCriterion("stall_info <", value, "stallInfo");
            return (Criteria) this;
        }

        public Criteria andStallInfoLessThanOrEqualTo(String value) {
            addCriterion("stall_info <=", value, "stallInfo");
            return (Criteria) this;
        }

        public Criteria andStallInfoLike(String value) {
            addCriterion("stall_info like", value, "stallInfo");
            return (Criteria) this;
        }

        public Criteria andStallInfoNotLike(String value) {
            addCriterion("stall_info not like", value, "stallInfo");
            return (Criteria) this;
        }

        public Criteria andStallInfoIn(List<String> values) {
            addCriterion("stall_info in", values, "stallInfo");
            return (Criteria) this;
        }

        public Criteria andStallInfoNotIn(List<String> values) {
            addCriterion("stall_info not in", values, "stallInfo");
            return (Criteria) this;
        }

        public Criteria andStallInfoBetween(String value1, String value2) {
            addCriterion("stall_info between", value1, value2, "stallInfo");
            return (Criteria) this;
        }

        public Criteria andStallInfoNotBetween(String value1, String value2) {
            addCriterion("stall_info not between", value1, value2, "stallInfo");
            return (Criteria) this;
        }

        public Criteria andStallRentIsNull() {
            addCriterion("stall_rent is null");
            return (Criteria) this;
        }

        public Criteria andStallRentIsNotNull() {
            addCriterion("stall_rent is not null");
            return (Criteria) this;
        }

        public Criteria andStallRentEqualTo(BigDecimal value) {
            addCriterion("stall_rent =", value, "stallRent");
            return (Criteria) this;
        }

        public Criteria andStallRentNotEqualTo(BigDecimal value) {
            addCriterion("stall_rent <>", value, "stallRent");
            return (Criteria) this;
        }

        public Criteria andStallRentGreaterThan(BigDecimal value) {
            addCriterion("stall_rent >", value, "stallRent");
            return (Criteria) this;
        }

        public Criteria andStallRentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stall_rent >=", value, "stallRent");
            return (Criteria) this;
        }

        public Criteria andStallRentLessThan(BigDecimal value) {
            addCriterion("stall_rent <", value, "stallRent");
            return (Criteria) this;
        }

        public Criteria andStallRentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stall_rent <=", value, "stallRent");
            return (Criteria) this;
        }

        public Criteria andStallRentIn(List<BigDecimal> values) {
            addCriterion("stall_rent in", values, "stallRent");
            return (Criteria) this;
        }

        public Criteria andStallRentNotIn(List<BigDecimal> values) {
            addCriterion("stall_rent not in", values, "stallRent");
            return (Criteria) this;
        }

        public Criteria andStallRentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stall_rent between", value1, value2, "stallRent");
            return (Criteria) this;
        }

        public Criteria andStallRentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stall_rent not between", value1, value2, "stallRent");
            return (Criteria) this;
        }

        public Criteria andIsRentedIsNull() {
            addCriterion("is_rented is null");
            return (Criteria) this;
        }

        public Criteria andIsRentedIsNotNull() {
            addCriterion("is_rented is not null");
            return (Criteria) this;
        }

        public Criteria andIsRentedEqualTo(Boolean value) {
            addCriterion("is_rented =", value, "isRented");
            return (Criteria) this;
        }

        public Criteria andIsRentedNotEqualTo(Boolean value) {
            addCriterion("is_rented <>", value, "isRented");
            return (Criteria) this;
        }

        public Criteria andIsRentedGreaterThan(Boolean value) {
            addCriterion("is_rented >", value, "isRented");
            return (Criteria) this;
        }

        public Criteria andIsRentedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_rented >=", value, "isRented");
            return (Criteria) this;
        }

        public Criteria andIsRentedLessThan(Boolean value) {
            addCriterion("is_rented <", value, "isRented");
            return (Criteria) this;
        }

        public Criteria andIsRentedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_rented <=", value, "isRented");
            return (Criteria) this;
        }

        public Criteria andIsRentedIn(List<Boolean> values) {
            addCriterion("is_rented in", values, "isRented");
            return (Criteria) this;
        }

        public Criteria andIsRentedNotIn(List<Boolean> values) {
            addCriterion("is_rented not in", values, "isRented");
            return (Criteria) this;
        }

        public Criteria andIsRentedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_rented between", value1, value2, "isRented");
            return (Criteria) this;
        }

        public Criteria andIsRentedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_rented not between", value1, value2, "isRented");
            return (Criteria) this;
        }

        public Criteria andRentedTimeIsNull() {
            addCriterion("rented_time is null");
            return (Criteria) this;
        }

        public Criteria andRentedTimeIsNotNull() {
            addCriterion("rented_time is not null");
            return (Criteria) this;
        }

        public Criteria andRentedTimeEqualTo(LocalDateTime value) {
            addCriterion("rented_time =", value, "rentedTime");
            return (Criteria) this;
        }

        public Criteria andRentedTimeNotEqualTo(LocalDateTime value) {
            addCriterion("rented_time <>", value, "rentedTime");
            return (Criteria) this;
        }

        public Criteria andRentedTimeGreaterThan(LocalDateTime value) {
            addCriterion("rented_time >", value, "rentedTime");
            return (Criteria) this;
        }

        public Criteria andRentedTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("rented_time >=", value, "rentedTime");
            return (Criteria) this;
        }

        public Criteria andRentedTimeLessThan(LocalDateTime value) {
            addCriterion("rented_time <", value, "rentedTime");
            return (Criteria) this;
        }

        public Criteria andRentedTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("rented_time <=", value, "rentedTime");
            return (Criteria) this;
        }

        public Criteria andRentedTimeIn(List<LocalDateTime> values) {
            addCriterion("rented_time in", values, "rentedTime");
            return (Criteria) this;
        }

        public Criteria andRentedTimeNotIn(List<LocalDateTime> values) {
            addCriterion("rented_time not in", values, "rentedTime");
            return (Criteria) this;
        }

        public Criteria andRentedTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("rented_time between", value1, value2, "rentedTime");
            return (Criteria) this;
        }

        public Criteria andRentedTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("rented_time not between", value1, value2, "rentedTime");
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
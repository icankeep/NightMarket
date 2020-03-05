package generator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserPayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public UserPayExample() {
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

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(Integer value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(Integer value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(Integer value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(Integer value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<Integer> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<Integer> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdIsNull() {
            addCriterion("pay_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPayUserIdIsNotNull() {
            addCriterion("pay_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayUserIdEqualTo(Integer value) {
            addCriterion("pay_user_id =", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdNotEqualTo(Integer value) {
            addCriterion("pay_user_id <>", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdGreaterThan(Integer value) {
            addCriterion("pay_user_id >", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_user_id >=", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdLessThan(Integer value) {
            addCriterion("pay_user_id <", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_user_id <=", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdIn(List<Integer> values) {
            addCriterion("pay_user_id in", values, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdNotIn(List<Integer> values) {
            addCriterion("pay_user_id not in", values, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_user_id between", value1, value2, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_user_id not between", value1, value2, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNull() {
            addCriterion("pay_money is null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNotNull() {
            addCriterion("pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyEqualTo(BigDecimal value) {
            addCriterion("pay_money =", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotEqualTo(BigDecimal value) {
            addCriterion("pay_money <>", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThan(BigDecimal value) {
            addCriterion("pay_money >", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_money >=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThan(BigDecimal value) {
            addCriterion("pay_money <", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_money <=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIn(List<BigDecimal> values) {
            addCriterion("pay_money in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotIn(List<BigDecimal> values) {
            addCriterion("pay_money not in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_money between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_money not between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(LocalDateTime value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(LocalDateTime value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(LocalDateTime value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(LocalDateTime value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<LocalDateTime> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<LocalDateTime> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayCommentIsNull() {
            addCriterion("pay_comment is null");
            return (Criteria) this;
        }

        public Criteria andPayCommentIsNotNull() {
            addCriterion("pay_comment is not null");
            return (Criteria) this;
        }

        public Criteria andPayCommentEqualTo(String value) {
            addCriterion("pay_comment =", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentNotEqualTo(String value) {
            addCriterion("pay_comment <>", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentGreaterThan(String value) {
            addCriterion("pay_comment >", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentGreaterThanOrEqualTo(String value) {
            addCriterion("pay_comment >=", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentLessThan(String value) {
            addCriterion("pay_comment <", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentLessThanOrEqualTo(String value) {
            addCriterion("pay_comment <=", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentLike(String value) {
            addCriterion("pay_comment like", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentNotLike(String value) {
            addCriterion("pay_comment not like", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentIn(List<String> values) {
            addCriterion("pay_comment in", values, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentNotIn(List<String> values) {
            addCriterion("pay_comment not in", values, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentBetween(String value1, String value2) {
            addCriterion("pay_comment between", value1, value2, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentNotBetween(String value1, String value2) {
            addCriterion("pay_comment not between", value1, value2, "payComment");
            return (Criteria) this;
        }

        public Criteria andIncomeUserIdIsNull() {
            addCriterion("income_user_id is null");
            return (Criteria) this;
        }

        public Criteria andIncomeUserIdIsNotNull() {
            addCriterion("income_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeUserIdEqualTo(Integer value) {
            addCriterion("income_user_id =", value, "incomeUserId");
            return (Criteria) this;
        }

        public Criteria andIncomeUserIdNotEqualTo(Integer value) {
            addCriterion("income_user_id <>", value, "incomeUserId");
            return (Criteria) this;
        }

        public Criteria andIncomeUserIdGreaterThan(Integer value) {
            addCriterion("income_user_id >", value, "incomeUserId");
            return (Criteria) this;
        }

        public Criteria andIncomeUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("income_user_id >=", value, "incomeUserId");
            return (Criteria) this;
        }

        public Criteria andIncomeUserIdLessThan(Integer value) {
            addCriterion("income_user_id <", value, "incomeUserId");
            return (Criteria) this;
        }

        public Criteria andIncomeUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("income_user_id <=", value, "incomeUserId");
            return (Criteria) this;
        }

        public Criteria andIncomeUserIdIn(List<Integer> values) {
            addCriterion("income_user_id in", values, "incomeUserId");
            return (Criteria) this;
        }

        public Criteria andIncomeUserIdNotIn(List<Integer> values) {
            addCriterion("income_user_id not in", values, "incomeUserId");
            return (Criteria) this;
        }

        public Criteria andIncomeUserIdBetween(Integer value1, Integer value2) {
            addCriterion("income_user_id between", value1, value2, "incomeUserId");
            return (Criteria) this;
        }

        public Criteria andIncomeUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("income_user_id not between", value1, value2, "incomeUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserNicknameIsNull() {
            addCriterion("pay_user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andPayUserNicknameIsNotNull() {
            addCriterion("pay_user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andPayUserNicknameEqualTo(String value) {
            addCriterion("pay_user_nickname =", value, "payUserNickname");
            return (Criteria) this;
        }

        public Criteria andPayUserNicknameNotEqualTo(String value) {
            addCriterion("pay_user_nickname <>", value, "payUserNickname");
            return (Criteria) this;
        }

        public Criteria andPayUserNicknameGreaterThan(String value) {
            addCriterion("pay_user_nickname >", value, "payUserNickname");
            return (Criteria) this;
        }

        public Criteria andPayUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_user_nickname >=", value, "payUserNickname");
            return (Criteria) this;
        }

        public Criteria andPayUserNicknameLessThan(String value) {
            addCriterion("pay_user_nickname <", value, "payUserNickname");
            return (Criteria) this;
        }

        public Criteria andPayUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("pay_user_nickname <=", value, "payUserNickname");
            return (Criteria) this;
        }

        public Criteria andPayUserNicknameLike(String value) {
            addCriterion("pay_user_nickname like", value, "payUserNickname");
            return (Criteria) this;
        }

        public Criteria andPayUserNicknameNotLike(String value) {
            addCriterion("pay_user_nickname not like", value, "payUserNickname");
            return (Criteria) this;
        }

        public Criteria andPayUserNicknameIn(List<String> values) {
            addCriterion("pay_user_nickname in", values, "payUserNickname");
            return (Criteria) this;
        }

        public Criteria andPayUserNicknameNotIn(List<String> values) {
            addCriterion("pay_user_nickname not in", values, "payUserNickname");
            return (Criteria) this;
        }

        public Criteria andPayUserNicknameBetween(String value1, String value2) {
            addCriterion("pay_user_nickname between", value1, value2, "payUserNickname");
            return (Criteria) this;
        }

        public Criteria andPayUserNicknameNotBetween(String value1, String value2) {
            addCriterion("pay_user_nickname not between", value1, value2, "payUserNickname");
            return (Criteria) this;
        }

        public Criteria andIncomeUserNicknameIsNull() {
            addCriterion("income_user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andIncomeUserNicknameIsNotNull() {
            addCriterion("income_user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeUserNicknameEqualTo(String value) {
            addCriterion("income_user_nickname =", value, "incomeUserNickname");
            return (Criteria) this;
        }

        public Criteria andIncomeUserNicknameNotEqualTo(String value) {
            addCriterion("income_user_nickname <>", value, "incomeUserNickname");
            return (Criteria) this;
        }

        public Criteria andIncomeUserNicknameGreaterThan(String value) {
            addCriterion("income_user_nickname >", value, "incomeUserNickname");
            return (Criteria) this;
        }

        public Criteria andIncomeUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("income_user_nickname >=", value, "incomeUserNickname");
            return (Criteria) this;
        }

        public Criteria andIncomeUserNicknameLessThan(String value) {
            addCriterion("income_user_nickname <", value, "incomeUserNickname");
            return (Criteria) this;
        }

        public Criteria andIncomeUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("income_user_nickname <=", value, "incomeUserNickname");
            return (Criteria) this;
        }

        public Criteria andIncomeUserNicknameLike(String value) {
            addCriterion("income_user_nickname like", value, "incomeUserNickname");
            return (Criteria) this;
        }

        public Criteria andIncomeUserNicknameNotLike(String value) {
            addCriterion("income_user_nickname not like", value, "incomeUserNickname");
            return (Criteria) this;
        }

        public Criteria andIncomeUserNicknameIn(List<String> values) {
            addCriterion("income_user_nickname in", values, "incomeUserNickname");
            return (Criteria) this;
        }

        public Criteria andIncomeUserNicknameNotIn(List<String> values) {
            addCriterion("income_user_nickname not in", values, "incomeUserNickname");
            return (Criteria) this;
        }

        public Criteria andIncomeUserNicknameBetween(String value1, String value2) {
            addCriterion("income_user_nickname between", value1, value2, "incomeUserNickname");
            return (Criteria) this;
        }

        public Criteria andIncomeUserNicknameNotBetween(String value1, String value2) {
            addCriterion("income_user_nickname not between", value1, value2, "incomeUserNickname");
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
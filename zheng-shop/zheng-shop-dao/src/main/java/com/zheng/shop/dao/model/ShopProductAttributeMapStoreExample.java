package com.zheng.shop.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShopProductAttributeMapStoreExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ShopProductAttributeMapStoreExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andMapkeyIdIsNull() {
            addCriterion("mapkey_id is null");
            return (Criteria) this;
        }

        public Criteria andMapkeyIdIsNotNull() {
            addCriterion("mapkey_id is not null");
            return (Criteria) this;
        }

        public Criteria andMapkeyIdEqualTo(String value) {
            addCriterion("mapkey_id =", value, "mapkeyId");
            return (Criteria) this;
        }

        public Criteria andMapkeyIdNotEqualTo(String value) {
            addCriterion("mapkey_id <>", value, "mapkeyId");
            return (Criteria) this;
        }

        public Criteria andMapkeyIdGreaterThan(String value) {
            addCriterion("mapkey_id >", value, "mapkeyId");
            return (Criteria) this;
        }

        public Criteria andMapkeyIdGreaterThanOrEqualTo(String value) {
            addCriterion("mapkey_id >=", value, "mapkeyId");
            return (Criteria) this;
        }

        public Criteria andMapkeyIdLessThan(String value) {
            addCriterion("mapkey_id <", value, "mapkeyId");
            return (Criteria) this;
        }

        public Criteria andMapkeyIdLessThanOrEqualTo(String value) {
            addCriterion("mapkey_id <=", value, "mapkeyId");
            return (Criteria) this;
        }

        public Criteria andMapkeyIdLike(String value) {
            addCriterion("mapkey_id like", value, "mapkeyId");
            return (Criteria) this;
        }

        public Criteria andMapkeyIdNotLike(String value) {
            addCriterion("mapkey_id not like", value, "mapkeyId");
            return (Criteria) this;
        }

        public Criteria andMapkeyIdIn(List<String> values) {
            addCriterion("mapkey_id in", values, "mapkeyId");
            return (Criteria) this;
        }

        public Criteria andMapkeyIdNotIn(List<String> values) {
            addCriterion("mapkey_id not in", values, "mapkeyId");
            return (Criteria) this;
        }

        public Criteria andMapkeyIdBetween(String value1, String value2) {
            addCriterion("mapkey_id between", value1, value2, "mapkeyId");
            return (Criteria) this;
        }

        public Criteria andMapkeyIdNotBetween(String value1, String value2) {
            addCriterion("mapkey_id not between", value1, value2, "mapkeyId");
            return (Criteria) this;
        }

        public Criteria andElementIsNull() {
            addCriterion("element is null");
            return (Criteria) this;
        }

        public Criteria andElementIsNotNull() {
            addCriterion("element is not null");
            return (Criteria) this;
        }

        public Criteria andElementEqualTo(String value) {
            addCriterion("element =", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotEqualTo(String value) {
            addCriterion("element <>", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementGreaterThan(String value) {
            addCriterion("element >", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementGreaterThanOrEqualTo(String value) {
            addCriterion("element >=", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementLessThan(String value) {
            addCriterion("element <", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementLessThanOrEqualTo(String value) {
            addCriterion("element <=", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementLike(String value) {
            addCriterion("element like", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotLike(String value) {
            addCriterion("element not like", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementIn(List<String> values) {
            addCriterion("element in", values, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotIn(List<String> values) {
            addCriterion("element not in", values, "element");
            return (Criteria) this;
        }

        public Criteria andElementBetween(String value1, String value2) {
            addCriterion("element between", value1, value2, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotBetween(String value1, String value2) {
            addCriterion("element not between", value1, value2, "element");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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
package group.yunxin.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbXzQuesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbXzQuesExample() {
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

        public Criteria andQuesIdIsNull() {
            addCriterion("ques_id is null");
            return (Criteria) this;
        }

        public Criteria andQuesIdIsNotNull() {
            addCriterion("ques_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuesIdEqualTo(Long value) {
            addCriterion("ques_id =", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdNotEqualTo(Long value) {
            addCriterion("ques_id <>", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdGreaterThan(Long value) {
            addCriterion("ques_id >", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ques_id >=", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdLessThan(Long value) {
            addCriterion("ques_id <", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdLessThanOrEqualTo(Long value) {
            addCriterion("ques_id <=", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdIn(List<Long> values) {
            addCriterion("ques_id in", values, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdNotIn(List<Long> values) {
            addCriterion("ques_id not in", values, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdBetween(Long value1, Long value2) {
            addCriterion("ques_id between", value1, value2, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdNotBetween(Long value1, Long value2) {
            addCriterion("ques_id not between", value1, value2, "quesId");
            return (Criteria) this;
        }

        public Criteria andOpaIsNull() {
            addCriterion("opA is null");
            return (Criteria) this;
        }

        public Criteria andOpaIsNotNull() {
            addCriterion("opA is not null");
            return (Criteria) this;
        }

        public Criteria andOpaEqualTo(String value) {
            addCriterion("opA =", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaNotEqualTo(String value) {
            addCriterion("opA <>", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaGreaterThan(String value) {
            addCriterion("opA >", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaGreaterThanOrEqualTo(String value) {
            addCriterion("opA >=", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaLessThan(String value) {
            addCriterion("opA <", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaLessThanOrEqualTo(String value) {
            addCriterion("opA <=", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaLike(String value) {
            addCriterion("opA like", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaNotLike(String value) {
            addCriterion("opA not like", value, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaIn(List<String> values) {
            addCriterion("opA in", values, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaNotIn(List<String> values) {
            addCriterion("opA not in", values, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaBetween(String value1, String value2) {
            addCriterion("opA between", value1, value2, "opa");
            return (Criteria) this;
        }

        public Criteria andOpaNotBetween(String value1, String value2) {
            addCriterion("opA not between", value1, value2, "opa");
            return (Criteria) this;
        }

        public Criteria andOpbIsNull() {
            addCriterion("opB is null");
            return (Criteria) this;
        }

        public Criteria andOpbIsNotNull() {
            addCriterion("opB is not null");
            return (Criteria) this;
        }

        public Criteria andOpbEqualTo(String value) {
            addCriterion("opB =", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbNotEqualTo(String value) {
            addCriterion("opB <>", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbGreaterThan(String value) {
            addCriterion("opB >", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbGreaterThanOrEqualTo(String value) {
            addCriterion("opB >=", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbLessThan(String value) {
            addCriterion("opB <", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbLessThanOrEqualTo(String value) {
            addCriterion("opB <=", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbLike(String value) {
            addCriterion("opB like", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbNotLike(String value) {
            addCriterion("opB not like", value, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbIn(List<String> values) {
            addCriterion("opB in", values, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbNotIn(List<String> values) {
            addCriterion("opB not in", values, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbBetween(String value1, String value2) {
            addCriterion("opB between", value1, value2, "opb");
            return (Criteria) this;
        }

        public Criteria andOpbNotBetween(String value1, String value2) {
            addCriterion("opB not between", value1, value2, "opb");
            return (Criteria) this;
        }

        public Criteria andOpcIsNull() {
            addCriterion("opC is null");
            return (Criteria) this;
        }

        public Criteria andOpcIsNotNull() {
            addCriterion("opC is not null");
            return (Criteria) this;
        }

        public Criteria andOpcEqualTo(String value) {
            addCriterion("opC =", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcNotEqualTo(String value) {
            addCriterion("opC <>", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcGreaterThan(String value) {
            addCriterion("opC >", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcGreaterThanOrEqualTo(String value) {
            addCriterion("opC >=", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcLessThan(String value) {
            addCriterion("opC <", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcLessThanOrEqualTo(String value) {
            addCriterion("opC <=", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcLike(String value) {
            addCriterion("opC like", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcNotLike(String value) {
            addCriterion("opC not like", value, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcIn(List<String> values) {
            addCriterion("opC in", values, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcNotIn(List<String> values) {
            addCriterion("opC not in", values, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcBetween(String value1, String value2) {
            addCriterion("opC between", value1, value2, "opc");
            return (Criteria) this;
        }

        public Criteria andOpcNotBetween(String value1, String value2) {
            addCriterion("opC not between", value1, value2, "opc");
            return (Criteria) this;
        }

        public Criteria andOpdIsNull() {
            addCriterion("opD is null");
            return (Criteria) this;
        }

        public Criteria andOpdIsNotNull() {
            addCriterion("opD is not null");
            return (Criteria) this;
        }

        public Criteria andOpdEqualTo(String value) {
            addCriterion("opD =", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdNotEqualTo(String value) {
            addCriterion("opD <>", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdGreaterThan(String value) {
            addCriterion("opD >", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdGreaterThanOrEqualTo(String value) {
            addCriterion("opD >=", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdLessThan(String value) {
            addCriterion("opD <", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdLessThanOrEqualTo(String value) {
            addCriterion("opD <=", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdLike(String value) {
            addCriterion("opD like", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdNotLike(String value) {
            addCriterion("opD not like", value, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdIn(List<String> values) {
            addCriterion("opD in", values, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdNotIn(List<String> values) {
            addCriterion("opD not in", values, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdBetween(String value1, String value2) {
            addCriterion("opD between", value1, value2, "opd");
            return (Criteria) this;
        }

        public Criteria andOpdNotBetween(String value1, String value2) {
            addCriterion("opD not between", value1, value2, "opd");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }
    }

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
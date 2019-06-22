package group.yunxin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPaperExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNull() {
            addCriterion("exam_id is null");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNotNull() {
            addCriterion("exam_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamIdEqualTo(Long value) {
            addCriterion("exam_id =", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotEqualTo(Long value) {
            addCriterion("exam_id <>", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThan(Long value) {
            addCriterion("exam_id >", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThanOrEqualTo(Long value) {
            addCriterion("exam_id >=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThan(Long value) {
            addCriterion("exam_id <", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThanOrEqualTo(Long value) {
            addCriterion("exam_id <=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdIn(List<Long> values) {
            addCriterion("exam_id in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotIn(List<Long> values) {
            addCriterion("exam_id not in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdBetween(Long value1, Long value2) {
            addCriterion("exam_id between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotBetween(Long value1, Long value2) {
            addCriterion("exam_id not between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Long value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Long value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Long value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Long value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Long value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Long> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Long> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Long value1, Long value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Long value1, Long value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andTimeEnterIsNull() {
            addCriterion("time_enter is null");
            return (Criteria) this;
        }

        public Criteria andTimeEnterIsNotNull() {
            addCriterion("time_enter is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEnterEqualTo(Date value) {
            addCriterion("time_enter =", value, "timeEnter");
            return (Criteria) this;
        }

        public Criteria andTimeEnterNotEqualTo(Date value) {
            addCriterion("time_enter <>", value, "timeEnter");
            return (Criteria) this;
        }

        public Criteria andTimeEnterGreaterThan(Date value) {
            addCriterion("time_enter >", value, "timeEnter");
            return (Criteria) this;
        }

        public Criteria andTimeEnterGreaterThanOrEqualTo(Date value) {
            addCriterion("time_enter >=", value, "timeEnter");
            return (Criteria) this;
        }

        public Criteria andTimeEnterLessThan(Date value) {
            addCriterion("time_enter <", value, "timeEnter");
            return (Criteria) this;
        }

        public Criteria andTimeEnterLessThanOrEqualTo(Date value) {
            addCriterion("time_enter <=", value, "timeEnter");
            return (Criteria) this;
        }

        public Criteria andTimeEnterIn(List<Date> values) {
            addCriterion("time_enter in", values, "timeEnter");
            return (Criteria) this;
        }

        public Criteria andTimeEnterNotIn(List<Date> values) {
            addCriterion("time_enter not in", values, "timeEnter");
            return (Criteria) this;
        }

        public Criteria andTimeEnterBetween(Date value1, Date value2) {
            addCriterion("time_enter between", value1, value2, "timeEnter");
            return (Criteria) this;
        }

        public Criteria andTimeEnterNotBetween(Date value1, Date value2) {
            addCriterion("time_enter not between", value1, value2, "timeEnter");
            return (Criteria) this;
        }

        public Criteria andTimeSubmitIsNull() {
            addCriterion("time_submit is null");
            return (Criteria) this;
        }

        public Criteria andTimeSubmitIsNotNull() {
            addCriterion("time_submit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeSubmitEqualTo(Date value) {
            addCriterion("time_submit =", value, "timeSubmit");
            return (Criteria) this;
        }

        public Criteria andTimeSubmitNotEqualTo(Date value) {
            addCriterion("time_submit <>", value, "timeSubmit");
            return (Criteria) this;
        }

        public Criteria andTimeSubmitGreaterThan(Date value) {
            addCriterion("time_submit >", value, "timeSubmit");
            return (Criteria) this;
        }

        public Criteria andTimeSubmitGreaterThanOrEqualTo(Date value) {
            addCriterion("time_submit >=", value, "timeSubmit");
            return (Criteria) this;
        }

        public Criteria andTimeSubmitLessThan(Date value) {
            addCriterion("time_submit <", value, "timeSubmit");
            return (Criteria) this;
        }

        public Criteria andTimeSubmitLessThanOrEqualTo(Date value) {
            addCriterion("time_submit <=", value, "timeSubmit");
            return (Criteria) this;
        }

        public Criteria andTimeSubmitIn(List<Date> values) {
            addCriterion("time_submit in", values, "timeSubmit");
            return (Criteria) this;
        }

        public Criteria andTimeSubmitNotIn(List<Date> values) {
            addCriterion("time_submit not in", values, "timeSubmit");
            return (Criteria) this;
        }

        public Criteria andTimeSubmitBetween(Date value1, Date value2) {
            addCriterion("time_submit between", value1, value2, "timeSubmit");
            return (Criteria) this;
        }

        public Criteria andTimeSubmitNotBetween(Date value1, Date value2) {
            addCriterion("time_submit not between", value1, value2, "timeSubmit");
            return (Criteria) this;
        }

        public Criteria andActualMarksIsNull() {
            addCriterion("actual_marks is null");
            return (Criteria) this;
        }

        public Criteria andActualMarksIsNotNull() {
            addCriterion("actual_marks is not null");
            return (Criteria) this;
        }

        public Criteria andActualMarksEqualTo(Integer value) {
            addCriterion("actual_marks =", value, "actualMarks");
            return (Criteria) this;
        }

        public Criteria andActualMarksNotEqualTo(Integer value) {
            addCriterion("actual_marks <>", value, "actualMarks");
            return (Criteria) this;
        }

        public Criteria andActualMarksGreaterThan(Integer value) {
            addCriterion("actual_marks >", value, "actualMarks");
            return (Criteria) this;
        }

        public Criteria andActualMarksGreaterThanOrEqualTo(Integer value) {
            addCriterion("actual_marks >=", value, "actualMarks");
            return (Criteria) this;
        }

        public Criteria andActualMarksLessThan(Integer value) {
            addCriterion("actual_marks <", value, "actualMarks");
            return (Criteria) this;
        }

        public Criteria andActualMarksLessThanOrEqualTo(Integer value) {
            addCriterion("actual_marks <=", value, "actualMarks");
            return (Criteria) this;
        }

        public Criteria andActualMarksIn(List<Integer> values) {
            addCriterion("actual_marks in", values, "actualMarks");
            return (Criteria) this;
        }

        public Criteria andActualMarksNotIn(List<Integer> values) {
            addCriterion("actual_marks not in", values, "actualMarks");
            return (Criteria) this;
        }

        public Criteria andActualMarksBetween(Integer value1, Integer value2) {
            addCriterion("actual_marks between", value1, value2, "actualMarks");
            return (Criteria) this;
        }

        public Criteria andActualMarksNotBetween(Integer value1, Integer value2) {
            addCriterion("actual_marks not between", value1, value2, "actualMarks");
            return (Criteria) this;
        }

        public Criteria andNumSwitchIsNull() {
            addCriterion("num_switch is null");
            return (Criteria) this;
        }

        public Criteria andNumSwitchIsNotNull() {
            addCriterion("num_switch is not null");
            return (Criteria) this;
        }

        public Criteria andNumSwitchEqualTo(Integer value) {
            addCriterion("num_switch =", value, "numSwitch");
            return (Criteria) this;
        }

        public Criteria andNumSwitchNotEqualTo(Integer value) {
            addCriterion("num_switch <>", value, "numSwitch");
            return (Criteria) this;
        }

        public Criteria andNumSwitchGreaterThan(Integer value) {
            addCriterion("num_switch >", value, "numSwitch");
            return (Criteria) this;
        }

        public Criteria andNumSwitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_switch >=", value, "numSwitch");
            return (Criteria) this;
        }

        public Criteria andNumSwitchLessThan(Integer value) {
            addCriterion("num_switch <", value, "numSwitch");
            return (Criteria) this;
        }

        public Criteria andNumSwitchLessThanOrEqualTo(Integer value) {
            addCriterion("num_switch <=", value, "numSwitch");
            return (Criteria) this;
        }

        public Criteria andNumSwitchIn(List<Integer> values) {
            addCriterion("num_switch in", values, "numSwitch");
            return (Criteria) this;
        }

        public Criteria andNumSwitchNotIn(List<Integer> values) {
            addCriterion("num_switch not in", values, "numSwitch");
            return (Criteria) this;
        }

        public Criteria andNumSwitchBetween(Integer value1, Integer value2) {
            addCriterion("num_switch between", value1, value2, "numSwitch");
            return (Criteria) this;
        }

        public Criteria andNumSwitchNotBetween(Integer value1, Integer value2) {
            addCriterion("num_switch not between", value1, value2, "numSwitch");
            return (Criteria) this;
        }

        public Criteria andNum1IsNull() {
            addCriterion("num1 is null");
            return (Criteria) this;
        }

        public Criteria andNum1IsNotNull() {
            addCriterion("num1 is not null");
            return (Criteria) this;
        }

        public Criteria andNum1EqualTo(Integer value) {
            addCriterion("num1 =", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1NotEqualTo(Integer value) {
            addCriterion("num1 <>", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1GreaterThan(Integer value) {
            addCriterion("num1 >", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1GreaterThanOrEqualTo(Integer value) {
            addCriterion("num1 >=", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1LessThan(Integer value) {
            addCriterion("num1 <", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1LessThanOrEqualTo(Integer value) {
            addCriterion("num1 <=", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1In(List<Integer> values) {
            addCriterion("num1 in", values, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1NotIn(List<Integer> values) {
            addCriterion("num1 not in", values, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1Between(Integer value1, Integer value2) {
            addCriterion("num1 between", value1, value2, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1NotBetween(Integer value1, Integer value2) {
            addCriterion("num1 not between", value1, value2, "num1");
            return (Criteria) this;
        }

        public Criteria andNum2IsNull() {
            addCriterion("num2 is null");
            return (Criteria) this;
        }

        public Criteria andNum2IsNotNull() {
            addCriterion("num2 is not null");
            return (Criteria) this;
        }

        public Criteria andNum2EqualTo(Integer value) {
            addCriterion("num2 =", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2NotEqualTo(Integer value) {
            addCriterion("num2 <>", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2GreaterThan(Integer value) {
            addCriterion("num2 >", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2GreaterThanOrEqualTo(Integer value) {
            addCriterion("num2 >=", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2LessThan(Integer value) {
            addCriterion("num2 <", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2LessThanOrEqualTo(Integer value) {
            addCriterion("num2 <=", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2In(List<Integer> values) {
            addCriterion("num2 in", values, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2NotIn(List<Integer> values) {
            addCriterion("num2 not in", values, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2Between(Integer value1, Integer value2) {
            addCriterion("num2 between", value1, value2, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2NotBetween(Integer value1, Integer value2) {
            addCriterion("num2 not between", value1, value2, "num2");
            return (Criteria) this;
        }

        public Criteria andNum3IsNull() {
            addCriterion("num3 is null");
            return (Criteria) this;
        }

        public Criteria andNum3IsNotNull() {
            addCriterion("num3 is not null");
            return (Criteria) this;
        }

        public Criteria andNum3EqualTo(Integer value) {
            addCriterion("num3 =", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3NotEqualTo(Integer value) {
            addCriterion("num3 <>", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3GreaterThan(Integer value) {
            addCriterion("num3 >", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3GreaterThanOrEqualTo(Integer value) {
            addCriterion("num3 >=", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3LessThan(Integer value) {
            addCriterion("num3 <", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3LessThanOrEqualTo(Integer value) {
            addCriterion("num3 <=", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3In(List<Integer> values) {
            addCriterion("num3 in", values, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3NotIn(List<Integer> values) {
            addCriterion("num3 not in", values, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3Between(Integer value1, Integer value2) {
            addCriterion("num3 between", value1, value2, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3NotBetween(Integer value1, Integer value2) {
            addCriterion("num3 not between", value1, value2, "num3");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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
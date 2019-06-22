package group.yunxin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbExamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbExamExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Long value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Long value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Long value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Long value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Long value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Long value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Long> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Long> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Long value1, Long value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Long value1, Long value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andNeedCameraIsNull() {
            addCriterion("need_camera is null");
            return (Criteria) this;
        }

        public Criteria andNeedCameraIsNotNull() {
            addCriterion("need_camera is not null");
            return (Criteria) this;
        }

        public Criteria andNeedCameraEqualTo(Integer value) {
            addCriterion("need_camera =", value, "needCamera");
            return (Criteria) this;
        }

        public Criteria andNeedCameraNotEqualTo(Integer value) {
            addCriterion("need_camera <>", value, "needCamera");
            return (Criteria) this;
        }

        public Criteria andNeedCameraGreaterThan(Integer value) {
            addCriterion("need_camera >", value, "needCamera");
            return (Criteria) this;
        }

        public Criteria andNeedCameraGreaterThanOrEqualTo(Integer value) {
            addCriterion("need_camera >=", value, "needCamera");
            return (Criteria) this;
        }

        public Criteria andNeedCameraLessThan(Integer value) {
            addCriterion("need_camera <", value, "needCamera");
            return (Criteria) this;
        }

        public Criteria andNeedCameraLessThanOrEqualTo(Integer value) {
            addCriterion("need_camera <=", value, "needCamera");
            return (Criteria) this;
        }

        public Criteria andNeedCameraIn(List<Integer> values) {
            addCriterion("need_camera in", values, "needCamera");
            return (Criteria) this;
        }

        public Criteria andNeedCameraNotIn(List<Integer> values) {
            addCriterion("need_camera not in", values, "needCamera");
            return (Criteria) this;
        }

        public Criteria andNeedCameraBetween(Integer value1, Integer value2) {
            addCriterion("need_camera between", value1, value2, "needCamera");
            return (Criteria) this;
        }

        public Criteria andNeedCameraNotBetween(Integer value1, Integer value2) {
            addCriterion("need_camera not between", value1, value2, "needCamera");
            return (Criteria) this;
        }

        public Criteria andIsPublicIsNull() {
            addCriterion("is_public is null");
            return (Criteria) this;
        }

        public Criteria andIsPublicIsNotNull() {
            addCriterion("is_public is not null");
            return (Criteria) this;
        }

        public Criteria andIsPublicEqualTo(Integer value) {
            addCriterion("is_public =", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotEqualTo(Integer value) {
            addCriterion("is_public <>", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicGreaterThan(Integer value) {
            addCriterion("is_public >", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_public >=", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicLessThan(Integer value) {
            addCriterion("is_public <", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicLessThanOrEqualTo(Integer value) {
            addCriterion("is_public <=", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicIn(List<Integer> values) {
            addCriterion("is_public in", values, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotIn(List<Integer> values) {
            addCriterion("is_public not in", values, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicBetween(Integer value1, Integer value2) {
            addCriterion("is_public between", value1, value2, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotBetween(Integer value1, Integer value2) {
            addCriterion("is_public not between", value1, value2, "isPublic");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDiffIsNull() {
            addCriterion("diff is null");
            return (Criteria) this;
        }

        public Criteria andDiffIsNotNull() {
            addCriterion("diff is not null");
            return (Criteria) this;
        }

        public Criteria andDiffEqualTo(Integer value) {
            addCriterion("diff =", value, "diff");
            return (Criteria) this;
        }

        public Criteria andDiffNotEqualTo(Integer value) {
            addCriterion("diff <>", value, "diff");
            return (Criteria) this;
        }

        public Criteria andDiffGreaterThan(Integer value) {
            addCriterion("diff >", value, "diff");
            return (Criteria) this;
        }

        public Criteria andDiffGreaterThanOrEqualTo(Integer value) {
            addCriterion("diff >=", value, "diff");
            return (Criteria) this;
        }

        public Criteria andDiffLessThan(Integer value) {
            addCriterion("diff <", value, "diff");
            return (Criteria) this;
        }

        public Criteria andDiffLessThanOrEqualTo(Integer value) {
            addCriterion("diff <=", value, "diff");
            return (Criteria) this;
        }

        public Criteria andDiffIn(List<Integer> values) {
            addCriterion("diff in", values, "diff");
            return (Criteria) this;
        }

        public Criteria andDiffNotIn(List<Integer> values) {
            addCriterion("diff not in", values, "diff");
            return (Criteria) this;
        }

        public Criteria andDiffBetween(Integer value1, Integer value2) {
            addCriterion("diff between", value1, value2, "diff");
            return (Criteria) this;
        }

        public Criteria andDiffNotBetween(Integer value1, Integer value2) {
            addCriterion("diff not between", value1, value2, "diff");
            return (Criteria) this;
        }

        public Criteria andTimeStartIsNull() {
            addCriterion("time_start is null");
            return (Criteria) this;
        }

        public Criteria andTimeStartIsNotNull() {
            addCriterion("time_start is not null");
            return (Criteria) this;
        }

        public Criteria andTimeStartEqualTo(Date value) {
            addCriterion("time_start =", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotEqualTo(Date value) {
            addCriterion("time_start <>", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartGreaterThan(Date value) {
            addCriterion("time_start >", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterion("time_start >=", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLessThan(Date value) {
            addCriterion("time_start <", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLessThanOrEqualTo(Date value) {
            addCriterion("time_start <=", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartIn(List<Date> values) {
            addCriterion("time_start in", values, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotIn(List<Date> values) {
            addCriterion("time_start not in", values, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartBetween(Date value1, Date value2) {
            addCriterion("time_start between", value1, value2, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotBetween(Date value1, Date value2) {
            addCriterion("time_start not between", value1, value2, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStopIsNull() {
            addCriterion("time_stop is null");
            return (Criteria) this;
        }

        public Criteria andTimeStopIsNotNull() {
            addCriterion("time_stop is not null");
            return (Criteria) this;
        }

        public Criteria andTimeStopEqualTo(Date value) {
            addCriterion("time_stop =", value, "timeStop");
            return (Criteria) this;
        }

        public Criteria andTimeStopNotEqualTo(Date value) {
            addCriterion("time_stop <>", value, "timeStop");
            return (Criteria) this;
        }

        public Criteria andTimeStopGreaterThan(Date value) {
            addCriterion("time_stop >", value, "timeStop");
            return (Criteria) this;
        }

        public Criteria andTimeStopGreaterThanOrEqualTo(Date value) {
            addCriterion("time_stop >=", value, "timeStop");
            return (Criteria) this;
        }

        public Criteria andTimeStopLessThan(Date value) {
            addCriterion("time_stop <", value, "timeStop");
            return (Criteria) this;
        }

        public Criteria andTimeStopLessThanOrEqualTo(Date value) {
            addCriterion("time_stop <=", value, "timeStop");
            return (Criteria) this;
        }

        public Criteria andTimeStopIn(List<Date> values) {
            addCriterion("time_stop in", values, "timeStop");
            return (Criteria) this;
        }

        public Criteria andTimeStopNotIn(List<Date> values) {
            addCriterion("time_stop not in", values, "timeStop");
            return (Criteria) this;
        }

        public Criteria andTimeStopBetween(Date value1, Date value2) {
            addCriterion("time_stop between", value1, value2, "timeStop");
            return (Criteria) this;
        }

        public Criteria andTimeStopNotBetween(Date value1, Date value2) {
            addCriterion("time_stop not between", value1, value2, "timeStop");
            return (Criteria) this;
        }

        public Criteria andTimePublicMarksIsNull() {
            addCriterion("time_public_marks is null");
            return (Criteria) this;
        }

        public Criteria andTimePublicMarksIsNotNull() {
            addCriterion("time_public_marks is not null");
            return (Criteria) this;
        }

        public Criteria andTimePublicMarksEqualTo(Date value) {
            addCriterion("time_public_marks =", value, "timePublicMarks");
            return (Criteria) this;
        }

        public Criteria andTimePublicMarksNotEqualTo(Date value) {
            addCriterion("time_public_marks <>", value, "timePublicMarks");
            return (Criteria) this;
        }

        public Criteria andTimePublicMarksGreaterThan(Date value) {
            addCriterion("time_public_marks >", value, "timePublicMarks");
            return (Criteria) this;
        }

        public Criteria andTimePublicMarksGreaterThanOrEqualTo(Date value) {
            addCriterion("time_public_marks >=", value, "timePublicMarks");
            return (Criteria) this;
        }

        public Criteria andTimePublicMarksLessThan(Date value) {
            addCriterion("time_public_marks <", value, "timePublicMarks");
            return (Criteria) this;
        }

        public Criteria andTimePublicMarksLessThanOrEqualTo(Date value) {
            addCriterion("time_public_marks <=", value, "timePublicMarks");
            return (Criteria) this;
        }

        public Criteria andTimePublicMarksIn(List<Date> values) {
            addCriterion("time_public_marks in", values, "timePublicMarks");
            return (Criteria) this;
        }

        public Criteria andTimePublicMarksNotIn(List<Date> values) {
            addCriterion("time_public_marks not in", values, "timePublicMarks");
            return (Criteria) this;
        }

        public Criteria andTimePublicMarksBetween(Date value1, Date value2) {
            addCriterion("time_public_marks between", value1, value2, "timePublicMarks");
            return (Criteria) this;
        }

        public Criteria andTimePublicMarksNotBetween(Date value1, Date value2) {
            addCriterion("time_public_marks not between", value1, value2, "timePublicMarks");
            return (Criteria) this;
        }

        public Criteria andTimeLastIsNull() {
            addCriterion("time_last is null");
            return (Criteria) this;
        }

        public Criteria andTimeLastIsNotNull() {
            addCriterion("time_last is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLastEqualTo(Long value) {
            addCriterion("time_last =", value, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastNotEqualTo(Long value) {
            addCriterion("time_last <>", value, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastGreaterThan(Long value) {
            addCriterion("time_last >", value, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastGreaterThanOrEqualTo(Long value) {
            addCriterion("time_last >=", value, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastLessThan(Long value) {
            addCriterion("time_last <", value, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastLessThanOrEqualTo(Long value) {
            addCriterion("time_last <=", value, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastIn(List<Long> values) {
            addCriterion("time_last in", values, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastNotIn(List<Long> values) {
            addCriterion("time_last not in", values, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastBetween(Long value1, Long value2) {
            addCriterion("time_last between", value1, value2, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastNotBetween(Long value1, Long value2) {
            addCriterion("time_last not between", value1, value2, "timeLast");
            return (Criteria) this;
        }

        public Criteria andMaxSwitchIsNull() {
            addCriterion("max_switch is null");
            return (Criteria) this;
        }

        public Criteria andMaxSwitchIsNotNull() {
            addCriterion("max_switch is not null");
            return (Criteria) this;
        }

        public Criteria andMaxSwitchEqualTo(Integer value) {
            addCriterion("max_switch =", value, "maxSwitch");
            return (Criteria) this;
        }

        public Criteria andMaxSwitchNotEqualTo(Integer value) {
            addCriterion("max_switch <>", value, "maxSwitch");
            return (Criteria) this;
        }

        public Criteria andMaxSwitchGreaterThan(Integer value) {
            addCriterion("max_switch >", value, "maxSwitch");
            return (Criteria) this;
        }

        public Criteria andMaxSwitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_switch >=", value, "maxSwitch");
            return (Criteria) this;
        }

        public Criteria andMaxSwitchLessThan(Integer value) {
            addCriterion("max_switch <", value, "maxSwitch");
            return (Criteria) this;
        }

        public Criteria andMaxSwitchLessThanOrEqualTo(Integer value) {
            addCriterion("max_switch <=", value, "maxSwitch");
            return (Criteria) this;
        }

        public Criteria andMaxSwitchIn(List<Integer> values) {
            addCriterion("max_switch in", values, "maxSwitch");
            return (Criteria) this;
        }

        public Criteria andMaxSwitchNotIn(List<Integer> values) {
            addCriterion("max_switch not in", values, "maxSwitch");
            return (Criteria) this;
        }

        public Criteria andMaxSwitchBetween(Integer value1, Integer value2) {
            addCriterion("max_switch between", value1, value2, "maxSwitch");
            return (Criteria) this;
        }

        public Criteria andMaxSwitchNotBetween(Integer value1, Integer value2) {
            addCriterion("max_switch not between", value1, value2, "maxSwitch");
            return (Criteria) this;
        }

        public Criteria andAllowBrowseAfterTimeIsNull() {
            addCriterion("allow_browse_after_time is null");
            return (Criteria) this;
        }

        public Criteria andAllowBrowseAfterTimeIsNotNull() {
            addCriterion("allow_browse_after_time is not null");
            return (Criteria) this;
        }

        public Criteria andAllowBrowseAfterTimeEqualTo(Integer value) {
            addCriterion("allow_browse_after_time =", value, "allowBrowseAfterTime");
            return (Criteria) this;
        }

        public Criteria andAllowBrowseAfterTimeNotEqualTo(Integer value) {
            addCriterion("allow_browse_after_time <>", value, "allowBrowseAfterTime");
            return (Criteria) this;
        }

        public Criteria andAllowBrowseAfterTimeGreaterThan(Integer value) {
            addCriterion("allow_browse_after_time >", value, "allowBrowseAfterTime");
            return (Criteria) this;
        }

        public Criteria andAllowBrowseAfterTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("allow_browse_after_time >=", value, "allowBrowseAfterTime");
            return (Criteria) this;
        }

        public Criteria andAllowBrowseAfterTimeLessThan(Integer value) {
            addCriterion("allow_browse_after_time <", value, "allowBrowseAfterTime");
            return (Criteria) this;
        }

        public Criteria andAllowBrowseAfterTimeLessThanOrEqualTo(Integer value) {
            addCriterion("allow_browse_after_time <=", value, "allowBrowseAfterTime");
            return (Criteria) this;
        }

        public Criteria andAllowBrowseAfterTimeIn(List<Integer> values) {
            addCriterion("allow_browse_after_time in", values, "allowBrowseAfterTime");
            return (Criteria) this;
        }

        public Criteria andAllowBrowseAfterTimeNotIn(List<Integer> values) {
            addCriterion("allow_browse_after_time not in", values, "allowBrowseAfterTime");
            return (Criteria) this;
        }

        public Criteria andAllowBrowseAfterTimeBetween(Integer value1, Integer value2) {
            addCriterion("allow_browse_after_time between", value1, value2, "allowBrowseAfterTime");
            return (Criteria) this;
        }

        public Criteria andAllowBrowseAfterTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("allow_browse_after_time not between", value1, value2, "allowBrowseAfterTime");
            return (Criteria) this;
        }

        public Criteria andMarksIsNull() {
            addCriterion("marks is null");
            return (Criteria) this;
        }

        public Criteria andMarksIsNotNull() {
            addCriterion("marks is not null");
            return (Criteria) this;
        }

        public Criteria andMarksEqualTo(String value) {
            addCriterion("marks =", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotEqualTo(String value) {
            addCriterion("marks <>", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksGreaterThan(String value) {
            addCriterion("marks >", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksGreaterThanOrEqualTo(String value) {
            addCriterion("marks >=", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLessThan(String value) {
            addCriterion("marks <", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLessThanOrEqualTo(String value) {
            addCriterion("marks <=", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLike(String value) {
            addCriterion("marks like", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotLike(String value) {
            addCriterion("marks not like", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksIn(List<String> values) {
            addCriterion("marks in", values, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotIn(List<String> values) {
            addCriterion("marks not in", values, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksBetween(String value1, String value2) {
            addCriterion("marks between", value1, value2, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotBetween(String value1, String value2) {
            addCriterion("marks not between", value1, value2, "marks");
            return (Criteria) this;
        }

        public Criteria andTotalMarkIsNull() {
            addCriterion("total_mark is null");
            return (Criteria) this;
        }

        public Criteria andTotalMarkIsNotNull() {
            addCriterion("total_mark is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMarkEqualTo(Integer value) {
            addCriterion("total_mark =", value, "totalMark");
            return (Criteria) this;
        }

        public Criteria andTotalMarkNotEqualTo(Integer value) {
            addCriterion("total_mark <>", value, "totalMark");
            return (Criteria) this;
        }

        public Criteria andTotalMarkGreaterThan(Integer value) {
            addCriterion("total_mark >", value, "totalMark");
            return (Criteria) this;
        }

        public Criteria andTotalMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_mark >=", value, "totalMark");
            return (Criteria) this;
        }

        public Criteria andTotalMarkLessThan(Integer value) {
            addCriterion("total_mark <", value, "totalMark");
            return (Criteria) this;
        }

        public Criteria andTotalMarkLessThanOrEqualTo(Integer value) {
            addCriterion("total_mark <=", value, "totalMark");
            return (Criteria) this;
        }

        public Criteria andTotalMarkIn(List<Integer> values) {
            addCriterion("total_mark in", values, "totalMark");
            return (Criteria) this;
        }

        public Criteria andTotalMarkNotIn(List<Integer> values) {
            addCriterion("total_mark not in", values, "totalMark");
            return (Criteria) this;
        }

        public Criteria andTotalMarkBetween(Integer value1, Integer value2) {
            addCriterion("total_mark between", value1, value2, "totalMark");
            return (Criteria) this;
        }

        public Criteria andTotalMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("total_mark not between", value1, value2, "totalMark");
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
package group.yunxin.pojo;

import java.io.Serializable;
import java.util.Date;

import org.apache.solr.client.solrj.beans.Field;

public class TbExam implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7286797014304512038L;

	@Field("exam_id")
	private Long id;

	@Field("exam_title")
	private String title;

	@Field("exam_teacher_id")
	private Long teacherId;
	
	private TbUser teacher;

	@Field("exam_create_time")
	private Date createTime;

	@Field("exam_need_camera")
	private Integer needCamera;//0假 1真

	@Field("exam_is_public")
	private Integer isPublic;

	@Field("exam_price")
	private Double price;

	@Field("exam_diff")
	private Integer diff;// 0 1 2 难度由低到高

	@Field("exam_time_start")
	private Date timeStart;

	@Field("exam_time_stop")
	private Date timeStop;

	@Field("exam_time_public_marks")
	private Date timePublicMarks;

	@Field("exam_time_last")
	private Long timeLast;//单位为秒

	@Field("exam_max_switch")
	private Integer maxSwitch;

	@Field("exam_allow_browse_after_time")
	private Integer allowBrowseAfterTime;

	@Field("exam_marks")
	private String marks;//逗号隔开

	@Field("exam_total_mark")
	private Integer totalMark;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title == null ? null : title.trim();
	}

	public Long getTeacherId()
	{
		return teacherId;
	}

	public void setTeacherId(Long teacherId)
	{
		this.teacherId = teacherId;
	}

	public Date getCreateTime()
	{
		return createTime;
	}

	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}

	public Integer getNeedCamera()
	{
		return needCamera;
	}

	public void setNeedCamera(Integer needCamera)
	{
		this.needCamera = needCamera;
	}

	public Integer getIsPublic()
	{
		return isPublic;
	}

	public void setIsPublic(Integer isPublic)
	{
		this.isPublic = isPublic;
	}

	public Double getPrice()
	{
		return price;
	}

	public void setPrice(Double price)
	{
		this.price = price;
	}

	public Integer getDiff()
	{
		return diff;
	}

	public void setDiff(Integer diff)
	{
		this.diff = diff;
	}

	public Date getTimeStart()
	{
		return timeStart;
	}

	public void setTimeStart(Date timeStart)
	{
		this.timeStart = timeStart;
	}

	public Date getTimeStop()
	{
		return timeStop;
	}

	public void setTimeStop(Date timeStop)
	{
		this.timeStop = timeStop;
	}

	public Date getTimePublicMarks()
	{
		return timePublicMarks;
	}

	public void setTimePublicMarks(Date timePublicMarks)
	{
		this.timePublicMarks = timePublicMarks;
	}

	public Long getTimeLast()
	{
		return timeLast;
	}

	public void setTimeLast(Long timeLast)
	{
		this.timeLast = timeLast;
	}

	public Integer getMaxSwitch()
	{
		return maxSwitch;
	}

	public void setMaxSwitch(Integer maxSwitch)
	{
		this.maxSwitch = maxSwitch;
	}

	public Integer getAllowBrowseAfterTime()
	{
		return allowBrowseAfterTime;
	}

	public void setAllowBrowseAfterTime(Integer allowBrowseAfterTime)
	{
		this.allowBrowseAfterTime = allowBrowseAfterTime;
	}

	public String getMarks()
	{
		return marks;
	}

	public void setMarks(String marks)
	{
		this.marks = marks == null ? null : marks.trim();
	}

	public Integer getTotalMark()
	{
		return totalMark;
	}

	public void setTotalMark(Integer totalMark)
	{
		this.totalMark = totalMark;
	}

	public TbUser getTeacher()
	{
		return teacher;
	}

	public void setTeacher(TbUser teacher)
	{
		this.teacher = teacher;
	}

	@Override
	public String toString()
	{
		return "TbExam [id=" + id + ", title=" + title + ", teacherId=" + teacherId + ", teacher=" + teacher
				+ ", createTime=" + createTime + ", needCamera=" + needCamera + ", isPublic=" + isPublic + ", price="
				+ price + ", diff=" + diff + ", timeStart=" + timeStart + ", timeStop=" + timeStop
				+ ", timePublicMarks=" + timePublicMarks + ", timeLast=" + timeLast + ", maxSwitch=" + maxSwitch
				+ ", allowBrowseAfterTime=" + allowBrowseAfterTime + ", marks=" + marks + ", totalMark=" + totalMark
				+ "]";
	}
	
}
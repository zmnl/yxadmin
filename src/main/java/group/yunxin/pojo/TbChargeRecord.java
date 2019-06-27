package group.yunxin.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbChargeRecord implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1910025947071552644L;

	private Long id;

	private String title;

	private Long userId;
	
	private TbUser user;

	private Date time;

	private Double moneyNum;

	private Double pointNum;

	private Integer status;// 0 1

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

	public Long getUserId()
	{
		return userId;
	}

	public void setUserId(Long userId)
	{
		this.userId = userId;
	}

	public Date getTime()
	{
		return time;
	}

	public void setTime(Date time)
	{
		this.time = time;
	}

	public Double getMoneyNum()
	{
		return moneyNum;
	}

	public void setMoneyNum(Double moneyNum)
	{
		this.moneyNum = moneyNum;
	}

	public Double getPointNum()
	{
		return pointNum;
	}

	public void setPointNum(Double pointNum)
	{
		this.pointNum = pointNum;
	}

	public Integer getStatus()
	{
		return status;
	}

	public void setStatus(Integer status)
	{
		this.status = status;
	}

	public TbUser getUser()
	{
		return user;
	}

	public void setUser(TbUser user)
	{
		this.user = user;
	}
	@Override
	public String toString()
	{
		return "TbChargeRecord [id=" + id + ", title=" + title + ", userId=" + userId + ", user=" + user + ", time="
				+ time + ", moneyNum=" + moneyNum + ", pointNum=" + pointNum + ", status=" + status + "]";
	}
}
package group.yunxin.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbBank implements Serializable
{
	private static final long serialVersionUID = 5921959205574342247L;

	private Long id;

	private String describe;

	private String name;

	private Long teacherId;
	
	private TbUser teacher;

	private Date createTime; // 这个字段原含义废弃掉，意义改为是否公开，非null即意为公开

	private Date updateTime;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getDescribe()
	{
		return describe;
	}

	public void setDescribe(String describe)
	{
		this.describe = describe == null ? null : describe.trim();
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name == null ? null : name.trim();
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

	public Date getUpdateTime()
	{
		return updateTime;
	}

	public void setUpdateTime(Date updateTime)
	{
		this.updateTime = updateTime;
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
		return "TbBank [id=" + id + ", describe=" + describe + ", name=" + name + ", teacherId=" + teacherId
				+ ", teacher=" + teacher + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

}
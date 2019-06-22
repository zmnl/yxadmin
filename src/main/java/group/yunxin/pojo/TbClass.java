package group.yunxin.pojo;

import java.io.Serializable;

public class TbClass implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4453575347050235680L;

	private Long id;

	private String name;

	private String description;

	private Long teacherId;

	private TbUser teacher;
	
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name == null ? null : name.trim();
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description == null ? null : description.trim();
	}

	public Long getTeacherId()
	{
		return teacherId;
	}

	public void setTeacherId(Long teacherId)
	{
		this.teacherId = teacherId;
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
		return "TbClass [id=" + id + ", name=" + name + ", description=" + description + ", teacherId=" + teacherId
				+ ", teacher=" + teacher + "]";
	}
	
}
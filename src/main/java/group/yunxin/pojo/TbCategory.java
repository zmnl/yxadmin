package group.yunxin.pojo;

import java.io.Serializable;

public class TbCategory implements Serializable
{
	private static final long serialVersionUID = -4747591264357147820L;

	private Long id;

	private String name;

	private Long fromId;//教师id，-1的话为默认id
	
	private TbUser from;

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

	public Long getFromId()
	{
		return fromId;
	}

	public void setFromId(Long fromId)
	{
		this.fromId = fromId;
	}

	public TbUser getFrom()
	{
		return from;
	}

	public void setFrom(TbUser from)
	{
		this.from = from;
	}

	@Override
	public String toString()
	{
		return "TbCategory [id=" + id + ", name=" + name + ", fromId=" + fromId + ", from=" + from + "]";
	}
	
}
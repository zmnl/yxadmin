package group.yunxin.pojo;

import java.io.Serializable;

public class TbClassUser implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5107498768606123445L;

	private Long userId;

	private Long classId;

	public Long getUserId()
	{
		return userId;
	}

	public void setUserId(Long userId)
	{
		this.userId = userId;
	}

	public Long getClassId()
	{
		return classId;
	}

	public void setClassId(Long classId)
	{
		this.classId = classId;
	}

	@Override
	public String toString()
	{
		return "TbClassUser [userId=" + userId + ", classId=" + classId + "]";
	}
	
	
}
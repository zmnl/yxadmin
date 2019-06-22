package group.yunxin.pojo;

import java.io.Serializable;

public class TbExamUser implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -904024614181926285L;

	private Long examId;

	private Long userId;

	public Long getExamId()
	{
		return examId;
	}

	public void setExamId(Long examId)
	{
		this.examId = examId;
	}

	public Long getUserId()
	{
		return userId;
	}

	public void setUserId(Long userId)
	{
		this.userId = userId;
	}

	@Override
	public String toString()
	{
		return "TbExamUser [examId=" + examId + ", userId=" + userId + "]";
	}
	
	
}
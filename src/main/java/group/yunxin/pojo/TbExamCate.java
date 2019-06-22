package group.yunxin.pojo;

import java.io.Serializable;

public class TbExamCate implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3978649302418455621L;

	/**
	 * 
	 */

	private Long cateId;

	private Long examId;

	public Long getCateId()
	{
		return cateId;
	}

	public void setCateId(Long cateId)
	{
		this.cateId = cateId;
	}

	public Long getExamId()
	{
		return examId;
	}

	public void setExamId(Long examId)
	{
		this.examId = examId;
	}

	@Override
	public String toString()
	{
		return "TbExamCate [cateId=" + cateId + ", examId=" + examId + "]";
	}
	
}
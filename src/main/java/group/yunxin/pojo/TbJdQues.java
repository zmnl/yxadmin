package group.yunxin.pojo;

import java.io.Serializable;

public class TbJdQues implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8764666160894790401L;

	private Long quesId;

	private TbQues ques;

	private Integer minLength;

	private Integer maxLength;

	public Long getQuesId()
	{
		return quesId;
	}

	public void setQuesId(Long quesId)
	{
		this.quesId = quesId;
	}

	public Integer getMinLength()
	{
		return minLength;
	}

	public void setMinLength(Integer minLength)
	{
		this.minLength = minLength;
	}

	public Integer getMaxLength()
	{
		return maxLength;
	}

	public void setMaxLength(Integer maxLength)
	{
		this.maxLength = maxLength;
	}

	public TbQues getQues()
	{
		return ques;
	}

	public void setQues(TbQues ques)
	{
		this.ques = ques;
	}

	@Override
	public String toString()
	{
		return "TbJdQues [quesId=" + quesId + ", ques=" + ques + ", minLength=" + minLength + ", maxLength=" + maxLength
				+ "]";
	}
	
	
	
}
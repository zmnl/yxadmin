package group.yunxin.pojo;

import java.io.Serializable;

public class TbTkQues implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4238452094139308478L;
	private Long quesId;
	private TbQues ques;

	private Integer numBlanks;

	public Long getQuesId()
	{
		return quesId;
	}

	public void setQuesId(Long quesId)
	{
		this.quesId = quesId;
	}

	public Integer getNumBlanks()
	{
		return numBlanks;
	}

	public void setNumBlanks(Integer numBlanks)
	{
		this.numBlanks = numBlanks;
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
		return "TbTkQues [quesId=" + quesId + ", ques=" + ques + ", numBlanks=" + numBlanks + "]";
	}
	
	
}
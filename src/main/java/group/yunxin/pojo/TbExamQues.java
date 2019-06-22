package group.yunxin.pojo;

import java.io.Serializable;

public class TbExamQues implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7384691284575079464L;

	private Long examId;

	private Long quesId;

	public Long getExamId()
	{
		return examId;
	}

	public void setExamId(Long examId)
	{
		this.examId = examId;
	}

	public Long getQuesId()
	{
		return quesId;
	}

	public void setQuesId(Long quesId)
	{
		this.quesId = quesId;
	}

	@Override
	public String toString()
	{
		return "TbExamQues [examId=" + examId + ", quesId=" + quesId + "]";
	}
	
	
}
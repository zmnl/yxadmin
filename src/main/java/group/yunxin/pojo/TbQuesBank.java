package group.yunxin.pojo;

import java.io.Serializable;

public class TbQuesBank implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 63337467703091632L;

	private Long quesId;

	private Long bankId;

	public Long getQuesId()
	{
		return quesId;
	}

	public void setQuesId(Long quesId)
	{
		this.quesId = quesId;
	}

	public Long getBankId()
	{
		return bankId;
	}

	public void setBankId(Long bankId)
	{
		this.bankId = bankId;
	}

	@Override
	public String toString()
	{
		return "TbQuesBank [quesId=" + quesId + ", bankId=" + bankId + "]";
	}
	
	
}
package group.yunxin.pojo;

import java.io.Serializable;

public class TbBcQues implements Serializable
{
	private static final long serialVersionUID = -1129248154068404710L;

	private Long quesId;
	
	private TbQues ques;

	private String result;

	private String language;

	public Long getQuesId()
	{
		return quesId;
	}

	public void setQuesId(Long quesId)
	{
		this.quesId = quesId;
	}

	public String getResult()
	{
		return result;
	}

	public void setResult(String result)
	{
		this.result = result == null ? null : result.trim();
	}

	public String getLanguage()
	{
		return language;
	}

	public void setLanguage(String language)
	{
		this.language = language == null ? null : language.trim();
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
		return "TbBcQues [quesId=" + quesId + ", ques=" + ques + ", result=" + result + ", language=" + language + "]";
	}
	
}
package group.yunxin.pojo;

import java.io.Serializable;

public class TbOneAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8254841583054916770L;

	private Long id;

	private Long paperId;
	
	private TbPaper paper;

	private Long quesId;
	
	private TbQues ques;

	private String answer;

	private Integer mark;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getPaperId()
	{
		return paperId;
	}

	public void setPaperId(Long paperId)
	{
		this.paperId = paperId;
	}

	public Long getQuesId()
	{
		return quesId;
	}

	public void setQuesId(Long quesId)
	{
		this.quesId = quesId;
	}

	public String getAnswer()
	{
		return answer;
	}

	public void setAnswer(String answer)
	{
		this.answer = answer == null ? null : answer.trim();
	}

	public Integer getMark()
	{
		return mark;
	}

	public void setMark(Integer mark)
	{
		this.mark = mark;
	}

	public TbPaper getPaper()
	{
		return paper;
	}

	public void setPaper(TbPaper paper)
	{
		this.paper = paper;
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
		return "TbOneAnswer [id=" + id + ", paperId=" + paperId + ", paper=" + paper + ", quesId=" + quesId + ", ques="
				+ ques + ", answer=" + answer + ", mark=" + mark + "]";
	}
	
	
}
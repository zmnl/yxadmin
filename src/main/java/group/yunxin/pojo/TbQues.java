package group.yunxin.pojo;

import java.io.Serializable;

public class TbQues implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4545970568294077755L;

	private Long id;

	private Long teacherId;

	private TbUser teacher;

	private String steam;

	private String explanation;

	private Integer diff; //难度 0 1 2 由低到高

	private String answer;

	private String pic;

	private Integer kind; //0：选择题 1：填空题 2：编程题 3：简答题 4：判断题


	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getTeacherId()
	{
		return teacherId;
	}

	public void setTeacherId(Long teacherId)
	{
		this.teacherId = teacherId;
	}

	public String getSteam()
	{
		return steam;
	}

	public void setSteam(String steam)
	{
		this.steam = steam == null ? null : steam.trim();
	}

	public String getExplanation()
	{
		return explanation;
	}

	public void setExplanation(String explanation)
	{
		this.explanation = explanation == null ? null : explanation.trim();
	}

	public Integer getDiff()
	{
		return diff;
	}

	public void setDiff(Integer diff)
	{
		this.diff = diff;
	}

	public String getAnswer()
	{
		return answer;
	}

	public void setAnswer(String answer)
	{
		this.answer = answer == null ? null : answer.trim();
	}

	public String getPic()
	{
		return pic;
	}

	public void setPic(String pic)
	{
		this.pic = pic == null ? null : pic.trim();
	}

	public Integer getKind()
	{
		return kind;
	}

	public void setKind(Integer kind)
	{
		this.kind = kind;
	}

	public TbUser getTeacher()
	{
		return teacher;
	}

	public void setTeacher(TbUser teacher)
	{
		this.teacher = teacher;
	}

	@Override
	public String toString()
	{
		return "TbQues [id=" + id + ", teacherId=" + teacherId + ", teacher=" + teacher + ", steam=" + steam
				+ ", explanation=" + explanation + ", diff=" + diff + ", answer=" + answer + ", pic=" + pic + ", kind="
				+ kind + "]";
	}
	
	
}
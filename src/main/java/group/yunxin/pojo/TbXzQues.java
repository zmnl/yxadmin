package group.yunxin.pojo;

import java.io.Serializable;

public class TbXzQues implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -106116081536520577L;

	private Long quesId;
	
	private TbQues ques;

	private String opa;

	private String opb;

	private String opc;

	private String opd;

	private Integer type;

	public Long getQuesId()
	{
		return quesId;
	}

	public void setQuesId(Long quesId)
	{
		this.quesId = quesId;
	}

	public String getOpa()
	{
		return opa;
	}

	public void setOpa(String opa)
	{
		this.opa = opa == null ? null : opa.trim();
	}

	public String getOpb()
	{
		return opb;
	}

	public void setOpb(String opb)
	{
		this.opb = opb == null ? null : opb.trim();
	}

	public String getOpc()
	{
		return opc;
	}

	public void setOpc(String opc)
	{
		this.opc = opc == null ? null : opc.trim();
	}

	public String getOpd()
	{
		return opd;
	}

	public void setOpd(String opd)
	{
		this.opd = opd == null ? null : opd.trim();
	}

	public Integer getType()
	{
		return type;
	}

	public void setType(Integer type)
	{
		this.type = type;
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
		return "TbXzQues [quesId=" + quesId + ", ques=" + ques + ", opa=" + opa + ", opb=" + opb + ", opc=" + opc
				+ ", opd=" + opd + ", type=" + type + "]";
	}
	
}
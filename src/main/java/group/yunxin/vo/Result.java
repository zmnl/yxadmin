package group.yunxin.vo;

import java.io.Serializable;

public class Result implements Serializable
{

	private static final long serialVersionUID = 6967543165964067115L;
	private boolean success;
	private String message;

	public Result()
	{
		super();
	}
	public Result(boolean success, String message)
	{
		super();
		this.success = success;
		this.message = message;
	}
	public boolean isSuccess()
	{
		return success;
	}
	public void setSuccess(boolean success)
	{
		this.success = success;
	}
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}

}

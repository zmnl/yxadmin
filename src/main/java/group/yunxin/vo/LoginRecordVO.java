package group.yunxin.vo;

import java.io.Serializable;
import java.util.Date;

import group.yunxin.pojo.TbUser;

public class LoginRecordVO implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -237002449152856987L;

	private Long id;

	private TbUser user;

	private Date loginTime;

	private Long back1;

	private String back2;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public TbUser User()
	{
		return user;
	}

	public void setUser(TbUser user)
	{
		this.user = user;
	}

	public Date getLoginTime()
	{
		return loginTime;
	}

	public void setLoginTime(Date loginTime)
	{
		this.loginTime = loginTime;
	}

	public Long getBack1()
	{
		return back1;
	}

	public void setBack1(Long back1)
	{
		this.back1 = back1;
	}

	public String getBack2()
	{
		return back2;
	}

	public void setBack2(String back2)
	{
		this.back2 = back2 == null ? null : back2.trim();
	}
}
package group.yunxin.pojo;

import java.io.Serializable;

public class TbUser implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5319101519269817826L;

	private Long id;

	private String password;

	private String name;

	private String pic;

	private String email; 

	private String qq;

	private String weichat;

	private String detail;

	private Long points;

	private Integer role;

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

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password == null ? null : password.trim();
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name == null ? null : name.trim();
	}

	public String getPic()
	{
		return pic;
	}

	public void setPic(String pic)
	{
		this.pic = pic == null ? null : pic.trim();
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email == null ? null : email.trim();
	}

	public String getQq()
	{
		return qq;
	}

	public void setQq(String qq)
	{
		this.qq = qq == null ? null : qq.trim();
	}

	public String getWeichat()
	{
		return weichat;
	}

	public void setWeichat(String weichat)
	{
		this.weichat = weichat == null ? null : weichat.trim();
	}

	public String getDetail()
	{
		return detail;
	}

	public void setDetail(String detail)
	{
		this.detail = detail == null ? null : detail.trim();
	}

	public Long getPoints()
	{
		return points;
	}

	public void setPoints(Long points)
	{
		this.points = points;
	}

	public Integer getRole()
	{
		return role;
	}

	public void setRole(Integer role)
	{
		this.role = role;
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

	@Override
	public String toString()
	{
		return "TbUser [id=" + id + ", password=" + password + ", name=" + name + ", pic=" + pic + ", email=" + email
				+ ", qq=" + qq + ", weichat=" + weichat + ", detail=" + detail + ", points=" + points + ", role=" + role
				+ ", back1=" + back1 + ", back2=" + back2 + "]";
	}
	
	
}
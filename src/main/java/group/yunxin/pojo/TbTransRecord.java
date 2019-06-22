package group.yunxin.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbTransRecord implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2049349067802483376L;

	private Long id;

	private Long buyerId;

	private TbUser buyer;

	private Long sellerId;

	private TbUser seller;

	private Date time;

	private String title;

	private Double pointNum;

	private Long paperId;

	private Integer status;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getBuyerId()
	{
		return buyerId;
	}

	public void setBuyerId(Long buyerId)
	{
		this.buyerId = buyerId;
	}

	public Long getSellerId()
	{
		return sellerId;
	}

	public void setSellerId(Long sellerId)
	{
		this.sellerId = sellerId;
	}

	public Date getTime()
	{
		return time;
	}

	public void setTime(Date time)
	{
		this.time = time;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title == null ? null : title.trim();
	}

	public Double getPointNum()
	{
		return pointNum;
	}

	public void setPointNum(Double pointNum)
	{
		this.pointNum = pointNum;
	}

	public Long getPaperId()
	{
		return paperId;
	}

	public void setPaperId(Long paperId)
	{
		this.paperId = paperId;
	}

	public Integer getStatus()
	{
		return status;
	}

	public void setStatus(Integer status)
	{
		this.status = status;
	}

	public TbUser getBuyer()
	{
		return buyer;
	}

	public void setBuyer(TbUser buyer)
	{
		this.buyer = buyer;
	}

	public TbUser getSeller()
	{
		return seller;
	}

	public void setSeller(TbUser seller)
	{
		this.seller = seller;
	}

	@Override
	public String toString()
	{
		return "TbTransRecord [id=" + id + ", buyerId=" + buyerId + ", buyer=" + buyer + ", sellerId=" + sellerId
				+ ", seller=" + seller + ", time=" + time + ", title=" + title + ", pointNum=" + pointNum + ", paperId="
				+ paperId + ", status=" + status + "]";
	}
	
	
}
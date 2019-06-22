package group.yunxin.vo;

import java.io.Serializable;
import java.util.List;

public class PageResult implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8183856498519496910L;

	private long total;
	private List<?> rows;

	public PageResult()
	{
		super();
	}
	public PageResult(long total, List<?> rows)
	{
		super();
		this.total = total;
		this.rows = rows;
	}
	public long getTotal()
	{
		return total;
	}
	public void setTotal(long total)
	{
		this.total = total;
	}
	public List<?> getRows()
	{
		return rows;
	}
	public void setRows(List<?> rows)
	{
		this.rows = rows;
	}

}

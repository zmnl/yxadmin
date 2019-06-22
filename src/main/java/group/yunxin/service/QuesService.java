package group.yunxin.service;

import java.util.List;

import group.yunxin.pojo.TbQues;
import group.yunxin.vo.PageResult;

/**
 * 服务层接口
 * 
 * @author Administrator
 *
 */
public interface QuesService
{

	/**
	 * 返回全部列表
	 * 
	 * @return
	 */
	public List<TbQues> findAll();

	/**
	 * 返回分页列表
	 * 
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);

	/**
	 * 增加
	 */
	public void add(TbQues ques);

	/**
	 * 修改
	 */
	public void update(TbQues ques);

	/**
	 * 根据ID获取实体
	 * 
	 * @param id
	 * @return
	 */
	public TbQues findOne(Long id);

	/**
	 * 批量删除
	 * 
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * 
	 * @param pageNum  当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbQues ques, int pageNum, int pageSize);

}

package group.yunxin.service;

import java.util.List;

import group.yunxin.pojo.TbOneAnswer;
import group.yunxin.vo.PageResult;

/**
 * 服务层接口
 * 
 * @author Administrator
 *
 */
public interface OneAnswerService
{

	/**
	 * 返回全部列表
	 * 
	 * @return
	 */
	public List<TbOneAnswer> findAll();

	/**
	 * 返回分页列表
	 * 
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);

	/**
	 * 增加
	 */
	public void add(TbOneAnswer oneAnswer);

	/**
	 * 修改
	 */
	public void update(TbOneAnswer oneAnswer);

	/**
	 * 根据ID获取实体
	 * 
	 * @param id
	 * @return
	 */
	public TbOneAnswer findOne(Long id);

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
	public PageResult findPage(TbOneAnswer oneAnswer, int pageNum, int pageSize);

}

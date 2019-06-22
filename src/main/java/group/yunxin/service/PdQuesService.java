package group.yunxin.service;
import java.util.List;
import group.yunxin.pojo.TbPdQues;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface PdQuesService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbPdQues> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbPdQues pdQues);
	
	
	/**
	 * 修改
	 */
	public void update(TbPdQues pdQues);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbPdQues findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long [] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbPdQues pdQues, int pageNum,int pageSize);
	
}

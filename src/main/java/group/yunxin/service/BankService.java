package group.yunxin.service;
import java.util.List;

import group.yunxin.pojo.TbBank;
import group.yunxin.vo.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface BankService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbBank> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbBank bank);
	
	
	/**
	 * 修改
	 */
	public void update(TbBank bank);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbBank findOne(Long id);
	
	
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
	public PageResult findPage(TbBank bank, int pageNum,int pageSize);
	
}

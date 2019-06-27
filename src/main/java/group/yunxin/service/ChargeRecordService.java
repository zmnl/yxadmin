package group.yunxin.service;

import java.util.List;

import group.yunxin.pojo.TbChargeRecord;
import group.yunxin.vo.PageResult;

/**
 * 服务层接口
 * 
 * @author Administrator
 *
 */
public interface ChargeRecordService
{

	/**
	 * 返回全部列表
	 * 
	 * @return
	 */
	public List<TbChargeRecord> findAll();

	/**
	 * 返回分页列表
	 * 
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);

	/**
	 * 增加
	 */
	public void add(TbChargeRecord chargeRecord);

	/**
	 * 修改
	 */
	public void update(TbChargeRecord chargeRecord);

	/**
	 * 根据ID获取实体
	 * 
	 * @param id
	 * @return
	 */
	public TbChargeRecord findOne(Long id);

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
	public PageResult findPage(TbChargeRecord chargeRecord, int pageNum, int pageSize);

	/**
	 * 得到14天充值记录
	 * @return
	 */
	public List<Double> getRecord();

}

package group.yunxin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import group.yunxin.mapper.TbLoginRecordMapper;
import group.yunxin.pojo.TbLoginRecord;
import group.yunxin.pojo.TbLoginRecordExample;
import group.yunxin.pojo.TbLoginRecordExample.Criteria;
import group.yunxin.service.LoginRecordService;
import group.yunxin.vo.PageResult;

/**
 * 服务实现层
 * 
 * @author Administrator
 *
 */
@Service
public class LoginRecordServiceImpl implements LoginRecordService
{

	@Autowired
	private TbLoginRecordMapper loginRecordMapper;

	/**
	 * 查询全部
	 */
	@Override
	public List<TbLoginRecord> findAll()
	{
		return loginRecordMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);
		Page<TbLoginRecord> page = (Page<TbLoginRecord>) loginRecordMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbLoginRecord loginRecord)
	{
		loginRecordMapper.insert(loginRecord);
	}

	/**
	 * 修改
	 */
	@Override
	public void update(TbLoginRecord loginRecord)
	{
		loginRecordMapper.updateByPrimaryKey(loginRecord);
	}

	/**
	 * 根据ID获取实体
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public TbLoginRecord findOne(Long id)
	{
		return loginRecordMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids)
	{
		for (Long id : ids)
		{
			loginRecordMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public PageResult findPage(TbLoginRecord loginRecord, int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);

		TbLoginRecordExample example = new TbLoginRecordExample();
		Criteria criteria = example.createCriteria();

		if (loginRecord != null)
		{
			if (loginRecord.getBack2() != null && loginRecord.getBack2().length() > 0)
			{
				criteria.andBack2Like("%" + loginRecord.getBack2() + "%");
			}

		}

		Page<TbLoginRecord> page = (Page<TbLoginRecord>) loginRecordMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

}

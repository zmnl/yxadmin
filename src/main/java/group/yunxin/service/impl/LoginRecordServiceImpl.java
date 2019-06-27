package group.yunxin.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
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

	/**
	 * 查询近两周登录记录
	 */
	@Override
	public List<Integer> getLoginRecord()
	{
		List<Integer> rs = new LinkedList<Integer>();
		Date date2 = new Date();
		Date date1 = new Date();
		date1.setHours(0);
		date1.setMinutes(0);
		date1.setSeconds(0);
		TbLoginRecordExample example = null;
		for (int i = 0; i < 14; i++)
		{
			example = new TbLoginRecordExample();
			Criteria criteria = example.createCriteria();
			criteria.andLoginTimeBetween(date1, date2);
			rs.add(loginRecordMapper.countByExample(example));
			//往前一天
			date2 = date1;
			Calendar c = Calendar.getInstance();
			c.setTime(date1);
			c.add(Calendar.DAY_OF_MONTH, -1);
			date1 = c.getTime();
		}
		return rs;
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

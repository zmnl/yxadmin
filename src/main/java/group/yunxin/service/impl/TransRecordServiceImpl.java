package group.yunxin.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import group.yunxin.mapper.TbTransRecordMapper;
import group.yunxin.pojo.TbTransRecord;
import group.yunxin.pojo.TbTransRecordExample;
import group.yunxin.pojo.TbTransRecordExample.Criteria;
import group.yunxin.service.TransRecordService;
import group.yunxin.vo.PageResult;

/**
 * 服务实现层
 * 
 * @author Administrator
 *
 */
@Service
public class TransRecordServiceImpl implements TransRecordService
{

	@Autowired
	private TbTransRecordMapper transRecordMapper;

	/**
	 * 查询全部
	 */
	@Override
	public List<TbTransRecord> findAll()
	{
		return transRecordMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);
		Page<TbTransRecord> page = (Page<TbTransRecord>) transRecordMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbTransRecord transRecord)
	{
		transRecordMapper.insert(transRecord);
	}

	/**
	 * 修改
	 */
	@Override
	public void update(TbTransRecord transRecord)
	{
		transRecordMapper.updateByPrimaryKey(transRecord);
	}

	/**
	 * 根据ID获取实体
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public TbTransRecord findOne(Long id)
	{
		return transRecordMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids)
	{
		for (Long id : ids)
		{
			transRecordMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public PageResult findPage(TbTransRecord transRecord, int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);

		TbTransRecordExample example = new TbTransRecordExample();
		Criteria criteria = example.createCriteria();

		if (transRecord != null)
		{
			if (transRecord.getTitle() != null && transRecord.getTitle().length() > 0)
			{
				criteria.andTitleLike("%" + transRecord.getTitle() + "%");
			}

		}

		Page<TbTransRecord> page = (Page<TbTransRecord>) transRecordMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public List<Double> getRecord()
	{
		List<Double> rs = new LinkedList<Double>();
		Date date1 = new Date();
		date1.setHours(0);
		date1.setMinutes(0);
		date1.setSeconds(0);
		Date date2 = new Date();

		for (int i = 0; i < 14; i++)
		{
			TbTransRecordExample example = new TbTransRecordExample();
			Criteria criteria = example.createCriteria();
			criteria.andTimeBetween(date1, date2);
			criteria.andStatusEqualTo(1);
			List<TbTransRecord> list = transRecordMapper.selectByExample(example);
			double today = 0;

			for (TbTransRecord t : list)
			{
				today += t.getPointNum();
			}

			rs.add(today);
			date2 = date1;
			Calendar c = Calendar.getInstance();
			c.setTime(date1);

			c.add(Calendar.DAY_OF_MONTH, -1);
			date1 = c.getTime();

		}
		return rs;
	}

}

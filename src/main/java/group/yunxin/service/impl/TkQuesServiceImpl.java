package group.yunxin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import group.yunxin.mapper.TbTkQuesMapper;
import group.yunxin.pojo.TbTkQues;
import group.yunxin.pojo.TbTkQuesExample;
import group.yunxin.pojo.TbTkQuesExample.Criteria;
import group.yunxin.service.TkQuesService;
import group.yunxin.vo.PageResult;

/**
 * 服务实现层
 * 
 * @author Administrator
 *
 */
@Service
public class TkQuesServiceImpl implements TkQuesService
{

	@Autowired
	private TbTkQuesMapper tkQuesMapper;

	/**
	 * 查询全部
	 */
	@Override
	public List<TbTkQues> findAll()
	{
		return tkQuesMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);
		Page<TbTkQues> page = (Page<TbTkQues>) tkQuesMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbTkQues tkQues)
	{
		tkQuesMapper.insert(tkQues);
	}

	/**
	 * 修改
	 */
	@Override
	public void update(TbTkQues tkQues)
	{
		tkQuesMapper.updateByPrimaryKey(tkQues);
	}

	/**
	 * 根据ID获取实体
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public TbTkQues findOne(Long id)
	{
		return tkQuesMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids)
	{
		for (Long id : ids)
		{
			tkQuesMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public PageResult findPage(TbTkQues tkQues, int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);

		TbTkQuesExample example = new TbTkQuesExample();
		Criteria criteria = example.createCriteria();

		if (tkQues != null)
		{

		}

		Page<TbTkQues> page = (Page<TbTkQues>) tkQuesMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

}

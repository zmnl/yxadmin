package group.yunxin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import group.yunxin.mapper.TbJdQuesMapper;
import group.yunxin.pojo.TbJdQues;
import group.yunxin.pojo.TbJdQuesExample;
import group.yunxin.pojo.TbJdQuesExample.Criteria;
import group.yunxin.service.JdQuesService;
import group.yunxin.vo.PageResult;

/**
 * 服务实现层
 * 
 * @author Administrator
 *
 */
@Service
public class JdQuesServiceImpl implements JdQuesService
{

	@Autowired
	private TbJdQuesMapper jdQuesMapper;

	/**
	 * 查询全部
	 */
	@Override
	public List<TbJdQues> findAll()
	{
		return jdQuesMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);
		Page<TbJdQues> page = (Page<TbJdQues>) jdQuesMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbJdQues jdQues)
	{
		jdQuesMapper.insert(jdQues);
	}

	/**
	 * 修改
	 */
	@Override
	public void update(TbJdQues jdQues)
	{
		jdQuesMapper.updateByPrimaryKey(jdQues);
	}

	/**
	 * 根据ID获取实体
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public TbJdQues findOne(Long id)
	{
		return jdQuesMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids)
	{
		for (Long id : ids)
		{
			jdQuesMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public PageResult findPage(TbJdQues jdQues, int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);

		TbJdQuesExample example = new TbJdQuesExample();
		Criteria criteria = example.createCriteria();

		if (jdQues != null)
		{

		}

		Page<TbJdQues> page = (Page<TbJdQues>) jdQuesMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

}

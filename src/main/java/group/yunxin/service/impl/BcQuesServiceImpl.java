package group.yunxin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import group.yunxin.mapper.TbBcQuesMapper;
import group.yunxin.pojo.TbBcQues;
import group.yunxin.pojo.TbBcQuesExample;
import group.yunxin.pojo.TbBcQuesExample.Criteria;
import group.yunxin.service.BcQuesService;
import group.yunxin.vo.PageResult;

/**
 * 服务实现层
 * 
 * @author Administrator
 *
 */
@Service
public class BcQuesServiceImpl implements BcQuesService
{

	@Autowired
	private TbBcQuesMapper bcQuesMapper;

	/**
	 * 查询全部
	 */
	@Override
	public List<TbBcQues> findAll()
	{
		return bcQuesMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);
		Page<TbBcQues> page = (Page<TbBcQues>) bcQuesMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbBcQues bcQues)
	{
		bcQuesMapper.insert(bcQues);
	}

	/**
	 * 修改
	 */
	@Override
	public void update(TbBcQues bcQues)
	{
		bcQuesMapper.updateByPrimaryKey(bcQues);
	}

	/**
	 * 根据ID获取实体
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public TbBcQues findOne(Long id)
	{
		return bcQuesMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids)
	{
		for (Long id : ids)
		{
			bcQuesMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public PageResult findPage(TbBcQues bcQues, int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);

		TbBcQuesExample example = new TbBcQuesExample();
		Criteria criteria = example.createCriteria();

		if (bcQues != null)
		{
			if (bcQues.getResult() != null && bcQues.getResult().length() > 0)
			{
				criteria.andResultLike("%" + bcQues.getResult() + "%");
			}
			if (bcQues.getLanguage() != null && bcQues.getLanguage().length() > 0)
			{
				criteria.andLanguageLike("%" + bcQues.getLanguage() + "%");
			}

		}

		Page<TbBcQues> page = (Page<TbBcQues>) bcQuesMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

}

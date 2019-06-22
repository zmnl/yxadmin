package group.yunxin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import group.yunxin.mapper.TbQuesMapper;
import group.yunxin.pojo.TbQues;
import group.yunxin.pojo.TbQuesExample;
import group.yunxin.pojo.TbQuesExample.Criteria;
import group.yunxin.service.QuesService;
import group.yunxin.vo.PageResult;

/**
 * 服务实现层
 * 
 * @author Administrator
 *
 */
@Service
public class QuesServiceImpl implements QuesService
{

	@Autowired
	private TbQuesMapper quesMapper;

	/**
	 * 查询全部
	 */
	@Override
	public List<TbQues> findAll()
	{
		return quesMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);
		Page<TbQues> page = (Page<TbQues>) quesMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbQues ques)
	{
		quesMapper.insert(ques);
	}

	/**
	 * 修改
	 */
	@Override
	public void update(TbQues ques)
	{
		quesMapper.updateByPrimaryKey(ques);
	}

	/**
	 * 根据ID获取实体
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public TbQues findOne(Long id)
	{
		return quesMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids)
	{
		for (Long id : ids)
		{
			quesMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public PageResult findPage(TbQues ques, int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);

		TbQuesExample example = new TbQuesExample();
		Criteria criteria = example.createCriteria();

		if (ques != null)
		{
			if (ques.getSteam() != null && ques.getSteam().length() > 0)
			{
				criteria.andSteamLike("%" + ques.getSteam() + "%");
			}
			if (ques.getExplanation() != null && ques.getExplanation().length() > 0)
			{
				criteria.andExplanationLike("%" + ques.getExplanation() + "%");
			}
			if (ques.getAnswer() != null && ques.getAnswer().length() > 0)
			{
				criteria.andAnswerLike("%" + ques.getAnswer() + "%");
			}
			if (ques.getPic() != null && ques.getPic().length() > 0)
			{
				criteria.andPicLike("%" + ques.getPic() + "%");
			}

		}

		Page<TbQues> page = (Page<TbQues>) quesMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

}

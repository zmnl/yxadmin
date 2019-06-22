package group.yunxin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import group.yunxin.mapper.TbPaperMapper;
import group.yunxin.pojo.TbPaper;
import group.yunxin.pojo.TbPaperExample;
import group.yunxin.pojo.TbPaperExample.Criteria;
import group.yunxin.service.PaperService;
import group.yunxin.vo.PageResult;

/**
 * 服务实现层
 * 
 * @author Administrator
 *
 */
@Service
public class PaperServiceImpl implements PaperService
{

	@Autowired
	private TbPaperMapper paperMapper;

	/**
	 * 查询全部
	 */
	@Override
	public List<TbPaper> findAll()
	{
		return paperMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);
		Page<TbPaper> page = (Page<TbPaper>) paperMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbPaper paper)
	{
		paperMapper.insert(paper);
	}

	/**
	 * 修改
	 */
	@Override
	public void update(TbPaper paper)
	{
		paperMapper.updateByPrimaryKey(paper);
	}

	/**
	 * 根据ID获取实体
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public TbPaper findOne(Long id)
	{
		return paperMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids)
	{
		for (Long id : ids)
		{
			paperMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public PageResult findPage(TbPaper paper, int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);

		TbPaperExample example = new TbPaperExample();
		Criteria criteria = example.createCriteria();

		if (paper != null)
		{

		}

		Page<TbPaper> page = (Page<TbPaper>) paperMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

}

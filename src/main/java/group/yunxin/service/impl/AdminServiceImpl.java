package group.yunxin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import group.yunxin.mapper.TbAdminMapper;
import group.yunxin.pojo.TbAdmin;
import group.yunxin.pojo.TbAdminExample;
import group.yunxin.pojo.TbAdminExample.Criteria;
import group.yunxin.service.AdminService;
import group.yunxin.vo.PageResult;

/**
 * 服务实现层
 * 
 * @author Administrator
 *
 */
@Service
public class AdminServiceImpl implements AdminService
{

	@Autowired
	private TbAdminMapper adminMapper;

	/**
	 * 查询全部
	 */
	@Override
	public List<TbAdmin> findAll()
	{
		return adminMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);
		Page<TbAdmin> page = (Page<TbAdmin>) adminMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbAdmin admin)
	{
		adminMapper.insert(admin);
	}

	/**
	 * 修改
	 */
	@Override
	public void update(TbAdmin admin)
	{
		adminMapper.updateByPrimaryKey(admin);
	}

	/**
	 * 根据ID获取实体
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public TbAdmin findOne(Long id)
	{
		return adminMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids)
	{
		for (Long id : ids)
		{
			adminMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public PageResult findPage(TbAdmin admin, int pageNum, int pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);

		TbAdminExample example = new TbAdminExample();
		Criteria criteria = example.createCriteria();

		if (admin != null)
		{
			if (admin.getPassword() != null && admin.getPassword().length() > 0)
			{
				criteria.andPasswordLike("%" + admin.getPassword() + "%");
			}
			if (admin.getEmail() != null && admin.getEmail().length() > 0)
			{
				criteria.andEmailLike("%" + admin.getEmail() + "%");
			}
			if (admin.getQq() != null && admin.getQq().length() > 0)
			{
				criteria.andQqLike("%" + admin.getQq() + "%");
			}
			if (admin.getDetail() != null && admin.getDetail().length() > 0)
			{
				criteria.andDetailLike("%" + admin.getDetail() + "%");
			}
			if (admin.getBack2() != null && admin.getBack2().length() > 0)
			{
				criteria.andBack2Like("%" + admin.getBack2() + "%");
			}

		}

		Page<TbAdmin> page = (Page<TbAdmin>) adminMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

}

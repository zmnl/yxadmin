package group.yunxin.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import group.yunxin.mapper.TbCategoryMapper;
import group.yunxin.pojo.TbCategory;
import com.pinyougou.pojo.TbCategoryExample;
import com.pinyougou.pojo.TbCategoryExample.Criteria;
import group.yunxin.service.CategoryService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private TbCategoryMapper categoryMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCategory> findAll() {
		return categoryMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCategory> page=   (Page<TbCategory>) categoryMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCategory category) {
		categoryMapper.insert(category);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCategory category){
		categoryMapper.updateByPrimaryKey(category);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCategory findOne(Long id){
		return categoryMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			categoryMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbCategory category, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCategoryExample example=new TbCategoryExample();
		Criteria criteria = example.createCriteria();
		
		if(category!=null){			
						if(category.getName()!=null && category.getName().length()>0){
				criteria.andNameLike("%"+category.getName()+"%");
			}
	
		}
		
		Page<TbCategory> page= (Page<TbCategory>)categoryMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

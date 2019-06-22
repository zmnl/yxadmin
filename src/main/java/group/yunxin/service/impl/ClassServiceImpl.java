package group.yunxin.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import group.yunxin.mapper.TbClassMapper;
import group.yunxin.pojo.TbClass;
import group.yunxin.pojo.TbClassExample;
import group.yunxin.pojo.TbClassExample.Criteria;
import group.yunxin.service.ClassService;
import group.yunxin.vo.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ClassServiceImpl implements ClassService {

	@Autowired
	private TbClassMapper classMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbClass> findAll() {
		return classMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbClass> page=   (Page<TbClass>) classMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbClass tbClass) {
		classMapper.insert(tbClass);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbClass tbClass){
		classMapper.updateByPrimaryKey(tbClass);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbClass findOne(Long id){
		return classMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			classMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbClass tbClass, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbClassExample example=new TbClassExample();
		Criteria criteria = example.createCriteria();
		
		if(tbClass!=null){			
						if(tbClass.getName()!=null && tbClass.getName().length()>0){
				criteria.andNameLike("%"+tbClass.getName()+"%");
			}
			if(tbClass.getDescription()!=null && tbClass.getDescription().length()>0){
				criteria.andDescriptionLike("%"+tbClass.getDescription()+"%");
			}
	
		}
		
		Page<TbClass> page= (Page<TbClass>)classMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

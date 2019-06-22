package group.yunxin.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import group.yunxin.mapper.TbPdQuesMapper;
import group.yunxin.pojo.TbPdQues;
import com.pinyougou.pojo.TbPdQuesExample;
import com.pinyougou.pojo.TbPdQuesExample.Criteria;
import group.yunxin.service.PdQuesService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class PdQuesServiceImpl implements PdQuesService {

	@Autowired
	private TbPdQuesMapper pdQuesMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbPdQues> findAll() {
		return pdQuesMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbPdQues> page=   (Page<TbPdQues>) pdQuesMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbPdQues pdQues) {
		pdQuesMapper.insert(pdQues);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbPdQues pdQues){
		pdQuesMapper.updateByPrimaryKey(pdQues);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbPdQues findOne(Long id){
		return pdQuesMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			pdQuesMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbPdQues pdQues, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbPdQuesExample example=new TbPdQuesExample();
		Criteria criteria = example.createCriteria();
		
		if(pdQues!=null){			
						if(pdQues.getBack()!=null && pdQues.getBack().length()>0){
				criteria.andBackLike("%"+pdQues.getBack()+"%");
			}
	
		}
		
		Page<TbPdQues> page= (Page<TbPdQues>)pdQuesMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

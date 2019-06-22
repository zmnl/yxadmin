package group.yunxin.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import group.yunxin.mapper.TbXzQuesMapper;
import group.yunxin.pojo.TbXzQues;
import com.pinyougou.pojo.TbXzQuesExample;
import com.pinyougou.pojo.TbXzQuesExample.Criteria;
import group.yunxin.service.XzQuesService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class XzQuesServiceImpl implements XzQuesService {

	@Autowired
	private TbXzQuesMapper xzQuesMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbXzQues> findAll() {
		return xzQuesMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbXzQues> page=   (Page<TbXzQues>) xzQuesMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbXzQues xzQues) {
		xzQuesMapper.insert(xzQues);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbXzQues xzQues){
		xzQuesMapper.updateByPrimaryKey(xzQues);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbXzQues findOne(Long id){
		return xzQuesMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			xzQuesMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbXzQues xzQues, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbXzQuesExample example=new TbXzQuesExample();
		Criteria criteria = example.createCriteria();
		
		if(xzQues!=null){			
						if(xzQues.getOpA()!=null && xzQues.getOpA().length()>0){
				criteria.andOpALike("%"+xzQues.getOpA()+"%");
			}
			if(xzQues.getOpB()!=null && xzQues.getOpB().length()>0){
				criteria.andOpBLike("%"+xzQues.getOpB()+"%");
			}
			if(xzQues.getOpC()!=null && xzQues.getOpC().length()>0){
				criteria.andOpCLike("%"+xzQues.getOpC()+"%");
			}
			if(xzQues.getOpD()!=null && xzQues.getOpD().length()>0){
				criteria.andOpDLike("%"+xzQues.getOpD()+"%");
			}
	
		}
		
		Page<TbXzQues> page= (Page<TbXzQues>)xzQuesMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

package group.yunxin.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import group.yunxin.mapper.TbOneAnswerMapper;
import group.yunxin.pojo.TbOneAnswer;
import com.pinyougou.pojo.TbOneAnswerExample;
import com.pinyougou.pojo.TbOneAnswerExample.Criteria;
import group.yunxin.service.OneAnswerService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class OneAnswerServiceImpl implements OneAnswerService {

	@Autowired
	private TbOneAnswerMapper oneAnswerMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbOneAnswer> findAll() {
		return oneAnswerMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbOneAnswer> page=   (Page<TbOneAnswer>) oneAnswerMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbOneAnswer oneAnswer) {
		oneAnswerMapper.insert(oneAnswer);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbOneAnswer oneAnswer){
		oneAnswerMapper.updateByPrimaryKey(oneAnswer);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbOneAnswer findOne(Long id){
		return oneAnswerMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			oneAnswerMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbOneAnswer oneAnswer, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbOneAnswerExample example=new TbOneAnswerExample();
		Criteria criteria = example.createCriteria();
		
		if(oneAnswer!=null){			
						if(oneAnswer.getAnswer()!=null && oneAnswer.getAnswer().length()>0){
				criteria.andAnswerLike("%"+oneAnswer.getAnswer()+"%");
			}
	
		}
		
		Page<TbOneAnswer> page= (Page<TbOneAnswer>)oneAnswerMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

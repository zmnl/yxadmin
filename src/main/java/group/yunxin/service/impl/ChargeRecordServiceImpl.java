package group.yunxin.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import group.yunxin.mapper.TbChargeRecordMapper;
import group.yunxin.pojo.TbChargeRecord;
import com.pinyougou.pojo.TbChargeRecordExample;
import com.pinyougou.pojo.TbChargeRecordExample.Criteria;
import group.yunxin.service.ChargeRecordService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ChargeRecordServiceImpl implements ChargeRecordService {

	@Autowired
	private TbChargeRecordMapper chargeRecordMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbChargeRecord> findAll() {
		return chargeRecordMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbChargeRecord> page=   (Page<TbChargeRecord>) chargeRecordMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbChargeRecord chargeRecord) {
		chargeRecordMapper.insert(chargeRecord);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbChargeRecord chargeRecord){
		chargeRecordMapper.updateByPrimaryKey(chargeRecord);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbChargeRecord findOne(Long id){
		return chargeRecordMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			chargeRecordMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbChargeRecord chargeRecord, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbChargeRecordExample example=new TbChargeRecordExample();
		Criteria criteria = example.createCriteria();
		
		if(chargeRecord!=null){			
						if(chargeRecord.getTitle()!=null && chargeRecord.getTitle().length()>0){
				criteria.andTitleLike("%"+chargeRecord.getTitle()+"%");
			}
	
		}
		
		Page<TbChargeRecord> page= (Page<TbChargeRecord>)chargeRecordMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

package group.yunxin.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import group.yunxin.mapper.TbBankMapper;
import group.yunxin.pojo.TbBank;
import group.yunxin.pojo.TbBankExample;
import group.yunxin.pojo.TbBankExample.Criteria;
import group.yunxin.service.BankService;
import group.yunxin.vo.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private TbBankMapper bankMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbBank> findAll() {
		return bankMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbBank> page=   (Page<TbBank>) bankMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbBank bank) {
		bankMapper.insert(bank);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbBank bank){
		bankMapper.updateByPrimaryKey(bank);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbBank findOne(Long id){
		return bankMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			bankMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbBank bank, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbBankExample example=new TbBankExample();
		Criteria criteria = example.createCriteria();
		
		if(bank!=null){			
						if(bank.getDescribe()!=null && bank.getDescribe().length()>0){
				criteria.andDescribeLike("%"+bank.getDescribe()+"%");
			}
			if(bank.getName()!=null && bank.getName().length()>0){
				criteria.andNameLike("%"+bank.getName()+"%");
			}
	
		}
		
		Page<TbBank> page= (Page<TbBank>)bankMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

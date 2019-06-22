package group.yunxin.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import group.yunxin.mapper.TbExamMapper;
import group.yunxin.pojo.TbExam;
import group.yunxin.pojo.TbExamExample;
import group.yunxin.pojo.TbExamExample.Criteria;
import group.yunxin.service.ExamService;
import group.yunxin.vo.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private TbExamMapper examMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbExam> findAll() {
		return examMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbExam> page=   (Page<TbExam>) examMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbExam exam) {
		examMapper.insert(exam);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbExam exam){
		examMapper.updateByPrimaryKey(exam);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbExam findOne(Long id){
		return examMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			examMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbExam exam, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbExamExample example=new TbExamExample();
		Criteria criteria = example.createCriteria();
		
		if(exam!=null){			
						if(exam.getTitle()!=null && exam.getTitle().length()>0){
				criteria.andTitleLike("%"+exam.getTitle()+"%");
			}
			if(exam.getMarks()!=null && exam.getMarks().length()>0){
				criteria.andMarksLike("%"+exam.getMarks()+"%");
			}
	
		}
		
		Page<TbExam> page= (Page<TbExam>)examMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

package group.yunxin.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.yunxin.pojo.TbExam;
import group.yunxin.service.ExamService;
import group.yunxin.vo.PageResult;
import group.yunxin.vo.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/exam")
public class ExamController {

	@Autowired
	private ExamService examService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbExam> findAll(){			
		return examService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return examService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param exam
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbExam exam){
		try {
			examService.add(exam);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param exam
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbExam exam){
		try {
			examService.update(exam);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbExam findOne(Long id){
		return examService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			examService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbExam exam, int page, int rows  ){
		return examService.findPage(exam, page, rows);		
	}
	
}

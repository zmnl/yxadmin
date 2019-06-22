package group.yunxin.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.yunxin.pojo.TbQues;
import group.yunxin.service.QuesService;
import group.yunxin.vo.PageResult;
import group.yunxin.vo.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/ques")
public class QuesController {

	@Autowired
	private QuesService quesService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbQues> findAll(){			
		return quesService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return quesService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param ques
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbQues ques){
		try {
			quesService.add(ques);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param ques
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbQues ques){
		try {
			quesService.update(ques);
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
	public TbQues findOne(Long id){
		return quesService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			quesService.delete(ids);
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
	public PageResult search(@RequestBody TbQues ques, int page, int rows  ){
		return quesService.findPage(ques, page, rows);		
	}
	
}

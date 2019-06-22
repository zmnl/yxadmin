package group.yunxin.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.yunxin.pojo.TbPdQues;
import group.yunxin.service.PdQuesService;
import group.yunxin.vo.PageResult;
import group.yunxin.vo.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/pdQues")
public class PdQuesController {

	@Autowired
	private PdQuesService pdQuesService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbPdQues> findAll(){			
		return pdQuesService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return pdQuesService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param pdQues
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbPdQues pdQues){
		try {
			pdQuesService.add(pdQues);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param pdQues
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbPdQues pdQues){
		try {
			pdQuesService.update(pdQues);
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
	public TbPdQues findOne(Long id){
		return pdQuesService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			pdQuesService.delete(ids);
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
	public PageResult search(@RequestBody TbPdQues pdQues, int page, int rows  ){
		return pdQuesService.findPage(pdQues, page, rows);		
	}
	
}

package group.yunxin.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import group.yunxin.pojo.TbOneAnswer;
import group.yunxin.[path_3].service.OneAnswerService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/oneAnswer")
public class OneAnswerController {

	@Reference
	private OneAnswerService oneAnswerService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbOneAnswer> findAll(){			
		return oneAnswerService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return oneAnswerService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param oneAnswer
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbOneAnswer oneAnswer){
		try {
			oneAnswerService.add(oneAnswer);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param oneAnswer
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbOneAnswer oneAnswer){
		try {
			oneAnswerService.update(oneAnswer);
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
	public TbOneAnswer findOne(Long id){
		return oneAnswerService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			oneAnswerService.delete(ids);
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
	public PageResult search(@RequestBody TbOneAnswer oneAnswer, int page, int rows  ){
		return oneAnswerService.findPage(oneAnswer, page, rows);		
	}
	
}

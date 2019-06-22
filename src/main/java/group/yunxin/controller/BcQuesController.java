package group.yunxin.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import group.yunxin.pojo.TbBcQues;
import group.yunxin.[path_3].service.BcQuesService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/bcQues")
public class BcQuesController {

	@Reference
	private BcQuesService bcQuesService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbBcQues> findAll(){			
		return bcQuesService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return bcQuesService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param bcQues
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbBcQues bcQues){
		try {
			bcQuesService.add(bcQues);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param bcQues
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbBcQues bcQues){
		try {
			bcQuesService.update(bcQues);
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
	public TbBcQues findOne(Long id){
		return bcQuesService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			bcQuesService.delete(ids);
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
	public PageResult search(@RequestBody TbBcQues bcQues, int page, int rows  ){
		return bcQuesService.findPage(bcQues, page, rows);		
	}
	
}
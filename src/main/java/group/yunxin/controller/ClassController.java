package group.yunxin.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.yunxin.pojo.TbClass;
import group.yunxin.service.ClassService;
import group.yunxin.vo.PageResult;
import group.yunxin.vo.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/class")
public class ClassController {

	@Autowired
	private ClassService classService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbClass> findAll(){			
		return classService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return classService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param class
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbClass tbClass){
		try {
			classService.add(tbClass);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param class
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbClass tbClass){
		try {
			classService.update(tbClass);
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
	public TbClass findOne(Long id){
		return classService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			classService.delete(ids);
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
	public PageResult search(@RequestBody TbClass tbClass, int page, int rows  ){
		return classService.findPage(tbClass, page, rows);		
	}
	
}

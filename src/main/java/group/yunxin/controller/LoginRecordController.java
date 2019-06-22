package group.yunxin.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.yunxin.pojo.TbLoginRecord;
import group.yunxin.service.LoginRecordService;
import group.yunxin.vo.PageResult;
import group.yunxin.vo.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/loginRecord")
public class LoginRecordController {

	@Autowired
	private LoginRecordService loginRecordService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbLoginRecord> findAll(){			
		return loginRecordService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return loginRecordService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param loginRecord
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbLoginRecord loginRecord){
		try {
			loginRecordService.add(loginRecord);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param loginRecord
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbLoginRecord loginRecord){
		try {
			loginRecordService.update(loginRecord);
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
	public TbLoginRecord findOne(Long id){
		return loginRecordService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			loginRecordService.delete(ids);
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
	public PageResult search(@RequestBody TbLoginRecord loginRecord, int page, int rows  ){
		return loginRecordService.findPage(loginRecord, page, rows);		
	}
	
}

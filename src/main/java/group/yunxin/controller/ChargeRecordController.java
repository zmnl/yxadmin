package group.yunxin.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.yunxin.pojo.TbChargeRecord;
import group.yunxin.service.ChargeRecordService;
import group.yunxin.vo.PageResult;
import group.yunxin.vo.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/chargeRecord")
public class ChargeRecordController {

	@Autowired
	private ChargeRecordService chargeRecordService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbChargeRecord> findAll(){			
		return chargeRecordService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return chargeRecordService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param chargeRecord
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbChargeRecord chargeRecord){
		try {
			chargeRecordService.add(chargeRecord);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param chargeRecord
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbChargeRecord chargeRecord){
		try {
			chargeRecordService.update(chargeRecord);
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
	public TbChargeRecord findOne(Long id){
		return chargeRecordService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			chargeRecordService.delete(ids);
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
	public PageResult search(@RequestBody TbChargeRecord chargeRecord, int page, int rows  ){
		return chargeRecordService.findPage(chargeRecord, page, rows);		
	}
	
}

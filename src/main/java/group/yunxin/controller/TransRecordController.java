package group.yunxin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.yunxin.pojo.TbTransRecord;
import group.yunxin.service.TransRecordService;
import group.yunxin.vo.PageResult;
import group.yunxin.vo.Result;

/**
 * controller
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/transRecord")
public class TransRecordController
{

	@Autowired
	private TransRecordService transRecordService;

	/**
	 * 返回全部列表
	 * 
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbTransRecord> findAll()
	{
		return transRecordService.findAll();
	}

	/**
	 * 返回全部列表
	 * 
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows)
	{
		return transRecordService.findPage(page, rows);
	}

	/**
	 * 增加
	 * 
	 * @param transRecord
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbTransRecord transRecord)
	{
		try
		{
			transRecordService.add(transRecord);
			return new Result(true, "增加成功");
		} catch (Exception e)
		{
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}

	/**
	 * 修改
	 * 
	 * @param transRecord
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbTransRecord transRecord)
	{
		try
		{
			transRecordService.update(transRecord);
			return new Result(true, "修改成功");
		} catch (Exception e)
		{
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}

	/**
	 * 获取实体
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbTransRecord findOne(Long id)
	{
		return transRecordService.findOne(id);
	}

	/**
	 * 批量删除
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long[] ids)
	{
		try
		{
			transRecordService.delete(ids);
			return new Result(true, "删除成功");
		} catch (Exception e)
		{
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}

	/**
	 * 查询+分页
	 * 
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbTransRecord transRecord, int page, int rows)
	{
		return transRecordService.findPage(transRecord, page, rows);
	}

}

package group.yunxin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.yunxin.pojo.TbBank;
import group.yunxin.service.BankService;
import group.yunxin.vo.PageResult;
import group.yunxin.vo.Result;

/**
 * controller
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/bank")
public class BankController
{

	@Autowired
	private BankService bankService;

	/**
	 * 返回全部列表
	 * 
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbBank> findAll()
	{
		return bankService.findAll();
	}

	/**
	 * 返回全部列表
	 * 
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows)
	{
		return bankService.findPage(page, rows);
	}

	/**
	 * 增加
	 * 
	 * @param bank
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbBank bank)
	{
		try
		{
			bankService.add(bank);
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
	 * @param bank
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbBank bank)
	{
		try
		{
			bankService.update(bank);
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
	public TbBank findOne(Long id)
	{
		return bankService.findOne(id);
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
			bankService.delete(ids);
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
	public PageResult search(@RequestBody TbBank bank, int page, int rows)
	{
		return bankService.findPage(bank, page, rows);
	}

}

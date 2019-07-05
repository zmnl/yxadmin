package group.yunxin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group.yunxin.pojo.TbAdmin;
import group.yunxin.service.AdminService;
import group.yunxin.utils.MD5Util;
import group.yunxin.vo.PageResult;
import group.yunxin.vo.Result;

/**
 * controller
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/admin")
public class AdminController
{

	@Autowired
	private AdminService adminService;

	/**
	 * 返回全部列表
	 * 
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbAdmin> findAll()
	{
		return adminService.findAll();
	}

	/**
	 * 返回全部列表
	 * 
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows)
	{
		return adminService.findPage(page, rows);
	}

	/**
	 * 增加
	 * 
	 * @param admin
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbAdmin admin)
	{
		try
		{
			adminService.add(admin);
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
	 * @param admin
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbAdmin admin)
	{
		try
		{
			adminService.update(admin);
			return new Result(true, "修改成功");
		} catch (Exception e)
		{
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}

	@RequestMapping("/login")
	public Boolean test(HttpServletRequest request,String id, String password) {
		TbAdmin admin = adminService.findOne(Long.parseLong(id));
		if (admin == null)
			return false;
		else if (MD5Util.md5Encrypt32Upper(password).equals(admin.getPassword()))
		{
			request.getSession().setAttribute("admin", admin);
			return true;
		}
		else
			return false;
    }
	
	@RequestMapping("/getLogin")
	public TbAdmin getLogin(HttpServletRequest request) {
		return (TbAdmin)request.getSession().getAttribute("admin");
	}
	@RequestMapping("/logout")
	public void logout(HttpServletRequest request) {
		request.getSession().removeAttribute("admin");
	}

	
	/**
	 * 获取实体
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbAdmin findOne(Long id)
	{
		return adminService.findOne(id);
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
			adminService.delete(ids);
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
	public PageResult search(@RequestBody TbAdmin admin, int page, int rows)
	{
		return adminService.findPage(admin, page, rows);
	}

}

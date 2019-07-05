package group.yunxin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import group.yunxin.pojo.TbAdmin;
import group.yunxin.service.AdminService;
import group.yunxin.util.MD5Util;

/**
 * controller
 * 
 * @author Administrator
 *
 */
@RestController
public class LoginController
{

	@Autowired
	private AdminService adminService;

//	@RequestMapping(value = "login1")
//	public ModelAndView login1(Long id, String password)
//	{
//		TbAdmin user = adminService.findOne(id);
//		ModelAndView m = null;
//		if (user != null && MD5Util.md5Encrypt32Upper(user.getPassword()).equals(password))
//		{
//			m = new ModelAndView();
//			m.addObject("user", user);
//			m.addObject("alert", null);
//			m.setViewName("modal/index3.html");
//		}
//		else
//		{
//			m = new ModelAndView();
//			m.addObject("alert", "登录失败，请重试！");
//			m.setViewName("modal/indexadmin.html");
//		}
//		return m;
//	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Long id, String password, HttpSession httpSession)
	{
		TbAdmin user = adminService.findOne(id);
		if (user != null && MD5Util.md5Encrypt32Upper(user.getPassword()).equals(password))
		{
			httpSession.setAttribute("user", user);
			return "success";
		}
		else
		{
			return "false";
		}
	}
}

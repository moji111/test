package controller;

import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.modeler.modules.ModelerSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bean.UserModel;


@Controller
@RequestMapping("user")
public class UserController {

//	@RequestMapping("AAA")
//	public String bdc() {
//		return "yingyingying";
//	}
//	@RequestMapping("result")
//	public String login(UserModel userModel ,Model model)
//	{
//		System.out.println(userModel);
//		model.addAttribute("AA", userModel.getCode());
//		return "result";
//	}
	
	@RequestMapping("retry")
	@ResponseBody
	public String login2(UserModel model) {
		//return userService.login(model);
		return "abc";
	}
	
	@RequestMapping("aretry")
	@ResponseBody
	public UserModel login3(UserModel model)
	{
		return model;
	}
	
	@RequestMapping("login")
	@ResponseBody
	public String login(UserModel userModel,String authCode,Model model,HttpSession session) {
			System.out.println(userModel);
			model.addAttribute("AA",userModel.getCode());//存数据带到下一个页面
			if (authCode.equals(session.getAttribute("authCode"))) {
				System.out.println("true");
			}
			return "result";
		}

	
	
	
}


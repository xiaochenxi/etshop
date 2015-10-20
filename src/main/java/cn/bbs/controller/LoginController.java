package cn.bbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bbs.service.UserService;


@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="index.do")
	public String login(){
		return "login";
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}

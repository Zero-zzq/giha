package com.mashen.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mashen.service.IUserService;


@Controller
@RequestMapping("/test")
public class UserController {
	@Resource(name="userServiceImp")
private IUserService userServiceImp;
	
	@RequestMapping("/test1")
	public String test(){
		System.out.println("进来了");
		userServiceImp.add();
		return "success";
	}
}

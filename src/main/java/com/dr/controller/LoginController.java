package com.dr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dr.beans.User;
import com.dr.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/test")
public class LoginController {
   @Autowired
   private UserServiceImpl userService;
@RequestMapping("/dologin.do")
   public String dologin(User user,Model model){
	if(userService.doUserLogin(user)){
		model.addAttribute("name",user.getUsername());
		model.addAttribute("successMsg","��½�ɹ�");

		return "/success";
		
	}else{
		model.addAttribute("failMsg","�û������ڻ��������");
		return "/fail";
	}
	
	
	
	
}
   
}

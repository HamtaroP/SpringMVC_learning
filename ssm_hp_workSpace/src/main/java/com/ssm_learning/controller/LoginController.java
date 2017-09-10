package com.ssm_learning.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm_learning.domain.User;
import com.ssm_learning.service.IUserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	 @Resource
	 private IUserService userService;  
	
	 @RequestMapping("/checkPassword")
		public void checkPassword(HttpServletRequest request,HttpServletResponse response ,Model model){
		 	User user = this.userService.getUserById(21);  
	        model.addAttribute("user", user);
	        HashMap<Object, Object> map = new HashMap<>();
	        PrintWriter out = null;
	        try {
				out = response.getWriter();
				out.print("test");
		        out.flush();
		        out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}

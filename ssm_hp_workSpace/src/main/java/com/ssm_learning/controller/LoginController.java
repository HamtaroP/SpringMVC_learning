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

import com.alibaba.fastjson.JSONObject;
import com.ssm_learning.domain.User;
import com.ssm_learning.service.IUserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	 @Resource
	 private IUserService userService;  
	
	 @RequestMapping("/checkPassword")
		public void checkPassword(HttpServletRequest request,HttpServletResponse response ,Model model){
		 	User user = this.userService.getUserById(1);  
	        model.addAttribute("user", user);
	        
	        PrintWriter out = null;
	        String uJson = JSONObject.toJSONString(user);
	        try {
	        	response.setCharacterEncoding("UTF-8");
	        	response.setHeader("contentType", "text/html; charset=utf-8");
				out = response.getWriter();
				out.write(uJson);
		        out.flush();
		        out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}

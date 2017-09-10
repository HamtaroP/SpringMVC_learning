package com.ssm_learning.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm_learning.domain.User;
import com.ssm_learning.service.IUserService;

@Controller
public class UserController {
		@Resource  
	    private IUserService userService;  
	      
		 @RequestMapping("/showUser")  
		    public String toIndex(HttpServletRequest request,Model model){  
		        int userId = Integer.parseInt(request.getParameter("id"));  
		        User user = this.userService.getUserById(userId);  
		        model.addAttribute("user", user);  
		        return "showUser";     
	    }
		 @RequestMapping("/index")
			public String showIndex(HttpServletRequest request,Model model){
			    return "index";
			}
}

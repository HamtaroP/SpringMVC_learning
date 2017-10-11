package com.ssm_learning.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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
	 
	 @RequestMapping("/uploadFile")
		public void uploadFile(HttpServletRequest request,HttpServletResponse response ,Model model){
		 MultipartHttpServletRequest Murequest = (MultipartHttpServletRequest)request;
         Map<String, MultipartFile> files = Murequest.getFileMap();//得到文件map对象
         System.out.println(files.size());
         
         for(MultipartFile file :files.values()){
            String fileName=file.getOriginalFilename();
             File tagetFile = new File("E:/"+fileName);//创建文件对象
             if(!tagetFile.exists()){//文件名不存在 则新建文件，并将文件复制到新建文件中
                 try {
                     tagetFile.createNewFile();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
                 try {
                     file.transferTo(tagetFile);
                 } catch (IllegalStateException e) {
                     e.printStackTrace();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }

             }
         }
         System.out.println("接收完毕");
		}
}

package com.hp.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hp.baseTest.SpringTestCase;
import com.ssm_learning.domain.User;
import com.ssm_learning.service.IUserService;

public class UserServiceTest extends SpringTestCase {
	 @Autowired  
	    private IUserService userService;  
	    Logger logger = Logger.getLogger(UserServiceTest.class);  
	      
	    @Test  
	    public void selectUserByIdTest(){  
	        User user = userService.getUserById(1);  
	        logger.info("²éÕÒ½á¹û" + user); 
	    }  
	      
}

package com.ssm_learning.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm_learning.IDao_UserMapper;
import com.ssm_learning.domain.User;
import com.ssm_learning.service.IUserService;
@Service("userService")
public class IUserServiceImpl implements IUserService {
	@Autowired
	private IDao_UserMapper idao_user;
	@Override
	public User getUserById(int userId) {
		return idao_user.selectByPrimaryKey(userId);
	}

}

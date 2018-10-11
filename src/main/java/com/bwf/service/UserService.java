package com.bwf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bwf.dao.UserMapper;
import com.bwf.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	User getUserById(Integer userId){
		
		return userMapper.getUserById(userId);
	}
}

package com.bwf.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.bwf.entity.User;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations="classpath:application-context.xml")
public class UserServiceTest {
	
	@Autowired
	UserService userService;
	@Test
	public void testGetBy(){
		User user = userService.getUserById(3);
	
		System.out.println(user.getGender());
	}
	
}

package com.chikitbd.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chikitbd.dao.UserMapper;
import com.chikitbd.model.User;


@Service("user")
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public void insert(String name,Date date,double salary) {
		// TODO Auto-generated method stub
		User user = new User(-1, name, date, salary);
		userMapper.save(user);
		
	}
	
}

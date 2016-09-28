package com.chikitbd.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chikitbd.dao.PositionMapper;
import com.chikitbd.dao.UserMapper;
import com.chikitbd.model.Position;
import com.chikitbd.model.User;
import com.chikitbd.utils.MD5Utils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class MyTest {

	@Autowired
	private UserMapper userMapper;
	

	@Test
	public void test() {
		User user = new User(-1, "Lancebd", new Date(), 20000.2);
		userMapper.save(user);
		
	}

}

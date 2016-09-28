package com.chikitbd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chikitbd.dao.TestMMapper;
import com.chikitbd.model.TestM;


@Service("test")
public class TestService {
	@Autowired
	private TestMMapper testMMapper;
	
	public TestM getTestM() {
		TestM testM = (TestM) testMMapper.getTestM(1);
		return testM;
	}
	
}

package com.chikitbd.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chikitbd.model.TestM;
import com.chikitbd.service.TestService;
import com.chikitbd.service.UserService;


@Controller
public class TestController extends BaseController {

	@Autowired
	private TestService testService;
	@Autowired
	private UserService userService;
	@RequestMapping(value="helloSM")
	public String testSM() {
		request.setAttribute("hello", "Hello SM!");
		return "index";
	}
	
	@RequestMapping(value="helloSSM")
	public String testSSM() {
		System.out.println("+++++++++++++");
		TestM testM = testService.getTestM();
		request.setAttribute("testM", testM);
		System.out.println(testM);
		return "index";
	}
	
	@RequestMapping(value="addUser")
	public String addUser() {
		System.out.println("+++++++++++++");
		userService.insert("Tom", new Date(), 2000.00);
		return "index";
	}
	
}

package com.springpractice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
@RequestMapping(value="/welcometogit",method = RequestMethod.GET)	
public void m1() {

	System.out.println("Hello World !!");
	System.out.println("my changes not reflected");
}
}

package com.oracle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	//http://localhost:8080/spring-mvc/sayHello.do
	/*
	http-protocol
	localhost-machine
	8080-tomcat running in this port
	spring-mvc- projectname
	sayHello.do - controller method
	*/
	
	@GetMapping(path = "/sayHello.do")
	public String sayHello() {
		return "hello";	//this will return /WEB-INF/views/hello.jsp
	}
}

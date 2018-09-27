package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("home")
	public String home() {
		return "Home";
	}
	
	@RequestMapping("registration")
	public String register() {
		return "Register";
	}
	
	@RequestMapping("login")
	public String login() {
		return "Login";
	}
}

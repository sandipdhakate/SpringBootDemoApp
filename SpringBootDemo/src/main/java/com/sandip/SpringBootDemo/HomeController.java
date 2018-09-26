package com.sandip.SpringBootDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("home")
	public String home() {
		return "Home";
	}
	
	@RequestMapping("register")
	public String register() {
		return "Register";
	}
	
	@RequestMapping("login")
	public String login() {
		return "Login";
	}
}

package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	EmployeeDAO employeeDAO;

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
	
	@RequestMapping("addEmployee")
	public String addEmployee(Employee employee) {
		employeeDAO.save(employee);
		return "Register";
	}
}

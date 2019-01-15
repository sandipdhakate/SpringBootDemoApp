package com.employee.controller;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeDAO extends CrudRepository<Employee, Integer>{

}

package com.luizpsg.cruddemo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizpsg.cruddemo.entity.Employee;
import com.luizpsg.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

  private EmployeeService employeeService;

  //@Autowired
  public EmployeeRestController(EmployeeService theEmployeeService) {
    employeeService = theEmployeeService;
  }

  @GetMapping("/employees")
  public List<Employee> findAll() {
    return employeeService.findAll();
  }


}









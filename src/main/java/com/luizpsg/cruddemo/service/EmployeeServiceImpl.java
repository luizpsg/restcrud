package com.luizpsg.cruddemo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luizpsg.cruddemo.dao.EmployeeDAO;
import com.luizpsg.cruddemo.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService{

  private EmployeeDAO employeeDAO;

  //@Autowired
  public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
    employeeDAO = theEmployeeDAO;
  }

  @Override
  public List<Employee> findAll() {
    return employeeDAO.findAll();
  }

  @Override
  public Employee findById(int theId) {
    return employeeDAO.findById(theId);
  }

  @Transactional
  @Override
  public Employee save(Employee theEmployee) {
    return employeeDAO.save(theEmployee);
  }

  @Transactional
  @Override
  public void deleteById(int theId) {
    employeeDAO.deleteById(theId);
  }

}

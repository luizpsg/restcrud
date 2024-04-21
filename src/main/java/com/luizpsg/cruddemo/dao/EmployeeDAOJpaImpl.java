package com.luizpsg.cruddemo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.luizpsg.cruddemo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

  private EntityManager entityManager;

  //@Autowired
  public EmployeeDAOJpaImpl(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  @Override
  public List<Employee> findAll() {
    //create-execute-return query

    TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

    List<Employee> employees = theQuery.getResultList();

    return employees;
  }

  @Override
  public Employee findById(int theId) {
    
    Employee theEmployee = entityManager.find(Employee.class, theId);

    return theEmployee;
  }

  @Override
  public Employee save(Employee theEmployee) {
    
    Employee dbEmployee = entityManager.merge(theEmployee);

    return dbEmployee;

  }

  @Override
  public void deleteById(int theId) {
    
    Employee theEmployee = entityManager.find(Employee.class, theId);

    entityManager.remove(theEmployee);
  }

}

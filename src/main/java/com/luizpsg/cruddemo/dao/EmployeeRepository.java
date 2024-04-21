package com.luizpsg.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizpsg.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

package com.coforge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.dao.EmployeeDao;
import com.coforge.entities.Employee;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	EmployeeDao dao;

	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	public int addEmployee(Employee employee) {
		return dao.addEmployee(employee);

	}

	public Employee getEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}

	public boolean updateEmployee(Employee employee) {
		return dao.updateEmployee(employee);
	}

	public boolean deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

}

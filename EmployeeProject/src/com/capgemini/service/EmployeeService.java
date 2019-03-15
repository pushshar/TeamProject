package com.capgemini.service;

import com.capgemini.beans.Employee;
import com.capgemini.exception.InvalidEmployeeIdException;
import com.capgemini.exception.NoDataFoundException;

public interface EmployeeService {
	public Employee save(Employee employee) throws InvalidEmployeeIdException;
	public Employee find(int employeeId) throws NoDataFoundException;
}

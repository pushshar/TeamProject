package com.capgemini.repo;

import com.capgemini.beans.Employee;

public interface EmployeeRepo {
	public Employee save(Employee employee);

	public Employee find(int employeeId);

}

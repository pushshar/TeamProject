package com.capgemini.service;


import com.capgemini.beans.Employee;
import com.capgemini.exception.InvalidEmployeeIdException;
import com.capgemini.exception.NoDataFoundException;
import com.capgemini.repo.EmployeeRepo;
import com.capgemini.repo.EmployeeRepoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepo repo=new EmployeeRepoImpl();
	@Override
	public Employee save(Employee employee) throws InvalidEmployeeIdException {
		if(repo.find(employee.getEmployeeId())!=null)
			throw new InvalidEmployeeIdException("Duplicate Id");
		return repo.save(employee);
	}

	@Override
	public Employee find(int employeeId) throws NoDataFoundException {
		if(repo.find(employeeId)==null)
			throw new NoDataFoundException("Employee id does not match");
		return repo.find(employeeId);
	}

}

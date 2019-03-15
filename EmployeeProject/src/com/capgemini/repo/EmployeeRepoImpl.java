package com.capgemini.repo;

import java.util.HashMap;
import java.util.Map.Entry;

import com.capgemini.beans.Employee;

public class EmployeeRepoImpl implements EmployeeRepo {
	HashMap<Integer,Employee> employeeList=new HashMap<>();

	@Override
	public Employee save(Employee employee) {
//		save Employee if there is no duplicate Id
//		or 
//		return null if employee has duplicate Id
		if(this.find(employee.getEmployeeId())==null)
		{
			employeeList.put(employee.getEmployeeId(), employee);
			return employee;
		}
		else
		{
			return null;
		}
	}

	@Override
	public Employee find(int employeeId) {
//		return null if employee Id does not matched
		
		for(Entry<Integer,Employee> entry:employeeList.entrySet())
		{
			if(entry.getKey()==employeeId)
				return (entry.getValue());
		}
		return null;
	}

}

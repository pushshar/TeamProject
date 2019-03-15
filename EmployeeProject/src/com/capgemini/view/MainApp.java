package com.capgemini.view;

import java.util.Scanner;

import com.capgemini.beans.Employee;
import com.capgemini.exception.InvalidEmployeeIdException;
import com.capgemini.exception.NoDataFoundException;
import com.capgemini.service.EmployeeService;
import com.capgemini.service.EmployeeServiceImpl;

public class MainApp {

	private static Scanner scanner = new Scanner(System.in);
	private static EmployeeService employeeService = new EmployeeServiceImpl();
	private static Employee employee;

	public static void main(String[] args) {
		int choice;
		while (true) {
			System.out.println("*****Team Project*******");
			System.out.println("1: Save Employee details.");
			System.out.println("2: Find Employee by ID.");
			System.out.println("3: Exit.");
			System.out.println("\nEnter your choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				saveStudent();
				break;
			case 2:
				findEmployee();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Please! Enter a valid choice.");
			}

		}

	}

	private static void saveStudent() {

		System.out.println("Enter Employee ID: ");
		int employeeId = scanner.nextInt();
		System.out.println("Enter Employee Name: ");
		String employeeName = scanner.next();
		double employeeSalary = scanner.nextDouble();
		employee.setEmployeeId(employeeId);
		employee.setEmployeeName(employeeName);
		employee.setSalary(employeeSalary);
		try {
			employeeService.save(employee);
		} catch (InvalidEmployeeIdException e) {
			e.getMessage();
		}
		System.out.println("Employee details added successfully.");

	}

	private static void findEmployee() {
		System.out.println("Enter Employee Id to get that Employee's details: ");
		int employeeId = scanner.nextInt();
		try {
			System.out.println(employeeService.find(employeeId));
		} catch (NoDataFoundException e) {
			e.getMessage();
		}

	}

}

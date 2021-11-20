package com.company.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.springjdbc.employee.dao.EmployeeDao;
import com.company.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/company/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");//employeeDao from bean config.xml line 22
//		Employee employee = new Employee();
//		employee.setId(2);
//		employee.setFirstname("Wohn");
//		employee.setLastname("Whatever");
//		int result = dao.create(employee);
//		int result = dao.update(employee);
//		int result = dao.delete(2);
//		System.out.println("Number of records deleted: " + result);
//		Employee emp = dao.read(1);
		List<Employee> emp = dao.readMul(); 
		System.out.println("Employee record(s): "+ emp);
	}

}

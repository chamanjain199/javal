package javal.java8;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningInCollect {

	public static void main(String[] args) {

		List<Employee> employees = Employee.getEmployee();
		System.out.println(employees.stream().map(emp->emp.getName()).collect(Collectors.joining()));
		System.out.println(employees.stream().map(emp->emp.getName()).collect(Collectors.joining(",")));
		System.out.println(employees.stream().map(emp->emp.getName()).collect(Collectors.joining(",","[","]")));

		
	}

}

package javal.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

import javal.java.all.Employee;

public class Distinct {

	public static void main(String[] args) {
		List<Employee> employees=Employee.getEmplyees();
		employees.addAll(employees);
		System.out.println(employees.size());
		List<Employee> employees1=employees.stream().distinct().collect(Collectors.toList());
		System.out.println(employees1.size());

	}

}

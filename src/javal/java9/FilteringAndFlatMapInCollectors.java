package javal.java9;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javal.java.all.Employee;

public class FilteringAndFlatMapInCollectors {

	public static void main(String[] args) {
		List<Employee> employee = Employee.getEmplyees();
		
		
		//java 9
		Map<String, List<Employee>> groupFiltering = employee.stream().collect(
				Collectors.groupingBy(Employee::getName, 
						Collectors.filtering(emp->emp.getSalary()>10000, Collectors.toList())
						));
		System.out.println(groupFiltering);
	}

}

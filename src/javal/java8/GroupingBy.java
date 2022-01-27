package javal.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {

		List<Employee> employee = Employee.getEmployee();
		Map<String, List<Employee>> group = employee.stream().collect(Collectors.groupingBy(Employee::getName));
		System.out.println(group);

		Map<String, Integer> groupSumSalary = employee.stream()
				.collect(Collectors.groupingBy(Employee::getName, Collectors.summingInt(Employee::getSalary)));
		System.out.println(groupSumSalary);

		Map<String, String> groupSumName = employee.stream().collect(
				Collectors.groupingBy(Employee::getName, Collectors.mapping(x -> x.getName(), Collectors.joining())));
		System.out.println(groupSumName);
		
		Map<String, List<String>> groupByPosition=employee.stream().collect(
				Collectors.groupingBy(emp->{
					return emp.getTenure()>5?"Senior":"Junior";
				},Collectors.mapping(x->x.getName(), Collectors.toList())));
		System.out.println(groupByPosition);
		
		

	}

}

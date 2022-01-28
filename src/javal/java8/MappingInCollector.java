package javal.java8;

import java.util.List;
import java.util.stream.Collectors;

public class MappingInCollector {

	public static void main(String[] args) {
		List<Employee> employees = Employee.getEmployee();
		String allname = employees.stream().collect(Collectors.mapping(x -> x.getName(), Collectors.joining(",")));
		System.out.println(allname);

		List<Integer> listofSalary = employees.stream().collect(Collectors.mapping(x -> x.getTenure(), Collectors.toList()));
		System.out.println(listofSalary);

	}

}

package javal.java.java12;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javal.java.all.Employee;

public class TeeingExample {

	public static void main(String[] args) {

		List<Employee> employees = Employee.getEmplyees();
		Map<String, Employee> maxMinMap = employees.stream()
				.collect(Collectors.teeing(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
						Collectors.minBy(Comparator.comparing(Employee::getSalary)), (e1, e2) -> {
							return Map.of("Max", e1.get(), "Min", e2.get());
						}));
	
		System.out.println(maxMinMap);

		Map<String, Object> mapOfList = employees.stream()
				.collect(Collectors.teeing(Collectors.filtering(x -> x.getSalary() > 1000, Collectors.toList()),
						Collectors.filtering(x -> x.getSalary() > 1000, Collectors.counting()), (list, count) -> {
							return Map.of("List", list, "Count", count);
						}));

		System.out.println(mapOfList);
	}

}

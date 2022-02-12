package javal.java8.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javal.java.all.Employee;

public class Collect3 {

	public static void collectMethod3() {
		List<Employee> employees = Employee.getEmplyees();
		List<Employee> employees2 = new ArrayList<Employee>();
		employees.stream().collect(() -> employees2, (list1, emp1) -> list1.add(emp1),
				(list1, list2) -> list1.addAll(list2));
		System.out.println(employees2);

		HashMap<String, Integer> collect = employees.stream().collect(HashMap<String, Integer>::new,
				(map, emp) -> map.put(emp.getName(), emp.getSalary()), (map1, map2) -> map1.putAll(map2));
		System.out.println(collect);
	}

	public static void collectMethod2() {
		List<Employee> employees = Employee.getEmplyees();
		List<Employee> employees2 = employees.stream().collect(Collectors.toList());

		System.out.println(employees2);

		Map<String, Integer> collect = employees.stream()
				.collect(Collectors.toMap((emp1)->emp1.getName(), (emp2)->emp2.getSalary(),  (existing, replacement) -> existing));
		System.out.println(collect);
	}

	public static void main(String[] args) {

		collectMethod3();
		collectMethod2();

	}

}

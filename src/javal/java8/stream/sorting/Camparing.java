package javal.java8.stream.sorting;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javal.java.all.Employee;

public class Camparing {
	static List<Employee> employee = Employee.getEmplyees();
	public static int count = 0;

	public static int sortBySalPlus(Employee emp) {

		return count++;
	}

	public static void find() {

		System.out.println(employee.stream().sorted(Comparator.comparing(Camparing::sortBySalPlus)).collect(Collectors.toList()));

	}

	public static void main(String[] args) {

		find();
	}

}

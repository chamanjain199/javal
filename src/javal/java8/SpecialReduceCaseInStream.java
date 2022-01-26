package javal.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SpecialReduceCaseInStream {

	public static void main(String[] args) {

		List<Employee> employees = Employee.getEmployee();
		int sum = employees.stream().mapToInt(x -> x.getSalary()).sum();
		int sumByReduce = employees.stream().mapToInt(x -> x.getSalary()).reduce(0, (num1, num2) -> num1 + num2);

		System.out.println(sum);
		System.out.println(sumByReduce);

		long totalEmployee = employees.stream().mapToInt(x -> x.getSalary()).count();
		long totalEmployeeByReduce = employees.stream().mapToLong(x -> 1L).reduce(0, (num1, num2) -> num1 + num2);

		System.out.println(totalEmployee);
		System.out.println(totalEmployeeByReduce);

		long max = employees.stream().mapToInt(x -> x.getSalary()).max().getAsInt();
		long maxByReduce = employees.stream().mapToInt(x -> x.getSalary()).reduce(0,
				(num1, num2) -> num1 > num2 ? num1 : num2);

		System.out.println(max);
		System.out.println(maxByReduce);
		
		
		Optional<Employee> opEmp = employees.stream().max(Comparator.comparing(Employee::getSalary));


	}

}

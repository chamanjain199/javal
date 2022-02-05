package javal.java8.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import javal.java.all.Employee;

public class IsParallelDependsOnOperation {

	public static void main(String[] args) {

		List<Employee> employees = Employee.getEmplyees();
		Stream<Employee> stream=employees.parallelStream().filter(x -> x.getSalary() > 10000);
		
//		System.out.println(stream.toList());
//
//		Optional<Employee> firstEmp = stream.findFirst();
//		firstEmp.ifPresent(System.out::println);
		
	}

}

package javal.java8;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummeryStatistics {

	public static void main(String[] args) {

		List<Employee> employees = Employee.getEmployee();
		IntSummaryStatistics summeryMap = employees.stream()
				.collect( Collectors.summarizingInt(Employee::getSalary));
		
		System.out.println(summeryMap);
	}

}

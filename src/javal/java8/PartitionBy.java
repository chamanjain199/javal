package javal.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy {

	public static void main(String[] args) {

		List<Employee> employees = Employee.getEmployee();
		Map<Boolean,List<Employee>> partitionedByTenure=employees.stream().collect(Collectors.partitioningBy(x -> x.getTenure()>5));
		System.out.println(partitionedByTenure);
		
		Map<Boolean,List<String>> partitionedByTenureWithDown=employees.stream().collect(Collectors.partitioningBy(x -> x.getTenure()>5,Collectors.mapping(x->x.getName(), Collectors.toList())));
		System.out.println(partitionedByTenureWithDown);
	}

}

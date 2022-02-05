package javal.java8.stream;

import java.util.List;

import javal.java.all.Employee;

public class FlowChecking {

	public static void main(String[] args) {

		List<Employee>  employees=Employee.getEmplyees();
		employees.stream().peek(x->System.out.print(x+" ,"));
	}

}

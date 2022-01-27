package javal.java.all;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static List<Employee> getEmplyees() {
		List<Employee> employess = new ArrayList<>();
		employess.add(new Employee("aman", 10000));
		employess.add(new Employee("harshit", 12000));
		employess.add(new Employee("mohit", 1300));
		employess.add(new Employee("mohit", 1400));

		employess.add(new Employee("kamal", 14000));
		employess.add(new Employee("azad", 1000));
		employess.add(new Employee("arvind", 14200));
		employess.add(new Employee("aman", 12000));

		return employess;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}

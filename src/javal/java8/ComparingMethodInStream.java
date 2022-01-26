package javal.java8;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.Comparator.nullsFirst;
import static java.util.Comparator.nullsLast;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
	private String name;
	private int salary;

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

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	public static List<Employee> getEmployee(){
		var employess = new ArrayList<Employee>();
		employess.add(new Employee("A", 100));
		employess.add(new Employee("B", 200));
		employess.add(new Employee("S", 500));
		employess.add(new Employee("Y", 300));
		employess.add(new Employee("A", 600));
		employess.add(new Employee("R", 100));
		employess.add(new Employee("B", 330));
		return employess;
	}

}

public class ComparingMethodInStream {

	public static void main(String[] args) {

		var employess = Employee.getEmployee();
		

		// keyExtractor : Field that is used to sort object
		// comparing : pass me the field that i can used to compare object
		employess
				.sort(comparing(Employee::getSalary).thenComparing(comparing(Employee::getName)));

		System.out.println("Sorted by salary and then name \n " + employess);
		employess.sort(comparingInt(Employee::getSalary).reversed()
				.thenComparing(comparing(Employee::getName)));
		System.out.println("Sorted by salary in reverse order and then name \n " + employess);

		employess.sort(comparingInt(Employee::getSalary).reversed()
				.thenComparing(comparing(Employee::getName)));
		System.out.println("Sorted by salary in reverse order and then name \n " + employess);
		employess.add(null);

		employess.sort(nullsLast(comparingInt(Employee::getSalary).reversed()
				.thenComparing(comparing(Employee::getName))));
		System.out.println("Sorted by salary in reverse order and then name \n " + employess);
		List<String> names = new ArrayList<>();
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		names.add("E");
		names.add(null);
		names.sort(nullsFirst(Comparator.naturalOrder()));
		System.out.println(names);
		names.sort(nullsLast(Comparator.naturalOrder()));
		System.out.println(names);

	}

}

package javal.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Emp1 implements Comparable<Emp1> {
	int salary;
	String name;

	public Emp1(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Emp1 o) {
		if (name == o.name) {
			return Integer.compare(salary, o.salary);
		}

		return name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Emp1 [salary=" + salary + ", name=" + name + "]";
	}

}

public class SortingInCollection {

	public static void main(String[] args) {
		List<Emp1> emps = new ArrayList<Emp1>();
		emps.add(new Emp1(2, "V"));
		emps.add(new Emp1(4, "D"));
		emps.add(new Emp1(7, "R"));
		emps.add(new Emp1(1, "V"));
		emps.add(new Emp1(8, "R"));

		// Natural Sorting
		// emps.sort(null);
		// System.out.println(emps);
		// Collections.sort(emps);
		// System.out.println(emps);

		List<Emp1> emp2 = emps.stream().sorted().collect(Collectors.toList());
		System.out.println(emp2);

		// custom sorting
		List<Emp1> emp3 = emps.stream().sorted(Comparator.comparingInt(Emp1::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(emp3);
		// custom sorting
		List<Emp1> emp4 = emps.stream().sorted(
				Comparator.comparing(Emp1::getName).thenComparing(Comparator.comparing(Emp1::getSalary).reversed()))
				.collect(Collectors.toList());
		System.out.println(emp4);
		
		Objects.nonNull(emp4);

	}

}

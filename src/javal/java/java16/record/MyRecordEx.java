package javal.java.java16.record;

record Employee(String name, int salary, String team) {

	public Employee(String name) {

		this(name, 0, null);
	}

}

public record MyRecordEx() {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Rahul", 110, "golden gate");
		Employee emp2 = new Employee("Rahul");

		System.out.println(emp1.toString());
		System.out.println(emp2.toString());

	}
}

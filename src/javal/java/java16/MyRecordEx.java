package javal.java.java16;

record Employee(String name, int salary, String team) {

	public Employee(String string) {
		this.name = string;
	}

}

public record MyRecordEx() {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Rahul", 110, "golden gate");
		Employee emp2 = new Employee("Rahul");

		System.out.println(emp1.toString());

	}
}

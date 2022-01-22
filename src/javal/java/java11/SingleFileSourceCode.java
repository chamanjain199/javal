package javal.java.java11;

/*
 * First class must have main method
 * java SingleFileSourceCode.java Hello
 * Welcome to the Single File Source Code
 * Hello Chaman
 */
public class SingleFileSourceCode {

	public static void main(String[] args) {

		System.out.println("Welcome to the Single File Source Code");
		Customer cust = new Customer("Chaman");
		if (args.length > 1) {
			System.out.println(args[0] + " " + cust.name);
		} else {
			System.out.println(args[0] + " " + cust.name);

		}
	}

}

class Customer {
	String name;

	public Customer(String name) {
		super();
		this.name = name;
	}
}
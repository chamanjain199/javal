package javal.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Customer {
	String name;
	String email;

	public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}

}

public class AndThenMethod {

	public static void main(String[] args) {
		List<String> lists = List.of("Chaman-chamanjain199@gmail.com", "anuj-anuj198@gmail.com");
		List<Customer> lists1 = List.of(new Customer("Chaman", "chamanjain199@gmail.com"));

		List<String> output = new ArrayList<>();

		Function<String, Customer> nameEmailSeprator = (str) -> {
			String arr[] = str.split("-");
			return new Customer(arr[0], arr[1]);
		};
		Function<Customer, String> toUppercase = (cust) -> {
			
			return cust.name.toUpperCase()+"-"+cust.email;
		};
		
		for (String string : lists) {
			output.add(nameEmailSeprator.andThen(toUppercase).apply(string));	
		}
		System.out.println(output);
		for (Customer cust : lists1) {
			System.out.println(nameEmailSeprator.compose(toUppercase).apply(cust));
			
		}
	}

}

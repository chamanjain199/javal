package javal.java8;

import java.util.List;
import java.util.Optional;


public class OptionalClass {

	static List<Book> emps = List.of(new Book("A", 0), new Book("B", 1), new Book("C", 2), new Book("C", 3));

	static void test1() {

		String name = "Cn";

		String bookname = emps.stream().filter(x -> x.name == name).findFirst().map(x -> x.name).orElse("Not found");
		System.out.println(bookname);

	}

	public static void main(String[] args) {

		Optional<String> emptyOp = Optional.empty();

		Optional<String> toOp = Optional.of("to");
		toOp.filter(x -> x.length() > 3);

		Optional<String> opfm = toOp.flatMap(x -> Optional.of(x.toUpperCase()));
		toOp.ifPresent(x -> System.out.println(x));

		if (toOp.isPresent())
			;

		Optional<String> opm = toOp.map(x -> x.toUpperCase()); // if optiona is empty then it does not execute body

		Optional<String> ofnu = Optional.ofNullable(null);
		Optional<String> toOmmp = Optional.of("asss");
		Optional<String> ofnullable = Optional.ofNullable(null);
		System.out.println(ofnullable.orElse("hehehee"));
		ofnullable.orElseGet(() -> "return supplier");
		
		
		test1();

	}

}

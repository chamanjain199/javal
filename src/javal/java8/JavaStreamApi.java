package javal.java8;

import java.util.List;
import java.util.Random;

public class JavaStreamApi {

	public static void main(String[] args) {

		List<Book> books = List.of(new Book("A", 100), new Book("B", 200), new Book("C", 300), new Book("D", 100),
				new Book("E", 800), new Book("F", 900));

		Random random = new Random();
		// List<Integer> ages = random.ints(1, 21).limit(15).boxed().toList();
		List<Integer> ages = List.of(14, 10, 1, 7, 19, 3, 13, 9, 1, 2, 20, 16, 18, 15, 16);
		System.out.println(ages);

		boolean isAllOlderThen18 = ages.stream().allMatch(x -> x > 18);
		System.out.println("Is all order then 18 " + isAllOlderThen18);

		boolean isAnyOlderThen18 = ages.stream().anyMatch(x -> x > 18);
		System.out.println("Is any order then 18 " + isAnyOlderThen18);

		boolean isNoneOlderThen18 = ages.stream().noneMatch(x -> x > 18);
		System.out.println("Is none order then 18 " + isNoneOlderThen18);

		int total = ages.parallelStream().reduce(0, (num1, num2) -> num1 + num2);
		System.out.println("Total " + total);

		total = ages.parallelStream().reduce(0, Integer::sum);
		System.out.println("Total " + total);

		total = ages.parallelStream().reduce( Integer::sum).get();
		System.out.println("Total " + total);
		
		int totalPrice =books.parallelStream().reduce(0,( price, book)->price+book.price,Integer::sum);
		System.out.println("Total Price " + totalPrice);


	}

}

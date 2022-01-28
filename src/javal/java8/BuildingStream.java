
package javal.java8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BuildingStream {

	public static void main(String[] args) {
		int integers[] = IntStream.rangeClosed(1, 10).toArray();

		Arrays.stream(integers).forEach(System.out::print);

		Stream.iterate(LocalDate.now(), date -> date.plusDays(1)).limit(20).forEach(System.out::println);

		Supplier<String> ids = () -> UUID.randomUUID().toString();
		Stream.generate(ids).limit(20).forEach(System.out::println);
	}

}

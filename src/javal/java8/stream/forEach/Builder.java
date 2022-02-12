package javal.java8.stream.forEach;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Builder {

	public static void main(String[] args) {

        Stream.Builder<String> builder = Stream.builder();

		Stream<String> stream = builder.add("Amana").add("Kamal").add("Lakhan").build();
		
		List<String> abs=stream.parallel().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(abs);
	}

}

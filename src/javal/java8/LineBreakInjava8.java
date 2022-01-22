package javal.java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class LineBreakInjava8 {

	public static void main(String[] args) {

		String mystr = "java\nline\nbreak\nexample";

		// java 7
		String str7[] = mystr.split(System.lineSeparator());
		System.out.println(Arrays.toString(str7));
		System.out.println("-----------------");
		// java 8
		String str8[] = mystr.split("//R");
		System.out.println(Arrays.toString(str8));
		System.out.println("-----------------");

		// java 11
		Stream<String> str11 = mystr.lines();
		str11.forEach(x -> System.out.println(x));

	}

}

package javal.java.java11;

import java.util.List;

public class ToArrayIn {

	public static void main(String[] args) {

		List<String> names = List.of("A", "B", "C", "D", "E", "F");

		String ars[] = names.toArray(String[]::new);
		System.out.println(ars);
	}

}

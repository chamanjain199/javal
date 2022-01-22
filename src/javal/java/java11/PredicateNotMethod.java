package javal.java.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotMethod {

	public static void main(String[] args) {

		try (var lines = Files.lines(Path.of("text.txt"))) {
			
		var string=	lines.filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
		System.out.println(string);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

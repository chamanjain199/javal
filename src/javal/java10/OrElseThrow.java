package javal.java10;

import java.util.Optional;

public class OrElseThrow {

	public static void main(String[] args) {

	Optional<String> op=Optional.of("ss");
	System.out.println(op.orElseThrow());
	op=Optional.empty();
	System.out.println(op.orElseThrow());
	}

}
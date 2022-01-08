package javal.java8;

import java.util.function.IntUnaryOperator;

public class UnaryExample {
	
	

	public static void main(String[] args) {
		
		IntUnaryOperator iuo=(t)->t*2;
		System.out.println(iuo.applyAsInt(3));

	}

}

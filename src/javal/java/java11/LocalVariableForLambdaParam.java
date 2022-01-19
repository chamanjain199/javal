package javal.java.java11;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LocalVariableForLambdaParam {

	public static void main(String[] args) {
		


		BiFunction<String, String, String> fun = (var s1, var s2) -> s1 + "  " + s2;
		//BiFunction<String, String, String> fun1 = (var s1, String s2) -> s1 + "  " + s2;	 //		'var' cannot be mixed with non-var parameters
	
		//BiFunction<String, String, String> fun2 = (String s1, var s2) -> s1 + "  " + s2;  //		'var' cannot be mixed with non-var parameters



	}

}

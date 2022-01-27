package javal.java.java13;

public class TranslateEscaps {

	public static void main(String[] args) {

		// In java 13 it is a preview feature
		String str = "hello \\t java";
		System.out.println(str);
		System.out.println(str.translateEscapes());

	}

}

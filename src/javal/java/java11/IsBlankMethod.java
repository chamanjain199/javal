package javal.java.java11;

public class IsBlankMethod {

	public static void main(String[] args) {

		String str = "    ";
		System.out.println(str.length()); // 4

		System.out.println(str.isEmpty()); // false
		System.out.println(str.trim().isEmpty()); // true

		System.out.println(str.isBlank()); // true

		String str1 = " \u2001 ";
		System.out.println(str1.length()); // 3

		System.out.println(str1.isEmpty()); // false
		System.out.println(str1.trim().isEmpty()); // false
		System.out.println(str1.isBlank()); // true

	}

}

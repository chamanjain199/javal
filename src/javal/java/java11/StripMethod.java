package javal.java.java11;

public class StripMethod {

	public static void main(String[] args) {
		String str = "    ";

		System.out.println(str.length()); // 4
		System.out.println(str.trim().length()); // 0
		System.out.println(str.strip().length()); // 0

		String str1 = " \u2001 ";
		System.out.println(str1.length()); // 3
		System.out.println(str1.trim().length()); // 1
		System.out.println(str1.strip().length()); // 0

		String str2 = " 1 \u2001 ";

		System.out.println(str2.stripLeading().length()); // 4
		System.out.println(str2.stripTrailing().length()); // 2

	}
}

package javal.java.all;

public class StringTricks {

	public static void main(String[] args) {
		String greeting="Hello";
		
		System.out.println(greeting.substring(0, 3));  //Hel
		System.out.println(greeting.substring(0, 3) == "Hel");// false  // return heap address
		System.out.println(greeting.substring(0, 3).intern() == "Hel");// false
		System.out.println(greeting.substring(0, 3).equals("Hel"));// true

	}

}

package javal.java8;

public interface TestStatic {

	public int i=9;
	String name="";
	static void print() {
		System.out.println("Hello Static 1");
	}

	public default void print2() {
		System.out.println("Hello");
	}

}

interface TestStatic1 {

	static void print() {
		System.out.println("Hello Static 2");
	}

	default void print2() {
		System.out.println("Hello");
	}

}
package javal.java.java11;

class Outer {
	private String name = "chaman";

	private void printOuter() {
		System.out.println("Outer print");

	}

	class Inner {
		void printName() {
			printOuter();
		}
	}
}

public class NestHost {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.printName();
	}

}

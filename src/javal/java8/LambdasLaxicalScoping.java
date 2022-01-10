package javal.java8;

public class LambdasLaxicalScoping {

	int i = 30;

	void methodWithInnerClass() {
		Runnable run = new Runnable() {
			int i = 10;

			@Override
			public void run() {
				System.out.println(this.getClass().getName());
				System.out.println("Inner class variable " + i);
				System.out.println("Inner class variable " + this.i);
				System.out.println("Outer class variable " + LambdasLaxicalScoping.this.i);
				System.out.println(this);
				System.out.println(LambdasLaxicalScoping.this.toString());

			}

			@Override
			public String toString() {
				return "Annonymous Inner class  [i=" + i + "]";
			}

		};
		System.out.println("-------------------------------------");

		Thread t = new Thread(run);
		t.start();

	}

	void methodWithLambda() {
		Runnable run = () -> {
			int i = 10;

			System.out.println(this.getClass().getName());
			System.out.println("Lambda class variable " + i);
			System.out.println("Outer class variable " + this.i);
			System.out.println("Outer class variable " + LambdasLaxicalScoping.this.i);
			System.out.println(this);

		};
		Thread t = new Thread(run);
		t.start();
	}

	@Override
	public String toString() {
		return "LambdasLaxicalScoping [i=" + i + "]";
	}

	public static void main(String[] args) {
		LambdasLaxicalScoping lls = new LambdasLaxicalScoping();

		lls.methodWithInnerClass();
		System.out.println("-------------------------------------");
		lls.methodWithLambda();
		System.out.println("-------------------------------------");

	}

}

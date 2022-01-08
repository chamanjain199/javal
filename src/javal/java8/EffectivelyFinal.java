package javal.java8;

import java.util.function.IntSupplier;

public class EffectivelyFinal {
	
	void test1() {
		int y;
		y=10;
		supply(()->y+1);
	}

	void test2(int x) {
		int y;
		if(x>10) {
		   y=10;
		}
		//supply(()->y+x); //The local variable y may not have been initialized
	}
	void test3(int x) {
		int y;
		if(x>10) {
		   y=10;
		}else {
			y=9;
		}
		supply(()->y+x); 
	}
	void test4(int x) {
		int y;
		if(x>10) {
		   y=10;
		}
	    y=9;
		
		//supply(()->y+x); //Local variable y defined in an enclosing scope must be final or effectively final
	}
	
	void test5(int x) {
		
		
		supply(()->x); 
		//x++;  //Local variable y defined in an enclosing scope must be final or effectively final
	}
	private void supply(IntSupplier intSupplier) {
		System.out.println(intSupplier.getAsInt());
		
	}

	public static void main(String[] args) {

	}

}

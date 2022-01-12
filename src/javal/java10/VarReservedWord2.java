package javal.java10;

import java.util.function.Consumer;

class OS {

	void print() {
		System.out.println("Print OS");
	}

}

class IOS extends OS {

	void print() {
		System.out.println("Print IOS");
	}

}

class Android extends OS {
	void print() {
		System.out.println("Print Android");
	}
}

public class VarReservedWord2 {

	public static void main(String[] args) {
		var os = new OS();
		os = new Android();
		os.print();
		os = new IOS();
		os.print();

		OS os1 = new IOS();
		os1 = new Android();

		var os2 = new IOS();
		// os2=new Android(); //type mismatch: cannot convert from Android to IOS

		// var os3=null; //Cannot infer type for local variable initialized to 'null'

		Consumer<String> concumer = (String s) -> System.out.println(s);
		//var concumer1 = (String s) -> System.out.println(s); //(lambda expression needs an explicit target-type)

		int  []arrs= {1,2};
		//var  []arrs2= {1,2}; //(array initializer needs an explicit target-type)

	}
}

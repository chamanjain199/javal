package javal.java10;

class Book {

	// var name; can not used at class level
//	Book(var name){ //can not used at constructor level
//		
//	}
}

class Book2 {

	String name;

	Book2(String name) {

	}
}

public class VarReservedWord {

	void test1() {
		var name1 = ""; // can be used at method level
		var count = 1;
		var sum = 3 + count;
		System.out.println(sum);

	}

	public static void main(String[] args) {

		var book = new Book2("haha book 2");
		//book = new Book(); // can not re initialized with diff type
	}

}

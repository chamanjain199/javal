package javal.java9;

class Print<T> {
	T toPrint;
	
	Print(T print){
		this.toPrint=print;
	}

	void print() {
		System.out.println(toPrint);
	}
}

public class DiamondOperatorEnhancement {

	public static void main(String[] args) {
		Print<String> pr=new Print<>("aaa");
		pr.print();
		Print<String> pri=new Print<>("aaa") {
			void print() {
				System.out.println(toPrint+" inner");
			}
		};
		pri.print();
	}

}

/*
 *  with java 8 we will get this error
MyClass.java:6: error: cannot infer type arguments for Print<T>
		Print<String> pri=new Print<>("aaa") {
		                           ^
  reason: cannot use '<>' with anonymous inner classes
  where T is a type-variable:
    T extends Object declared in class Print
1 error
*/

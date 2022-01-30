package javal.java.all;

interface A{
	public void print();
}
class B {
	
	public void print() {
		System.out.println("Hello");
	}
	
}
public class CastingEx {
	
	public static void main(String[] args) {
		B b=new B();
		A a=(A)b; //Exception in thread "main" java.lang.ClassCastException: class javal.java.all.B cannot be cast to class javal.java.all.A (javal.java.all.B and javal.java.all.A are in module javal of loader 'app')

		a.print();
		
	}

}

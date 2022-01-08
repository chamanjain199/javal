package javal.java8;


class A implements TestStatic,TestStatic1{

	@Override
	public void print2() {
		// TODO Auto-generated method stub
		TestStatic.super.print2();
	}
	
}


public class TestStaticClass {
	
	public static void main(String[] args) {
		A a=new A();
		a.print2();
		System.out.println(A.i);
	}

}

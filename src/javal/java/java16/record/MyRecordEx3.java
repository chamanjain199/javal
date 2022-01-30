package javal.java.java16.record;

record Customer(String name, int salary) {

}

public class MyRecordEx3
{

	public static void main(String[] args) {
		Customer obj1=new Customer("Ram",100);
		Customer obj2=new Customer("Ram",100);
		

		System.out.println(obj1.salary());
		System.out.println(obj1.name());
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));

		

	}
}

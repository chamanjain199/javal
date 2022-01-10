package javal.java9;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

class Book {
	public String name;
	public int price;

	void print() {
		System.out.println(name + " " + price);
	}

	public String getName() {
		System.out.println("name");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

public class MethodHandleEx1 {

	public static void main(String[] args) {
		
		MethodHandles.Lookup lookup=MethodHandles.lookup();
		MethodType methodType=MethodType.methodType(String.class);
		try {
			MethodHandle mh=lookup.findVirtual(Book.class, "getName", methodType);
			try {
				mh.invoke();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}

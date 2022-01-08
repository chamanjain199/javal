package javal.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SupplierExample {
	
	ThreadLocal<SimpleDateFormat> tl=ThreadLocal.withInitial(()->new SimpleDateFormat("dd-MM-YYYY"));

	public static SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
	
	public void parse(String date) {
		
		try {
			System.out.println(tl.get().parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void supplierExample() {
		ExecutorService ex=Executors.newFixedThreadPool(10);
		Runnable task=()->parse("26-12-2021");
		for (int i = 0; i < 10; i++) {
			ex.submit(task);
		}
		ex.shutdown();
	}

	public static void main(String[] args) {
		SupplierExample se=new SupplierExample();
		se.supplierExample();
		
	}

}

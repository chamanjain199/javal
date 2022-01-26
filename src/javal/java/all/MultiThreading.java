package javal.java.all;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class MeraThread extends Thread {
	public MeraThread(String name) {

		super(name);
	}

	@Override
	public void run() {
		List<Map<String, String>> newList = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			newList.add(Map.of("" + i, "" + i));

		}
		System.out.println(Thread.currentThread().getName()+"  "+newList);
	}
}

public class MultiThreading {

	public static void main(String[] args) {

		MeraThread t1 = new MeraThread("Thread one");
		MeraThread t2 = new MeraThread("Thread two");

		MeraThread t3 = new MeraThread("Thread three");
		t1.start();
		t2.start();
		t3.start();

	}

}

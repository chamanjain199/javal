package javal.java.all.collection;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.addFirst(1);
		ad.addFirst(2);
		ad.addFirst(3);
		ad.addFirst(4);
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		System.out.println(ad.poll());
		System.out.println(ad.poll());
	}

}

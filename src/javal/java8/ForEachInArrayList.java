package javal.java8;

import java.util.ArrayList;

public class ForEachInArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(1);
		al.forEach(el->System.out.println(el));
	}
}

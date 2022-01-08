package javal.java9;

import java.util.List;

public class SafeVarargsClass {

	SafeVarargsClass(List<String>... ars) {
		System.out.println(ars);

	}

	void m1(int as) {

	}

	public static void main(String[] args) {
		SafeVarargsClass ss = new SafeVarargsClass(List.of());
	}
}

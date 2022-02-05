package javal.java.java16.record;

record Record(String name) {

	
}

record Test5(String name) {

}

public class MyRecordEx5 {

	public static void main(String[] args) {
		Record rc = new Record("cc");
		rc.name();

	}

}

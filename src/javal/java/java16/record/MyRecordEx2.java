package javal.java.java16.record;

public record MyRecordEx2() {

	//public String name; //User declared non-static fields name are not permitted in a record
	public static String name="asss";
	
	public String nameWithTital() {
		return name+"hanan";
	}
	
	public static void main(String[] args) {
		MyRecordEx2 oo=new MyRecordEx2();
		System.out.println(oo.nameWithTital());
	}
}


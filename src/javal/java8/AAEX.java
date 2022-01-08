package javal.java8;

public class AAEX extends Exception {

}
class aa{
	
	static void aas() throws AAEX{
		
	}
	public static void main(String[] args) {

       try {
		aas();
	} catch (AAEX e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

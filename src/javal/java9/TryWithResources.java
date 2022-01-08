package javal.java9;
class MyResource implements AutoCloseable{
	
	void doProcess() {
		System.out.println("Processing");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Closing");
		
	}
	
}
public class TryWithResources {

	public static void main(String[] args) {
		MyResource r1=new MyResource();
		MyResource r2=new MyResource();
		try(r1;r2) {
			
			System.out.println("Executing try");
			
		}catch (Exception e) {
			System.out.println("Executing catch");

		}

	}

}

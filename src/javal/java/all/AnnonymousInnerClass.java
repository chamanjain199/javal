package javal.java.all;

public class AnnonymousInnerClass {

	void print() {
		System.out.println("AnnonymousInnerClass");
	}
	public static void main(String[] args) {
		AnnonymousInnerClass aic=new AnnonymousInnerClass() {
			void print() {
				System.out.println("AnnonymousInnerClass inner");
			}
		};
		aic.print();
		
	}

}

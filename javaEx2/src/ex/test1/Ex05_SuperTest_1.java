package ex.test1;

public class Ex05_SuperTest_1 {

	public static void main(String[] args) {
		SubTest ob = new SubTest();
		ob.disp();
	}

}

class SuperTest {
	private int a;

	protected SuperTest(int a) {
		this.a = a;
	}
	public void disp() {
		System.out.println("...1. " + a);
		
	}
}

class SubTest extends SuperTest {
	public SubTest(int a) {
		super(a);
		System.out.println("...2. " + a);
	}

	public SubTest() {
		super(50);
	//	this(100);	
		System.out.println("...3. " );	
	}
	
}

package ch06.unit4;

public class Ex03 {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.disp();

		Test3 t1 = new Test3(100);
		t1.disp();

		Test3 t2 = new Test3(200, 300);
		t2.disp();
	}

}

class Test3{
	private int a;
	private int b;
	
	public Test3() { // 생성자는 중복 정의가 가능하다.
		a=10;
		b=20;
		System.out.println("인자가 없는 생성자...");
	}
	
	public Test3(int x) {
		a=x;
		System.out.println("인자가 하나인 생성자");
	}
	
	public Test3(int x, int y) {
		a=x;
		b=y;
		System.out.println("인자가 두개인 생성자");
	}
	public void disp() {
		System.out.println(a+" : "+b);
	}
}
package ch08.unit1;

public class Ex01_Inheritance {

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		System.out.println(obj.b); // 상위 클래스 필드 접근
		obj.print();	// 상위 클래스의 메소드 호출
		obj.disp();
	}

}

class Test1{ // 상위 클래스 : Object
	private int a = 10; // private는 하위 클래스도 접근 불가
	int b = 20; // default. 동일한 패키지에서 접근 가능. 
	protected int c = 30; // 동일한 패키지 및 하위 클래스는 어디에서나 접근 가능
	public int d = 40; // 모두 접근 가능
	
	public void print() {
		System.out.println(a + ":"+ b + ":"+ c + ":"+d);
	}
}

class Demo1 extends Test1{ // 자바는 단일 상속만 가능. Demo1의 아버지 Test1, Test1의 아버지 Object
	int x =100;
	public void disp() {
		System.out.println("물려받은 필드 :" + b + ":"+ c + ":"+ d);
		System.out.println("x : "+ x);
		// System.out.println(a); // Test1의 private 필드. 컴오류 
	}
	
	public void sub() {
		print(); // 상위 클래스 메소드
	}
}
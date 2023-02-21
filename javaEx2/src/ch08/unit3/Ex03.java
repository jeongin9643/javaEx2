package ch08.unit3;

public class Ex03 {
	public static void main(String[] args) {
		// up-casting
		Test3 t1 = new Test3(); // 객체 생성
//		Test3 t2 = new Sample3();  // up-casting
		Sample3 s = new Sample3();
		Test3 t2 = s;
		Test3 t3 = new Demo3();  // up-casting
		
		t1.sub(); // Test3 print...
		t2.sub(); // Sample3 print...
		t3.sub(); // Test3 print...
		// 재정의 되면 아버지의 것은 숨는다. super를 사용하지 않는 이상.
	}

}

class Test3 {
	public void print() {
		System.out.println("Test3 print...");
	}
	
	public void sub() {
		// write(); // 컴오류. 하위 클래스 메소드(자식 메소드) 호출 불가
		print(); // 하위 클래스에서 재정의된 경우 하위객체를 업캐스팅해서 호출하면 하위 메소드가 호출 
	}
}

class Sample3 extends Test3{ 
	
	public void print() { // Test3 클래스의 print() 메소드 재정의
		System.out.println("Sample3 print...");
	}

	public void write() {
		System.out.println("write...");
	}
}

class Demo3 extends Test3{
	public void disp() {
		System.out.println("disp...");
	}
}
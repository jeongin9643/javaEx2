package ch06.unit4;

public class Ex23_singleton {
	public static void main(String[] args) {
		// Sample3 ss = new Sample3(); // 컴파일 오류. 생성자가 private이여서.
		// 생성자가 private이면 외부에서 객체 생성 불가능
		
		Sample3 s1 = Sample3.getInstance();
		Sample3 s2 = Sample3.getInstance();
		
		System.out.println(s1 == s2); // true. s1==s2 같은 객체
		
		System.out.println(s1.add()); // 11
 		System.out.println(s2.add()); // 12
	}
}

// singleton 패턴 : 객체가 하나만 생성되는 디자인 패턴의 일종. 이 프로그램은 동시성의 문제를 발생할 수 있음(속도 향상 가능).
class Sample3{
	private static Sample3 obj;
	
	
	private int a =10;
	
	private Sample3() { // 생성자가 private
	}

	public static Sample3 getInstance() {
		if(obj == null) {
			obj = new Sample3(); // 클래스 내에선 private 접근 가능.
		}
		return obj; // obj가 main으로 넘어감
	}
	
	public int add() {
		return ++a;
	}
	
	public int sub() {
		return --a;
	}
}
package ch06.unit2;

public class Ex02_class {

	public static void main(String[] args) {
		// 일반변수(지역변수)
		int x;
		// System.out.println(x); // 컴오류. 초기화 하지 않으면 연산불가
		x =50;
		System.out.println(x);//50
		
		//객체 ---
		// 1) 리퍼런스 변수 선언(객체 선언)
		Test2 t1;
		// t1.name = "홍길동"; // 컴오류. t1이 메모리 할당(초기화) 되어 있지 않음
		
		// 2) 객체 생성(메모리 할당)
		//  객체 = new 생성자(); // 생성자 -> 클래스명
		t1 = new Test2();
		
		// 3) 사용
		// 필드 접근 : 객체명.필드
		t1.name = "홍길동";
		t1.a = 5;
		
		// 메소드 호출(일을 하도록)
		t1.write();   // 홍길동 : 5 : 10
		
		// Test2 t2 = null; // null로 초기화. null은 객체를 초기화 할 수 있는 유일한 방법
						// null은 메모리가 할당되지 않은 상태
		// t2.write(); // 런타임오류(NullPointerException)
		
		// 객체 선언과 동시에 메모리 할당
		Test2 t2 = new Test2();
		t2.write(); // null : 0 : 10
	}
}

// 클래스 : 데이터(필드)+ 기능(메소드)으로 구성
class Test2{
	// 필드(인스턴스 변수)
	// 필드는 초기화하지 않으면 객체를 생성하는 시점에 객체는 null, 숫자는 0으로 초기화
	String name;	// 객체가 생성될때 null로 초기화
	int a;			// 객체가 생성될때 0으로 초기화
	int b = 10;		// 객체가 생성될때 10으로 초기화

	// 메소드(인스턴스 메소드)
	public void write() {
		System.out.println(name + " : " + a+" : "+ b);
	}

}
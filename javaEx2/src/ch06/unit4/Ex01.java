package ch06.unit4;

public class Ex01 {

	public static void main(String[] args) {
		Test1 ob = new Test1();
		// 1. 객체의 메모리 할당 - 인스턴스 변수 메모리 할당
		// 2. 인스턴스 변수는 디폴트 값으로 초기화
		// 3. 인스턴스 변수의 초기화 수식으로 초기화, 초기화 블럭 실행
		// 4. 생성자 몸체 실행(생성자 안에 있는 내용 실행)
		
		ob.disp(); //10:20
		
	}
}

class Test1{
	private int a;
	private int b =20;
	
	// a = a+1; //컴오류. 실행문이 올 수 없다.
	
	// - 생성자
	//	: 클래스와 동일한 이름을 가지며 return타입이 존재하지 않는다.
	//  : 모든 클래스는 하나 이상의 생성자를 가진다.
	//  : 생성자를 만들지 않은 경우에만 컴파일할때 컴파일러는 디폴트 생성자를 만든다.
	//    디폴트생성자는 매개변수도 없고 코드도 없는 생성자이다.
	//	: 생성자는 객체를 생성할때 new 다음에 호출하여 초기화를 담당한다.
	//	: 생성자는 일반 메소드처럼 호출할 수 없다.
	//  : 생성자는 중복 정의 가능
	public Test1() {
		System.out.println("인자가 없는 생성자");
		a=10;
	}
	
	public void disp() {
		System.out.println(a+":"+b);
	}
}
	
	


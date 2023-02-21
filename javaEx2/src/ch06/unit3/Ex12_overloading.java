package ch06.unit3;

public class Ex12_overloading {

	public static void main(String[] args) {
		Test12 t = new Test12();
		
		short a = 10;
		t.print(a); // int
		// 1) 기본데이터 타입은 매개변수 타입이 동일한 기본데이터 타입 매개변수의 메소드 호출(가까운 자료형)
		// 2) 동일한 타입이 없으면 큰 기본데이터 타입중 가장 가까운 타입의 메소드 호출
		// byte < short < int
		
		char c ='A';
		t.print(c); // 
		// char < int
		
		long b = 10; // 기본데이터
		t.print(b);  // Long
		// 3) 매개변수 타입이 기본데이터 타입을 처리하지 못하는 경우
		//    Wrapper Class로 처리 가능하면 해당 메소드를 호출.

	}

}

// overloading : 메소드의 이름은 같지만 매개변수의 개수가 다르거나 매개변수의 타입이 다른 경우
class Test12 {
	public void print() {
		System.out.println("인자 없는 메소드 ...");
	}
	
	// 에러. overloading이 아님
	// overloading은 반환타입이 아니라 매개변수로 구분
	/*
	public int print() {
		return 1;
	}
	*/
	
	public void print(byte a) {
		System.out.println("byte :"+a);
	}
	
	public void print(int a ) {
		System.out.println("int :"+a);
	}
	
	
	// - Wrapper Class
	//   : 기본형 데이터를 객체로 처리할 수 있도록 클래스를 제공
	//   : Byte, Short, Integer, Long, Float, Double, Character 등 
	public void print(Short a) {
		System.out.println("Short :"+a);
	}

	public void print(Long a) {
		System.out.println("Long :"+a);
	}
	
}
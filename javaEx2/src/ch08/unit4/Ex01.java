package ch08.unit4;

public class Ex01 {
	public static void main(String[] args) {

	}
}

// final 인스턴스 변수 : final 인스턴스 변수를 선언할 때 또는 초기화 블럭이나 생성자에서 반드시 초기화 해야 함. 
// final 변수 : 한 번만 초기화 가능
class Test1{
	final int a; 
	final int b = 10;
	
	// static final 변수
	// static final 변수는 선언시 또는 static 초기화 블럭에서 초기화 
	final static int A;
	final static int B = 100;
	static{
		A = 100;
	}
	
	public Test1() {
		a = 5;	// a 초기값 주지 않으면 final 인스턴스 변수 오류 남.
		// b = 20; // 컴오류. b는 초기값을 이미 줬음.
	}
	
	public void sub(final int n) { // 매개변수가 final
		// n = 5;  // 컴오류. final이 있으면 매개변수도 손 댈 수 없음
		final int x = 10; // 지역변수 final
		// x = 100; // 컴오류
		
		System.out.println(n+", "+ x);
	}
}
package ch06.unit4;

public class Ex22_final {

	public static void main(String[] args) {
		// Sample2.PI =10; //final 변수는 값 변경 불가
		System.out.println(Sample2.PI); // static이여서 이와 같이 사용 가능
		
		Sample2.a =50; //a는 final 변수가 아니므로 가능
		
		
		// Sample2.b =10; // 생성자 만들지 않고 접근 불가
		Sample2 ss = new Sample2();
		// ss.b=10; // 컴오류. final 변수는 값 변경 불가
		System.out.println(ss.b); // 인스턴스 final 변수는 객체를 생성 후 접근 가능
	}

}

class Sample2{
	public static int a =10;
	
	// final 변수(상수) : 한 번만 초기화가 가능하며, 값을 변경할 수 없다. 일반변수와 비교하기 위해 대문자.
	public final static double PI = 3.141592; // 초기화 수식 / 초기화 블럭에서 초기화 가능
	
	public final static int X;
	static {// static 초기화 블럭에서 final static 변수의 초기화는 가능
		X = 5;
	}
	
	//인스턴스 final 변수는 초기화 수식, 초기화 블럭, 생성자에서 단 한 번 초기화 가능
	final int b = 10;
	final int c;
	
	public Sample2() {
		// X =5; // static final 변수는 생성자에서 초기화가 불가능 --> 초기화 블럭에선 가능 
		c=10;
	}
	
	public void sub() {
		// c = 10; // 컴파일 오류. final 변수는 일반 메소드에서 값을 변경할 수 없다.
	}
	
}
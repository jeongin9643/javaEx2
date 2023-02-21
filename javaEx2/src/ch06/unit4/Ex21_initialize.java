package ch06.unit4;

public class Ex21_initialize {

	public static void main(String[] args) {
		Sample1 s1;
		// 클래스가 로딩되는 시점 : 처음 객체를 생성하거나 처음 클래스 변수나 클래스 메소드를 사용하는 시점
		// System.out.println(Sample1.y);
		s1 = new Sample1();
		s1.disp();
		
		Sample1 s2 = new Sample1();
		s2.disp();
	}
}

/*
 	---> 클래스 변수는 공동이고 값을 공유하기에 로딩 될 때 한번만 메모리 할당(초기화) 이뤄짐.
 	---> 인스턴스는 new 객체를 만들때 마다 메모리 할당
 
  - 클래스가 로딩될 때 한 번만 실행
    1) 클래스 변수 메모리할당 - 메소드 영역
    2) 클래스 변수를 디폴트 값으로 초기화 : x=0, y=0
    3) 초기화변수 수식을 실행 : x=10
    4) static 초기화 블럭을 실행
    
    - 객체를 생성할 때 마다 실행
    1) new Sample1() : 객체를 위한 메모리 할당(인스턴스 변수 메모리 할당) : a, b, c, d 
    2) 모든 인스턴스변수를 디폴트값으로 초기화: a = b= c= d= 0;
    3) 초기화 수식으로 초기환(존재하는 경우): b=0;
    4) 인스턴스 초기화 블럭 실행(존재하는 경우)
    5) 생성자의 몸체를 실행
 */

class Sample1 {
	private int a;
	private int b = 1;
	private int c;
	private int d;

	public static int x = 10;
	public static int y;

	static {//static 변수에 초기값 줄 때 사용
		// static 초기화 블럭: 클래스가 로딩될 때 한 번만 실행
		y = 20;
		System.out.println("static 초기화 블럭...");
	}

	// d = 5; // 컴파일 오류. 선언부에서는 실행문이 올 수 없다.
	{
		// 인스턴스 초기화 블럭(객체가 생성될 때 마다 실행)
		d = 5;
		System.out.println("인스턴스 초기화 블럭... ");
	}

	public Sample1() {
		c = 10;
		System.out.println("생성자...");
	}

	public void disp() {
		System.out.println(a + ":" + b + ":" + c + ":" + d);
	}
}
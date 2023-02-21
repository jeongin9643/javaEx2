package ch06.unit3;

public class Ex04 {

	public static void main(String[] args) {
		Test4.print();
		System.out.println(Test4.c);
		
		
		Test4 t = new Test4();
		t.disp();
	}

}

class Test4{
	/*
	 	- 변수 : 필드, 지역변수, 매개변수(지역변수)
		- 지역변수 : 호출될 때 생성, 종료시 제거
		- 필드 : 인스턴스 변수 + 클래스변수
	 */
	
	/*
		- 인스턴스 변수
		: 객체가 생성될 때마다 메모리 할당하고 기본값으로 초기화(숫자:0, 객체: null)
		: heap 영역에 메모리 할당
		: 객체가 null이 되거나(해당 주소를 잃어버릴 때) 오랫동안 사용하지 않으면 garbage collector의 대상이 됨
		: 객체에 종속되므로 객체를 통해서 접근
	 */
	int a; // 0으로 초기화
	int b =10; // 메모리를 할당 받을 때 10으로 초기화

	/*
	 
		- 클래스 변수
		: 클래스가 로딩될 때 한 번 메모리 할당
		: 객체 생성과 상관 없이 한 번만 메모리가 할당되며 모든 객체가 공유해서 사용
		: method(static)영역에 메모리 할당
		: "클래스명.변수"로 접근
		: 프로그램이 종료되는 시점에 메모리 해제  --> 프로그램이 돌아갈때까지 안 없어짐. 프로그램이 죽어야 사라짐
	 */
	static int c = 100;
	
	/*
		- 지역변수, 매개변수
	 	: 스택 영역 메모리에 할당
	 	: 메소드를 호출할 때 메모리를 할당 받고, 메소드를 빠져나가면 메모리에서 제거됨
	 */

	/*
		- 인스터스 메소드
		: 객체가 생성되어야 호출할 수 있는 메소드
		: 클래스내의 인스턴스 변수, 클래스 변수, 클래스 메소드를 모두 사용 가능
		: 클래스내의 다른 인스턴스 메소드, 클래스 메소드를 호출할 수 있다.
	
	 */
	 public int sub(int n) {  // n: 매개변수
		 int s=0; 	// 지역변수
		 s = n+5;
		 return s;
	 }
	 
	 public void disp() { // 인스턴스 메소드
		 // 인스턴스 메소드는 클래스 내의 인스턴스 변수를 모두 사용할 수 있다.
		 System.out.println(a + ":"+b);
		 
		 // 인스턴스 메소드는 클래스 내의 다른 인스턴스 메소드를 호출 할 수 있다.
		 int x= sub(5);
		 System.out.println(x);
		 
		 // 인스턴스 메소드는 클래스 내의 클래스 변수를 사용할 수 있다.
		System.out.println(c); 
		
		// 인스턴스 메소드는 클래스 내의 클래스 메소드를 호출할 수 있다.
		write();
	 }
	 
	 /*
	  	- 클래스 메소드
	  	: 객체 생성과 상관 없이 클래스 이름으로 호출
	  */
	 public static void write() {
		 System.out.println("static method");
	 }
	 
	 public static void print() {
		 // 클래스 메소드는 인스턴스 변수나 인스턴스 메소드를 직접 호출할 수 없다.
		 // this 키워드 사용 불가
		 // System.out.println(a); // 컴오류. 인스턴스 변수를 직접 호출 불가
		 // disp(); // 컴오류. 인스턴스 메소드를 직접 호출 불가
		 
		 // 인스턴스 변수나 인스턴스 메소드는 객체를 생성한 후 사용 가능
		 Test4 t = new Test4();
		 System.out.println(t.b);
		 t.disp();
		 
		 System.out.println();
		 
		 // 클래스내의 클래스 변수나 클래스 메소드는 직접 사용 가능
		 
		 write();
		 
	 }
	
}
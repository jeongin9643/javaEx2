package ch06.unit2;

public class Ex05_class {

	public static void main(String[] args) {
		// 클래스 변수 (static) 
		//	: 객체 생성과 상관 없이 언제나 사용가능한 변수
		//	: 객체가 여러개 생성되어도 클래스가 로딩될때 한번만 메모리 할당
		// 	: 클래스 이름을 이용하여 접근. (클래스명.클래스 변수명)
		System.out.println(Test5.c);  //30
		
		// 인스턴스 변수  ----> 메모리를 할당 받아 쓸 수 있는 변수
		//	: 객체가 생성되어야 접근 할 수 있는 변수
		//	: 객체가 생성될 때 메모리가 할당되며 객체 개수만큼 메모리 할당
		//	: 객체를 이용하여 접근. (객체명.인스턴스변수명)
		
		Test5 obj = new Test5();
		System.out.println(obj.a); //0 초기값
		obj.a=10;
		// obj.b=50; // 컴오류. private은 외부접근 불가
		obj.write();  // 10:20:30
		
		// 클래스 메소드(static) : 객체 생성과 상관 없이 바로 호출가능.
		//		클래스명.클래스메소드명() 같은 형식으로 호출
		Test5.sub(); //30
	}

}

class Test5{
	// 인스턴스 변수 : 객체를 생성해야 접근 가능한 변수
	int a; // 디폴트. 동일한 패키지에서만 접근 가능
	private int b=20; //클래스내에서만 접근 가능
	
	// 클래스 변수: 객체 생성과 상관없이 클래스에 메모리에 로딩되는 순간 메모리를 할당받아 바로 사용 가능 
	public static int c=30; 
	
	public void write() { // 인스턴스 메소드 : 객체를 생성해야 접근할 수 있는 메소드
		System.out.println(a + ":" + b + ":"+c);
	}
	
	public static void sub() { // 클래스 메소드 : 객체 생성과 상관 없이 호출 가능한 메소드
		//System.out.println(a); // 컴오류.  인스턴스 변수는 클래스 메소드에서 호출하기 위해서는 메모리 할당이 필요. (=객체가 생성되지 않아 메모리 할당 필요)
		System.out.println(c); 
	}
}
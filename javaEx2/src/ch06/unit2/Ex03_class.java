package ch06.unit2;

public class Ex03_class {

	public static void main(String[] args) {
		Test3 t1 = new Test3(); // 객체 생성
			// t1의 a, b, c, d 필드가 메모리 할당
		Test3 t2 = new Test3(); // 객체 생성
			// t1의 a, b, c, d 필드가 메모리 할당
		
		// t1.a= 200; // 컴파일 오류. private 필드는 클래스 내에서만 접근 가능
		t1.b += 100;
		
		t1.write(); // 10, 120, 30, 40
		t2.write(); // 10, 20, 30 , 40
	
	}

}

class Test3{
	// 필드 접근 제어자
	// private < 디폴트 < protected < public
	// 필드(인스턴스 변수)
	// 인스턴스 변수 : 객체를 생성한 만큼 메모리가 할당되며, 객체를 생성해야 접근할 수 있는 변수
	
	private int a =10; // 클래스 내에서만 접근 가능
	int b= 20;// 동일한 패키지에서만 접근 가능(디폴트)
	protected int c = 30; // 동일한 패키지 및 하위 클래스에서 접근 가능
	public int d = 40; // 어디에서나 접근 가능
	
	// 인스턴스 메소드
	public void write() {
		System.out.println(a+":"+ b+":"+c+":"+d);
	}
}
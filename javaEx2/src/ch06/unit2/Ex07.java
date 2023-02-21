package ch06.unit2;

public class Ex07 {
	int r;  // 인스턴스 변수
	
	public double area() { // 인스턴스 메소드
		return 3.141592 *r * r;
	}
	
	public double len() { // 인스턴스 메소드
		return 3.141592 * 2 * r;
	}
	
	public static void main(String[] args) { // 클래스 메소드. 메모리 할당 안되어도 사용 가능. JVM이 처리 
											 // 인스턴스 변수는 메모리 할당이 안되어 있으면 올 수 없음.
		// r =10; // 컴파일 오류. 인스턴스 변수는 클래스 메소드에서 호출하기 위해서는 메모리 할당이 필요.
		Ex07 obj = new Ex07(); // 객체 생성 -- 생성자 호출. new 생성자()(메모리 할당)
		obj.r =10;			   // 초기화
		
		double a, b;
		a = obj.area();
		b = obj.len();
		
		System.out.println(a + ","+ b);
	}

}

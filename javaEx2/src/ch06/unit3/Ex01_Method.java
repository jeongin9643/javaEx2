package ch06.unit3;

public class Ex01_Method {
	public static void main(String[] args) {
		Test1 t = new Test1();
		int result;
		
		result = t.sub(5); // 메소드를 호출
		System.out.println(result); // 10
	}

}

class Test1{
	// public: 접근제어자, int: 리턴타입, sub: 메소드명, int n:(매개변수타입 매개변수 타입명)
	// 매개변수는 지역변수로 메소드 안에서만 사용 가능
	// 지역변수(매개변수)는 메소드를 호출할 때 메모리가 할당되고, 메소드를 빠져나가면 메모리가 해제된다.
	// 지역변수는 스택 메모리 영역에 저장
	public int sub(int n) { // 인스턴스 메소드,  n: 매개변수(지역변수) 
		int s =0; // s: 지역변수
		
		s = n+5;  // 10 = 5+5
		for(int i=0; i <s; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		return s; // 10. 반환값을 가지고 호출한 곳으로 돌아감
	}
}

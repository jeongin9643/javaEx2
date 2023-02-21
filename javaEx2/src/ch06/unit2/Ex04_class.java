package ch06.unit2;

public class Ex04_class {

	public static void main(String[] args) {
		// 레퍼런스(참조)변수 선언과 메모리 할당
		// 레퍼런스 변수가 메모리 할당을 받은 만큼 인스턴스변수(필드)는 메모리 할당을 받는다
		// 레퍼런스 변수는 값을 가지고 있는 것이 아니라 객체가 저장된 주소를 가지고 있다.
		Test4 t1 = new Test4();
		Test4 t2 = new Test4();
		
		// 객체가 값을 가지고 있는 것이 아니라 주소를 가지고 있음
		// 해쉬코드 : 객체를 빠르게 찾기 위해 JVM이 사용하는 값
		System.out.println(t1); // 클래스이름@해쉬코드가 출력됨
			// ch06.unit2.Test4@7c30a502
		System.out.println(t2);
			//ch06.unit2.Test4@49e4cb85

		t1.write(); // 10:0
		t2.write();	// 10:0
		
		System.out.println(t1==t2); // false. 주소가 다름
		
		t1.b = 100;
		t1.write();	// 10:100
		t2.write(); // 10:0
		
		Test4 t3 = new Test4();
		Test4 t4 = t3; // t3과 t4가 참조하는 영역이 동일하다.
		t3.b=50; 
		
		t3.write(); // 10:50
		t4.write(); // 10:50
		
		System.out.println(t3 == t4); //true. 주소 동일
		
		// 동일한 객체는 해쉬코드가 같다.
		// 해쉬코드가 같다고 동일한 객체는 아니다.
		System.out.println(t3); // ch06.unit2.Test4@2133c8f8
		System.out.println(t4); // ch06.unit2.Test4@2133c8f8
	}

}

class Test4 {
	int a = 10;
	int b;

	public void write() {
		System.out.println(a + ":" + b);

	}

}

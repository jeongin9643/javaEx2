package ch06.unit2;

public class Ex06_ObjectArray {
	public static void main(String[] args) {
		// int a; // 지역변수. main 안에서만 있음.  인스턴스는 main 밖 클랙스 필드에 있는 것.. 
					// 지역변수는 int n;으로 선언할 때 메모리 할당. main 메소드가 죽는 시점에 사라짐
		/*
		Test6 t;  // 메모리 할당 안되어 있고 뭘 가지고 있는지 모름
		t.a = 10; // 컴파일 오류. 초기화가 안된 상태
		*/
		
		/*
		Test6 t = null;   // 메모리 할당 안됨. null로 초기화 되었지만 null로만 있어서 오류.
		t.a = 10; // 런타임 오류. NullPointerException
		*/
		
		// 객체 배열
		Test6[]tt = new Test6[5]; 
			// 메모리 할당 안된 것.
			// Test6 객체를 5개 저장할 수 있는 배열. Test6에 5개  저장할 수 있는 것을 말함.배열을 만들라고 한 것. 생성자를 부른 게 아님.
			// 객체 배열은 null로 초기화
			// 클래스의 객체가 메모리 할당을 받을 수 있는 유일한 방법은 생성자 호출. new 생성자()
			// Test6 t1=null, t2=null, t3=null, t4=null, t5=null;과 유사. 
			// tt[0].a = 10; // 런타임 오류. NullPointerException
			// new 생성자()를 호출하지 않아서 메모리 할당이 안된 상태
		
		for(int i=0; i<tt.length; i++) {
			tt[i]=new Test6(); // 객체에 대한 메모리 할당
		}
		
		tt[0].a=10;
		tt[0].print(); //10:0
	}

}

class Test6{
	int a;
	
	public void print() {
		System.out.println(a + ":" + b);
	}
	
	int b;  // 필드는 아래 있어도 상관 없음 
	
}
package ch08.unit7;

public class Ex01 {
	public static void main(String[] args) {
		// User1 obj = new User1(); // 컴오류
		// 외부에서 static 클래스의 객체 생성
		Test1.User1 obj = new Test1.User1();
		obj.write();
	}

}

class Test1{
	int a =10;
	static int b = 0;

	//static 중첩 클래스 : 외부(Test1) 클래스의 객체 생성 없이 외부에서 객체를 생성할 수 있는 클래스(외부에 있는 인스턴스 변수 사용 불가)
	// 컴파일 하면 Test1$User.class 파일이 생성됨
	// 단독으로 사용 불가. Test1 안에 User1에 있음
	static class User1{
		int x = 100;
		public void write() {
			//System.out.println(a); // a: 컴파일 오류. 메모리를 할당 받아 쓸 수 있는 인스턴스 변수. Test1의 객체가 만들어야 a 사용 가능
									// User1은 Test1을 생성하지 않아도 쓸 수 있기에 컴파일 오류 발생.
			System.out.println(b); // b: 클래스가 로딩되는 시점에 메모리 할당 받기 때문에 가능.
		}

		public void disp() { // Test1 객체 생성 후 가능
			Test1 t = new Test1();
			System.out.println(t.a);
			t.print();
		}
	}
	
	public void print() {
		System.out.println(a + ","+ b);
		User1 u = new User1();
		System.out.println(u.x);
	}
	
	public static void sub() {
		// System.out.println(a); // 컴오류. static이기에 a는 객체 생성 후 사용해야 함
		System.out.println(b); // static 변수여서 가능.
	}
	

}


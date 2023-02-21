package ch08.unit7;

public class Ex02 {
	public static void main(String[] args) {
		Test2 obj = new Test2(); // 외부에 있는 객체를 생성해야 내부 객체 생성 가능
		Test2.User2 u = obj.new User2();
		u.write();
	}

}

class Test2 {
	int a = 10;
	static int b = 20;
	
	// 내부 클래스(member class) 
	// : 외부에서 객체를 생성 할 경우 외부(Test2) 클래스의 객체가 생성되어야 생성 가능. 
	class User2{
		int x = 200;
		public void write() {
			// 외부 클래스의 인스턴스 변수, 인스턴스 메소드를 사용 가능. a랑 b 메모리 할당 받아서 가능
			System.out.println(a + ","+ b + ","+ x);
			// sub(); 호출 가능
		}
	}
	
	public void sub() {
		User2 u = new User2();
		System.out.println(u.x);
		
	}
}
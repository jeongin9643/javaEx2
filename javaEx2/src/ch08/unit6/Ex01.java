package ch08.unit6;

public class Ex01 {
	public static void main(String[] args) {
		// Test1 t = new Test1(); // 컴오류. 인터페이스는 추상클래스의 일종으로 객체 생성 불가
		
		// 인터페이스는 구현 클래스의 상위 클래스와 유사 (아버지 -자식 상속관계라고 생각하면 됨. 인터페이스가 아버지, TestImpl1 자식)
		Test1 t = new TestImpl1(); // up-casting
		t.disp(); 
		// t.sub(); // 컴오류. 인터페이스Test1에 sub()메소드가 없어서.t는 Test1의 것이라고 생각해야 함 --> 다운 캐스팅해서 가능.
		
		((TestImpl1)t).sub(); // 다운 캐스팅
		
		System.out.println(Test1.B);
		// Test1.B = 50; // 컴오류. final 변수는 값 변경 불가
	}
}

// interface : 선언만 있고 정의가 없는 추상 클래스의 일종. 
interface Test1 {
	// 인터페이스 필드는 public static final만 가능. private 안됨.
	public static final int A =10;
	int B = 20; // public static final를 붙이지 않아도 public static final 컴파일러가 붙임
	
	// 인터페이스 메소드는 public abstract만 가능
	public abstract void disp(); // abstract 생략 가능
	void print(); // public abstract를 붙이지 않아도 public abstract
	
	// public void write() {} //메소드를 정의하면 컴파일 오류
}

// 인터페이스 구현
// 인터페이스를 구현한 클래스는 추상 클래스가 아닌 경우 인터페이스의 모든 메소드를 재정의 해야 한다.
class TestImpl1	implements Test1{

	@Override
	public void disp() {
		System.out.println("disp-인터페이스 메소드 재정의");
	}

	@Override
	public void print() {
		System.out.println("print-인터페이스 메소드 재정의");
	}

	public void sub() {
		System.out.println("sub...");
	}
}
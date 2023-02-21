package ch08.unit2;

//overloading 상하관계 없이 정의
// override 상하관계 가진채 정의
public class Ex01_override {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.print(); // 재정의하게 되면 아버지의 print()가 숨어서 더 이상 찾을 수 없어 부를 수도 없음
	}
}

class Test1 {
	int a =10;
	public void print() {
		System.out.println("a:" + a);
	}
}

class Demo1 extends Test1	{
	int x = 100; 
	
	public void write() {
		super.print(); // 상위클래스의 메소드를 호출(숨어 있는 상위 클래스 호출 가능해짐)
	}
	
	// 상위 클래스의 메소드를 재정의. 상위 클래스의 메소드는 숨는다.
	@Override // 메소드가 override 규칙에 맞는지를 검증하여 맞지 않으면 오류가 발생
	public void print() { // Test1의 메소드를 재정의. 오버라이드
		System.out.println("a:"+a+",x:"+x);
	}
	
	// overloading
	public void print(int n) {
		System.out.println("n:"+n);
	}
	
}
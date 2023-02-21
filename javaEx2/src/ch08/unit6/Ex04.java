package ch08.unit6;

public class Ex04 {
	public static void main(String[] args) {
		Demo4 t = new Test4(); // up-casting
		t.print();
		t.disp();
	}
}

interface Demo4 {
	public void print();
	public void disp();

}

// 추상 클래스는 인터페이스의 모든 메소드를 구현하지 않아도 된다.
abstract class DemoImpl4 implements Demo4{
	@Override
	public void disp() {
		System.out.println("disp...");
	}
}
// 추상 클래스를 상속받은 클래스는 print를 재정의 하지 않으면 안 된다.
class Test4 extends DemoImpl4{
	@Override
	public void print() {
		System.out.println("print...");
	}
}
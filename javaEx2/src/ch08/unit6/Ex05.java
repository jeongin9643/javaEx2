package ch08.unit6;

public class Ex05 {
	public static void main(String[] args) {
		Cdemo5 obj = new DemoImpl5();
		obj.disp();
	}
}

interface Ademo5{
	public void print();
}

interface Bdemo5{
	public void disp();
}

// 인터페이스는 다른 인터페이스를 상속 받을 수 있다.
// 인터페이스는 다른 인터페이스를 다중 상속 받을 수 있다. 다중 상속 지원
interface Cdemo5 extends Ademo5, Bdemo5{
	public void sub();
}


class DemoImpl5 implements Cdemo5{

	@Override
	public void print() {
		System.out.println("print...");
	}

	@Override
	public void disp() {
		System.out.println("disp...");
	}

	@Override
	public void sub() {
		System.out.println("sub...");
	}
	
}
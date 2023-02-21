package ch08.unit6;

public class Ex02 {
	public static void main(String[] args) {
		TestImpl2 t = new TestImpl2();
		t.disp();
		// t.print();
		// t.sub();
		
		Atest2 t2 = new TestImpl2(); // up-casting
		Atest2 t3 = new TestImpl2(); // up-casting
		
		// t2.disp();
		// t3.disp(); // 컴오류
		((Atest2)t3).disp();  // TestImpl2가 Atest2, Btest2를 구현했으므로 가능
		
		// t2.sub(); // 컴오류.
		((TestImpl2)t2).sub(); // 다운 캐스팅
	
	}
}

interface Atest2{
	public void disp();
}

interface Btest2{
	public void print();
}

// 클래스는 2개 이상의 인터페이스를 구현할 수 있다.(다중 상속이 되지 않는 부분을 보강)

class TestImpl2 implements Atest2, Btest2{

	@Override
	public void print() {
		System.out.println("Btest2 - print...");
	}

	@Override
	public void disp() {
		System.out.println("Atest2 - print...");
		
	}
	
	public void sub() {
		System.out.println("sub...");
	}
}


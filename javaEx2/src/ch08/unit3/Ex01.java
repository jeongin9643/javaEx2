package ch08.unit3;

public class Ex01 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.print(); // 10 20
		// System.out.println(t.c); // 컴오류. 하위멤버접근불가
		System.out.println();
		
		// 클래스의 형변환 : 상속관계에서만 가능
		// Integer와 Long는 서로 형변환 불가
		// Integer a = 10;
		// Long b = a; // 컴오류
		// Long b = (Long)a; // 컴오류
		
		// Test1(상위) > Demo1(하위)
		// up-casting
		//   : 상위 클래스의 객체가 하위 클래스의 객체를 참조하는것
		//   : 형변환을 하지 않아도 됨 
		//   : 업캐스팅은 언제나 가능
		Demo1 dm = new Demo1();
		Test1 t2 = dm; // up-casting. 실행시점에
		
		System.out.println(t2 == dm); // true. 참조하는 영역이 동일하므로 동일한 객체
		
		System.out.println(dm.b); // 100
		System.out.println(t2.b); // 20, 업캐스팅 객체라 할지라도 필드는 자기 자신의 것을 나타냄
		// System.out.println(t2.c); // 컴파일 오류. Test1에는 c 라는 필드가 없음
		System.out.println();
		
		// 업캐스팅 객체에서 재정의(override)된 메소드는 숨어버리기 때문에 
		//    메소드는 하위 클래스의 메소드가 호출된다.
		t2.print(); // a:10,b:100,super.b:20,c:200
		System.out.println();
		
		t2.disp(); // 상위 메소드
		// t2.write(); // 컴파일 오류
		
	}
}

class Test1 {
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a+":"+b);
	}
	
	public void disp() {
		System.out.println("disp...");
	}
}

class Demo1 extends Test1 {
	int b = 100;
	int c = 200;
	
	@Override
	public void print() {
		System.out.println("a:"+a+",b:"+b+",super.b:"+super.b+",c:"+c);
	}
	
	public void write() {
		print();
		super.print();
		disp();
	}
}


package ch08.unit3;

public class Ex02 {
	public static void main(String[] args) {
		Test2 t = new Demo2(); // up-casting, 하위 클래스를 받음. t는 Demo의 객체
		
		t.disp(); // disp... 
		t.print(); // 10,100,20,200. t를 new하지 않아서 하위 클래스 것 
		// t.write(); // 컴오류
		
		/*
		  - up-casting 
		  	: 상위 클래스의 객체가 하위 클래스의 객체를 참조하는 것
		  	: 형변환을 하지 않아도 됨
		  	: 업캐스팅은 언제나 가능
		  	: long형에 int 넣을 때 형변환 안하는 것과 같은 개념.(long이 크기 떄문에)
		  
		  - down-casting 
		  	: up-casting 한 객체를 다시 원래 객체로 캐스팅하는 것
		  	: down-casting은 up-casting한 객체만 가능하다.		
			: down-casting은 반드시 강제 캐스팅을 해야 한다.	
		 */
		
		Demo2 dm = (Demo2)t; // t를 업캐스팅해놔서 down-casting 가능.
		dm.write();
		// t.write(); // 현재 t는 Demo2꺼. 
		((Demo2)t).write(); // down-casting
		// 업캐스팅 객체가 오버라이드한 객체를 부르면 자식 것을 부름. t를 통해 Test2 print 호출 불가. 
		
		// Test2 t2 = new Test2();
		// Demo2 dm2 = (Demo2)t2; // 런타임 오류(ClassCastException).0
			// up-casting이 되지 않은 것은 down-casting불가. t2는 Test의 객체이지 Demo의 객체가 아님.
 		
	}

}

class Test2{
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a + ":"+ b);
	}
	
	public void disp() {
		System.out.println("disp...");
	}
}

class Demo2 extends Test2{
	int b = 100;
	int c = 200;
	
	public void print() {
		System.out.println(a + ","+ b+","+super.b+","+c);
	}
	
	public void write() {
		System.out.println("write...");
	}
}
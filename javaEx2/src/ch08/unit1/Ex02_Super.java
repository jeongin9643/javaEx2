package ch08.unit1;

public class Ex02_Super {
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.disp();
		System.out.println(d.a); // 10
		System.out.println(d.b); // 100  ---> 이름이 같을 경우 자신의 것이 우선순위 높음
		
	}

}

class Test2{
	int a = 10; 
	int b = 20;
	
	public void print() {
		System.out.println(a + ":"+ b);
		// System.out.println(this.a + ":"+ this.b);
	}
}

class Demo2 extends Test2 {
	int b = 100;
	int x = 200;
	int y = 300;
	
	public void disp() {
		int x = 50;
		System.out.println("a: "+ a);  // 10. 상위클래스 a
			// a, this.a, super.a 모두 결과 동일(아버지의 a라서)
		System.out.println("this.a: "+ this.a); //10 
		System.out.println("super.a: "+ super.a);  // 10
		
		System.out.println("b: "+ b); // 100.  자신 것. this.b와 동일
		System.out.println("super.b: "+ super.b); //20.  super 클래스의 b필드 (아버지의 필드꺼)

		System.out.println("x :"+ x); // 50, 지역변수x 
		System.out.println("this.x :"+ this.x); // 200, 필드x
		
		System.out.println("y :" + y); // this.y와 동일
		
	
	}
	
}
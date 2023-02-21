package ch08.unit3;

public class Ex06 {
	public static void main(String[] args) {
		Test6 t = new Test6();
		System.out.println(t); // ch08.unit3.Test6@3b6eb2ec

		t.print(); // 10, 20
		
		// Object > Test6 > Demo6
		Demo6 d = new Demo6(); 
		Test6 t2 = d; // up-casting
		System.out.println(t2); // ch08.unit3.Demo6@6e8dacdf ---> up-casting해서 Demo6@해쉬코드

		Test6 t3 = new Demo6();  // up-casting
		Object o = new Demo6();  // up-casting
	 

		System.out.println(t2.b); // 20. 필드는 자기것
		// System.out.println(o.b); // 컴오류. Object에 b필드가 없음
		System.out.println(((Demo6)o).b); // 100. 다운 캐스팅
		
		t3.print(); // 
		
		// Demo6 d2 = (Demo6)t; // 런타임 오류 (ClassCastException). 업한 것만 다운 가능
		// instanceof 연산자 : 객체가 해당 클래스 객체인지 확인. 런타임 오류가 발생하지 않고 내용 처리 가능 
		if( t instanceof Demo6) {
			Demo6 d2 = (Demo6)t;
			d2.sub();
		}else {
			System.out.println("Demo6의 객체가 아닙니다.");
		}
		
	}
}

class Test6{
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a + ", "+ b);
	}

	public void disp() {
		System.out.println("disp ... ");
	}
	
}

class Demo6 extends Test6{
	int b = 100;
	int c = 200;
	
	@Override
	public void print() {
		System.out.println(a + ":"+ b +":"+super.b +"c:"+c);
	}
	
	public void sub() {
		System.out.println("sub...");
	}
	
}
package ch08.unit3;

public class Ex07 {
	public static void main(String[] args) {
		Object o = new Test7(); //  up-casting
		
		/*
		if(o instanceof Test7) {
			Test7 t = (Test7)o;
			t.print();
		}
		*/
		
		// instanceof 연산자의 패턴 매칭 : JDK 14 preview, JDK 16 정식 스팩 포함
		if(o instanceof Test7 t) {
			t.print();
		}
	}
}

class Test7{
	int a =10;
	
	public void print() {
		System.out.println(a);
	}
}
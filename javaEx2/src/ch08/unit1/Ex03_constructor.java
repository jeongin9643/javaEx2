package ch08.unit1;

/*
  - 하위 클래스의 객체 생성
  1) 상위 클래스의 필드 메모리 할당, 기본값 초기화, 초기화 수식 실행 (Test3의 int a)
  2) 하위 클래스의 필드 메모리 할당, 기본값 초기화, 초기화 수식 실행 (Demo3의 int x)
  3) 상위 클래스의 초기화 블럭 실행 (잘안함)
  4) 상위 클래스의 생성자 몸체 실행 Test3 생성자...
  5) 하위 클래스의 초기화 블럭 실행 
  6) 하위 클래스의 생성자 몸체 실행 Demo3 생성자...
 */
public class Ex03_constructor {
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.disp();
		
		
	}

}

class Test3{
	int a = 10;
	public Test3() {
		System.out.println("Test3 생성자...");
	}
	public void print() {
		System.out.println(a);
	}
}

class Demo3 extends Test3{
	int x = 100;
	
	public Demo3() {
		super(); // 상위 클래스의 생성자 몸체를 호출
				 // 없으면 컴파일시 컴파일러가 super();를 추가하여 인자 없는 상위 클래스 생성자를 호출
				 // 호출할 경우 최상단에서 호출해야함
		System.out.println("Demo3 생성자...");
	}
	public void disp() {
		System.out.println(a + ", "+x);
	}
}
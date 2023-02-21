package ch08.unit1;

public class Ex04 {
	public static void main(String[] args) {
		//Test4 t = new Test4(); // 컴오류. 인자가 없는 생성자가 없음
		Test4 t = new Test4(10); // 인자가 있어 가능
		System.out.println(t.x); //10

		Demo4 d = new Demo4(); // Demo4에 인자가 존재하기 때문에 인자 없는 생성자 호출 가능 
		d.disp();
	
	}

}

class Test4{
	int x;
	
	public Test4(int x) { // 인자가 있는 생성자만 존재 -> 하위 클래스에도 인자가 존재해야 함
		this.x = x;
		
	}
	public void print() {
		System.out.println(x);
	}
}

class Demo4 extends Test4{
	int a = 10;
	
	public Demo4() { // 상위 클래스에 인자가 있는 생성자만 존재하면 하위클래스는 생성자를 만들고
					 // super(값); 으로 반드시 상위 클래스 생성자를 호출해야 한다.
		super(100);
	}
	public void disp() {
		System.out.println(x+","+a); // 100 10
	}
	
}
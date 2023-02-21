package ch06.unit4;

public class Ex02 {

	public static void main(String[] args) {
		// Test2 ob = new Test2(); // 컴파일 오류. 인자가 없는 생성자가 없다.
		
		Test2 ob = new Test2("김자바", 20);
		ob.print();
				
	}

}

class Test2{
	private String name;
	private int age;
	
	public Test2(String n, int a) {
		name = n;
		age=a;
	}
	
	public void print() {
		String s = age>=19 ? "성인" : "미성년자";
		System.out.println(name + ":"+age+", "+s);
	}
}
package ch06.unit4;

public class Ex12_this {
// obj가 a를 호출한 것과 obj2가 a를 호출한 것은 다름
	public static void main(String[] args) {
		Demo2 obj = new Demo2(); 
		obj.set(10);
		obj.print(); // 10 110 5 100
		obj.write(); // 10 110 5 
		System.out.println();

		Demo2 obj2 = new Demo2();
		obj2.set(5);
		obj2.print(); // 10 105 5 100
		obj2.write(); // 10 105 5
		System.out.println();
	}

}

class Demo2{
	private int a;
	private int b;
	private int c=5;
	
	// this
	//	: 호출한 객체를 나타내는 키워드
	// 	: static 메소드에서는 사용 불가
	public void set(int b) {
		this.a=10; // this.a: 호출한 객체의 인스턴스변수. a라는 이름의 지역변수가 없기에 this.은 생략가능(obj a& obj2 a) 
		this.b=b+100; // this.b: 필드, b: 매개변수. b값에 10 대입
	}

	public void print() {
		int c =100;
		System.out.println("this.a: "+this.a+"this.b: "+this.b+"this.c: "+this.c+",c: "+c);
		// System.out.println("this.a: "+this.a+"this.b: "+this.b+"this.c: "+this.c+",c: "+c);
	}
	
	public void write() {
		System.out.println("this.a: "+this.a+"this.b: "+this.b+"this.c: "+this.c);
		// System.out.println("this.a: "+this.a+"this.b: "+this.b+"this.c: "+this.c);
		
	}
}
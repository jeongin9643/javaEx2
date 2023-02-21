package ch06.unit4;

public class Ex11_this {

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.set(50);
		obj.print(); // 0 100 100
		obj.write(); // 0 100 5
		
	}

}

// 필드와 지역변수(매개변수)명이 동일하면 지역변수(매개변수)가 우선순위가 높다.


class Demo1{
	private int a; //  a:필드. 초기값 =0.
	private int b; 
	private int c = 5;
	
	public void set(int a) { // a: 매개변수.(우선순위: 필드<매개변수). a에 50을 넣고 다시 a가 10이 됨
		a =10; // 매개변수 a에 10 대입.  
		b= b+100; // 매개변수가 없기에 필드 b에 100더하기. 0+100 b== 100.
	} // 지역변수가 a==10;이 끝나서 없어짐. 아래 println a==필드값이 됨
	public void print() {
		int c= 100; //필드 < 지역변수 
		System.out.println(a+","+b+","+c); // 0 100 100. a: 필드, b:필드, c: 지역변수
		
	}
	public void write(){
		
		System.out.println(a+","+b+","+c); //a: 필드, b:필드, c:필드
	}
}

package ch06.unit2;

public class Ex01 {

	public static void main(String[] args) {
		int w=10, h=5;
		int a, b;
		
		Rect obj = new Rect(w,h); // 생성자 생성
		a = obj.area();
		b = obj.len();
		System.out.println(a + ", "+b);
		
		Rect obj2 = new Rect(10,20);
		a = obj2.area();
		b = obj2.len();
		System.out.println(a + ", "+b);
	}
}

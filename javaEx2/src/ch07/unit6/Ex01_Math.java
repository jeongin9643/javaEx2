package ch07.unit6;

public class Ex01_Math {

	public static void main(String[] args) {
		double a;
		
		a = Math.sin(30.0 * Math.PI / 180); // 라디안
		System.out.println(a);
		
		a = Math.sqrt(2);
		System.out.println(a);
		
		a = Math.floor(12.7); // 절삭
		System.out.println(a);
		
		a = Math.pow(2, 10); // 2의10승
		System.out.println(a);
	}

}

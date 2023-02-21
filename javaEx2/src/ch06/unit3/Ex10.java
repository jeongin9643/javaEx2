package ch06.unit3;

public class Ex10 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.printf("%5d", fibonacci(i));
		}
		System.out.println();
	}
	public static int fibonacci(int n) {
		if(n<2) {
			return n;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}

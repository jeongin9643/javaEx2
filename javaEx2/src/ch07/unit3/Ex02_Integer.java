package ch07.unit3;

public class Ex02_Integer {

	public static void main(String[] args) {
		String s1, s2;
		int a, b;
		
		s1 = "123";
		s2 = "456";
		System.out.println(s1+s2); // 123456 문자열 결합
		
		// 문자열을 정수(10진수)로 변환
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println(a+b); // 579
		
		//a = Integer.parseInt("1,234"); // 런타임오류(NumberFormatException) - 콤마 있을 경우
		// a = Integer.parseInt("123.4"); // 런타임오류(NumberFormatException) - 소수점일 경우
		// a = Integer.parseInt("b1"); // 런타임오류(NumberFormatException) - 문자일 경우
		
		// 16진수형태의 문자열을 10진수의 정수로 변환
		 a = Integer.parseInt("b1", 16);
		 System.out.println(a); // 177
		 
		 a = Integer.parseInt("1100");
		 System.out.println(a); // 10진수 1100

		 // 2진수형태의 문자열을 10진수의 정수로 변환
		 a = Integer.parseInt("1100", 2);
		 System.out.println(a); // 10진수의 12
		 
		 a =123;
		 // int를 String으로 변환
		 s1 = Integer.toString(a);
		 System.out.println(s1);  // "123"
		
		 // int를 2진수 형식의 String으로 변환
		 s1 = Integer.toBinaryString(a);
		 System.out.println(s1);  // "1111011"
		 
		 // int를 16진수 형식의 String으로 변환
		 s1 = Integer.toHexString(a);
		 System.out.println(s1);  // "7b"
		 
		 
	}

}

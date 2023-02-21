package ch07.unit7;

import java.text.NumberFormat;

public class Ex02_NumberFormat {

	public static void main(String[] args) {
		String s1 = "1000";
		String s2 = "1,234";
		String s3 = "4567.12";
		
		// 문자열 => 숫자
		int a = Integer.parseInt(s1);
		System.out.println(a);
		
		//a = Integer.parseInt(s2);  // 런타임 오류. ,때문에 숫자로 변환 불가
		a = Integer.parseInt(s2.replaceAll(",", ""));
		System.out.println(a);
		System.out.println();
		
		// Number : Integer, Long, Double 등의 상위 클래스(아버지)
		// int, long, double처럼 기본 자료형은 서로 형변환 가능
		// Integer, Long, Double 등은 서로 상하관계가 아니므로 형변환이 되지 않는다.
		
		try {
			NumberFormat nf = NumberFormat.getInstance();
			// 예외를 내포하고 있는 코드 작성 : 프로그램 실행중 예외가 발생하면 catch 블럭 실행
			Number n1 = nf.parse(s1); // Long
			Number n2 = nf.parse(s2); // Long
			Number n3 = nf.parse(s3); // Double
			
			System.out.println(n1); // 1000
			System.out.println(n2); // 1234
			System.out.println(n3); // 4567.12
			
			// System.out.println(n1+20); // 컴오류
			
			// Integer ob = (Integer)n1; // 런타임 오류. ClassCastException
			Long ob = (Long)n1;
			System.out.println(ob);
			System.out.println(ob+10); // 1010, 실제는 ob.longValue()+10
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

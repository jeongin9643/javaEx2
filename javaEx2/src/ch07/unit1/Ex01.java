package ch07.unit1;

import java.util.Calendar;
public class Ex01 {

	public static void main(String[] args) {
		// 다른 패키지의 클래스를 패키지명을 명시하여 사용
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String s;
		System.out.print("좋아하는 과목 ? ");
		s =sc.next();
		System.out.println(s);

		// import를 이용하여 다른 패키지의 클래스 사용
		Calendar cal = Calendar.getInstance();
		System.out.printf("%tF %tA %tT\n", cal, cal, cal);
		
		sc.close();
	}

}

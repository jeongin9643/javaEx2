package ch07.unit5;

import java.util.Calendar;
/*
  - Calendar
  	: 날짜와 시간을 객체 모델링한 클래스
  	: 추상 클래스. 객체를 바로 생성할 수 없다.
 */
public class Ex01_Calender {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		// %tF : yyyy-MM-dd   %tA : 요일    %tT : 시간(시:분:초)
		String s = String.format("%tF %tA %tT", cal, cal, cal); // 년월일 요일 시분초
		System.out.println(s);
		System.out.printf("%tF %tA %tT\n", cal, cal, cal);
		
		int y = cal.get(Calendar.YEAR);  // 년도를 가져오는 파이널
		int m = cal.get(Calendar.MONTH)+1; // 월  
			// (Calendar.MONTH)+1: 0(1월) ~ 11(12월) -> 인덱스 개념
		int d = cal.get(Calendar.DATE);	//일자
		// int d = cal.get(Calendar.DAY_OF_MONTH);
		int w = cal.get(Calendar.DAY_OF_WEEK);
			// Calendar.DAY_OF_WEEK : 1(일) ~ 7(토)
		int end = cal.getActualMaximum(Calendar.DATE); // 월의 마지막 날짜
		
		System.out.println(y+"년 "+m + "월 "+ d +"일 ");
		System.out.println("1:일~7:토, "+w);
		System.out.println(m + "월의 마지막 일자는 " + end);
		
		// 2023년 5월 5일로 날짜를 변경
		cal.set(2023, 5-1,5); // 월은 0부터 시작.
		System.out.printf("%tF\n",cal);
		
		// 2023년 5월 35일로 날짜 변경
		// cal.set(2023, 5-1,35); // 월은 0부터 시작.
		cal.set(Calendar.YEAR,  2023);
		cal.set(Calendar.MONTH, 5-1);
		cal.set(Calendar.DATE, 35);
		System.out.printf("%tF\n",cal); // 2023-06-04

		// 2023년 1월 10일부터 100일 후는?
		cal.set(2023, 1-1, 10); // calender 해당 날짜 설정
		cal.add(Calendar.DATE, 100);
		System.out.printf("%tF\n",cal); // 2023-04-20
		
		// 1970년 1월 1일 0시 0분 0초를 기준으로 밀리초 단위로 환산하여 변환
		long t = cal.getTimeInMillis();
		System.out.println(t);
		
		
		
	}

}

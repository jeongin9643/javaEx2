package ch07.unit5;

import java.util.Calendar;
import java.util.Date;

public class Ex13_Date {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.printf("%tF\n", cal);
		
		// Calendar => java.util.Date
		Date date = cal.getTime();
		System.out.println(date);
		
		/*
		  - 패키지를 모은 집단 = 모듈
		  - java.base : 기본 모듈 (프로그램 작성 시 필요한 기본적인 환경. enterprise)
		  - 기본 모듈에는 java.sql이 없어서 에러 발생한 것
		  - java.se   : java.desktop(java.awt, java.swings), java.sql(java.sql, javax.sql) 모듈이 포함되어 있음
		 */
		
		// java.util.Date => java.sql.Date
		// java.sql.Date 
		//   : DB에 날짜를 저장하거나, DB의 날짜를 추출할 때 사용
		//   : yyyy-MM-dd
		
		//java.sql.Date date2 = new java.sql.Date(date.getTime()); 
		// --> 버전이 8이 아니여서 에러. module-info.java에 코드 생성해야 함 : requires java.se; d입력
		java.sql.Date date2 = new java.sql.Date(date.getTime()); // --> 버전이 8이 아니여서 에러. util Date를 sql Date로 변경
		System.out.println(date2);
		
		// java.util.Date => Calendar
		cal.setTime(date2);
		System.out.printf("%tF\n", cal);

	}

}

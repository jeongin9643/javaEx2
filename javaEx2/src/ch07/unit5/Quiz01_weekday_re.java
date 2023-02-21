package ch07.unit5;

import java.util.Calendar;
import java.util.Scanner;

/*
  - 날짜를 입력받아 요일을 출력하는 프로그램 작성
  1) 날짜는 문자열로 다음과 같은 형식으로 입력하면 입력 형식이 잘못된 경우 재입력 한다.
  	 날짜 ? 2023-02-15  ---> 문자를 정수로, split 사용
  2) 출력
  	 2023년 2월 15일은 수요일
  3) %tA 변환문자를 사용하지 않는다.   ---> 배열 사용
   정규식 : ^(\\d{4}-\\d{2}-\\d{2})$   ---> matches를 활용하여 맞는지 확인
 */
public class Quiz01_weekday_re {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s; // 날짜 문자열을 입력 받을 변수 선언
		String []week = {"일", "월", "화", "수", "목", "금", " 토"};  
		int y, m, d, w;
		
		do {
			System.out.println("날짜 ? [yyyy-mm-dd]");
			s = sc.next();
		}while(!s.matches("^(\\d{4}-\\d{2}-\\d{2})$")); // 정규식이 어긋나면 반복문 중단
		
		String[]ss = s.split("-"); // "-"를 기준으로 문자열 자르기
		y = Integer.parseInt(ss[0]);	
		m = Integer.parseInt(ss[1]);
		d = Integer.parseInt(ss[2]);
 
		
		Calendar cal = Calendar.getInstance();
		cal.set(y, m-1,d);
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(y+"년"+m+"월"+d+"일은 "+week[w-1]+"요일 입니다.");

		sc.close();
	}

}

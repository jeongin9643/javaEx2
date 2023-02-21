package ch07.unit5;

//import java.util.Calendar;
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
public class Quiz01_weekday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int n;
		String s;

		System.out.print("날짜 ? [yyyy-mm-dd]"); 
		s = sc.next();	// 입력
		
		if(!s.matches("^(\\d{4}-\\d{2}-\\d{2})$)")) {
			System.out.print("입력 오류입니다.");	// 입력 형식이 잘못된 경우
			sc.close();
			System.exit(0);
		}
		
//		n = Integer.parseInt(s);	// 문자를 정수로
		
//		Calendar cal = Calendar.getInstance();
		
//		s = String.format("%tF", cal);
//		int y = cal.get(Calendar.YEAR);
//		int m = cal.get(Calendar.MONTH)+1;
//		int d = cal.get(Calendarz.DATE);
//		String []w = {"일", "월", "화", "수", "목", "금", "토", "일"};

		String[] tt = s.split("-");
		System.out.println(tt[0] + " 년 " + tt[1] + " 월 " + tt[2]+"일");
		
//		System.out.println(y+"년 "+m + "월 "+ d +"일 ");

		
		
	}

}

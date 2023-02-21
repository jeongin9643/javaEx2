package ch07.unit5;

//import java.util.Calendar;
import java.util.Scanner;

/*
  - 생년월일을 입력 받아 만 나이를 구하는 프로그램 작성
  1) 날짜는 문자열로 다음과 같은 형식으로 입력하면 입력 형식이 잘못된 경우 재입력한다.
  	 생년월일 ? 2023-02-15
  2) 출력
  	 나이 : 0살
  	 정규식 : ^(\\d{4}-\\d{2}-\\d{2})$ 
  	 나이 : 년도 - 년도, 생일이 안지났으면 -1
 */
public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		
		System.out.print("생년월일?");
		s =sc.next();
//		s = Integer.toString(num);
		
		
		if(!s.matches("^(\\d{4}-\\d{2}-\\d{2})$)")) {
			System.out.print("입력 오류입니다.");	// 입력 형식이 잘못된 경우
			sc.close();
			System.exit(0);
		}
		
//		Calendar cal = Calendar.getInstance();
		
	}

}

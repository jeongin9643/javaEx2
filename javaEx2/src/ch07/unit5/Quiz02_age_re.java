package ch07.unit5;

import java.util.Calendar;
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
public class Quiz02_age_re {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String birth; // 생일 변수 선언
		int age; // 나이 변수 선언

		do {
			System.out.println("생년월일 ?");
			birth = sc.next();
			birth = birth.replaceAll("(\\-|\\.|\\/)", "");
		} while (!birth.matches("^(\\d{8})$"));
		
		// 문자열 자르기
		int y = Integer.parseInt(birth.substring(0, 4));
		int m = Integer.parseInt(birth.substring(4, 6));
		int d = Integer.parseInt(birth.substring(6));

		Calendar now = Calendar.getInstance();
		age = now.get(Calendar.YEAR) - y; // 나이 = 현재 년도 나이 - 입력 나이

		// 생일이 안지났으면 -1
		if (m > now.get(Calendar.MONTH) + 1 || (m == now.get(Calendar.MONTH) + 1 && d > now.get(Calendar.DATE))){
			age--;
		}

		System.out.println("나이 : "+ age);

		sc.close();
	}

}

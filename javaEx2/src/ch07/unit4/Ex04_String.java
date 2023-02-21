package ch07.unit4;

import java.util.Scanner;

public class Ex04_String {

	public static void main(String[] args) {
		/*
 		- 이름을 입력 받아 김씨의 인원수 출력
 		- 입력 받은 값이 end, End, END 등이면 인원수를 출력하고 종료
 		- 예 
 		  이름[종료:end] ? 김자바
 		  이름[종료:end] ? 너자바
 		  이름[종료:end] ? end
 		  김씨 : 1 명
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int cnt=0;
		
		while(true) {
			System.out.println("이름[종료:end] ?");
			name = sc.next();
			if(name.equalsIgnoreCase("end")) {
			break;
			}
			/*
			if(name.startsWith("김")) { //문자열 비교
				cnt++;
			}
			 */
		
			if(name.charAt(0)=='김') { // 문자는 ==으로 비교
			cnt++;
			}
		
		}		
		System.out.println("김씨 : "+ cnt + "명");
		sc.close();
		
	}

}

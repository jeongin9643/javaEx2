package ch07.unit4;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		/*
		 - 수식을 문자열로 입력 받아 연산하는 프로그램 작성
		 - 실행 예
		   수식 ? 10+5
		   10+5 = 15
		 - 수식을 입력할 때 부호는 모두 양수만 입력한다는 가정하에 문제를 해결
		 - 수식에서 연산자는 +, -, *, /만 가능
		   기타 수식은 연산자 입력 오류 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("수식 ?");
		str = sc.nextLine(); // 중간에 공백 
		str = str.replaceAll("\\s", ""); // 공백제거
		
		// [+ - * /]
		if(! str.matches("^\\d+[\\+|\\-|\\*|\\/]\\d+$")){ // ^ 앞에와 $뒤에 숫자. -> 시작과 끝은 숫자로. +: 한 글자 이상
			System.out.println("수식 입력 오류입니다.");
			sc.close();
			//return;
			System.exit(0);  //프로그램 강제 종료
		}

		/*
		// 1번째 방법
		String[]ss = str.split("[\\+|\\-|\\*|\\/]");
//		System.out.println(ss[0]);
//		System.out.println(ss[1]);
		char op = str.charAt(ss[0].length());
		int n1 = Integer.parseInt(ss[0]);
		int n2 = Integer.parseInt(ss[1]);
		System.out.println(op);
		
		int result = 0;
			switch(op) {
			case "+" : result = n1+n2; break;
			case "-" : result = n1-n2; break;
			case "*" : result = n1*n2; break;
			case "/" : result = n1/n2; break;
				
			}				
			System.out.printf("%s = %d\n", str, result);

		*/
		
		 /*
		String op = str.replaceAll("\\d", ""); // 숫자 없애기
		int n1 = Integer.parseInt(str.substring(0, str.indexOf(op)));
		int n2 = Integer.parseInt(str.substring(str.indexOf(op)+1));
//		System.out.println(n1+":"+n2+":"+op);
				int result = 0;
				switch(op) {
				case "+" : result = n1+n2; break;
				case "-" : result = n1-n2; break;
				case "*" : result = n1*n2; break;
				case "/" : result = n1/n2; break;
				
				}
				System.out.printf("%s = %d\n", str, result);
		
		 */
		
 	
		for(String op : new String[] {"+", "-", "*", "/"}) {
			int pos = str.indexOf(op); // 처음 +가 몇 번째인지 확인
			if(pos>0) {	// 수식이 존재하다면			
				int n1 = Integer.parseInt(str.substring(0, pos)); // 10+10 ->  0,2 (0,1)
				int n2 = Integer.parseInt(str.substring(pos+1));
				
				int result = 0;
				switch(op) {
				case "+" : result = n1+n2; break;
				case "-" : result = n1-n2; break;
				case "*" : result = n1*n2; break;
				case "/" : result = n1/n2; break;
				
				}
				System.out.printf("%s = %d\n", str, result);
				break;
			}
		}
 
		sc.close();
		
	}

}

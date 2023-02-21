package ch07.unit4;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 정수를 입력 받아 몇 자리 정수인지 출력
		Scanner sc = new Scanner(System.in);
		int n;
		String s;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();  // 입력
		
		s = n>0 ? Integer.toString(n) : Integer.toString(n*-1);  // 양수면 양수, 음수면 *-1
		System.out.println(n + ":"+s.length()+" 자리수 정수");
		
		sc.close();
	}

}

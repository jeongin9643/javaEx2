package ch07.unit5;

import java.util.Calendar;
import java.util.Scanner;

public class Ex04_Calendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, w;
		
		do {
			System.out.print("년도?");
			y = sc.nextInt();
		}while(y<1900); // 1900미만이라면 끝나기.
		
		do {
			System.out.print("월 ? ");
			m = sc.nextInt();
		}while(m<1 || m>12); // 1~12가 아니라면 끝내기
		
		Calendar cal = Calendar.getInstance();
		cal.set(y, m-1, 1);
		w = cal.get(Calendar.DAY_OF_WEEK); // 3월 1일의 요일 
		
		System.out.println("\n\t" +y+"년 "+ m+"월");
		System.out.println("-----------------------------------------");
		System.out.println("  일   월   화   수   목   금   토");
		System.out.println("-----------------------------------------");
		
		for(int i=1; i<w; i++) { // 1일이 시작하기 전에 요일에 맞춰 빈 공백 설정. w=4이기 때문에 3번 돌아야 함. <=가 아니라 <로 설정. 
			System.out.print("    ");
		}
		for(int i=1; i<cal.getActualMaximum(Calendar.DATE); i++) { // 월의 마지막 날짜 구해서 1일 부터 마지막 날짜까지 돌리기
			System.out.printf("%4d", i);
			if(++w % 7 == 1) { // 주마다 한 줄 넘기기
				System.out.println();
			}
		}
		 if(w%7 != 1) { // 마지막 주인 경우 줄 넘기고 밑줄처리
			 System.out.println();
		 }
		 System.out.println("-----------------------------------------");
		 
		 sc.close();
	}

}

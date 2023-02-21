package ch06.unit3;

import java.util.Scanner;

public class Ex05 {
	public static void menu() {
		System.out.println("-------------- 메뉴 -------------");
		System.out.println("- 1.가위 2.바위 3.보 4.종료-");
		System.out.println("--------------------------------");
		System.out.println("선택[1~4] ?");
	}

	public static String converText(int n) {
		return n == 1 ? "가위" : (n == 2 ? "바위" : "보");
	}

	public static int computer() {
		return (int) (Math.random() * 3) + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user, com;

		while (true) {
			do {
				menu();
				user = sc.nextInt();
			} while (user < 1 || user > 4);

			if (user == 4) {
				break;
			}
			com = computer();
			System.out.println("유저 : "+ converText(user));
			System.out.println("컴퓨터 : "+ converText(com));
			
			if(user == com) {
				System.out.println("비겼습니다.\n");
			}else if(user-com == -2 || user -com ==1) {
				System.out.println("유저 승리...\n");
			}else{
				System.out.println("컴퓨터 승리...\n");
			}
			
			
		}

		sc.close();

	}

}

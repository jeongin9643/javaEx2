package ch06.di;

import java.util.Scanner;

public class UserUI {
	private Scanner sc = new Scanner(System.in);
	private User user = new User();
	private UserResult ur = new UserResult(user); // 위의 user를 받아 UserResult로 감
	
	public UserUI() {
		
	}
	public void menu() {
		System.out.println("Dependency Injection(의존성 주입)");
		int ch;
		
		while(true) {
			do {
				System.out.print("1.입력 2.출력 3.종료 =>");
				ch = sc.nextInt();
			}while(ch<1||ch>3);
			
			if(ch==3) {
				return;
			}
			
			switch(ch) {
			case 1: input(); break;
			case 2: print(); break;
			}
		}
	}
	
	public void input() {
		System.out.println("\n데이터 입력...");
		
		UserVO vo = new UserVO();
		
		System.out.print("이름 ? ");
		vo.setName(sc.next());
		System.out.print("나이 ? ");
		vo.setAge(sc.nextInt());
		
		user.append(vo);
		
		System.out.println("추가 완료...\n");
	}
	
	public void print() {
		System.out.println("\n데이터 출력");
		ur.printAll();
	}
}

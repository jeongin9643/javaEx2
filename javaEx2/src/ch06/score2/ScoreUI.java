package ch06.score2;

import java.util.Scanner;

public class ScoreUI {
	private Scanner sc = new Scanner(System.in); // scanner private으로 만듦
	private Score ss = new Score();
	
	public void menu() {// menu가 무한루프이기에 계속 화면 구동
		int ch;
		
		while(true) {
			do {
				System.out.print("1. 등록 2.학번검색 3.전체리스트 4.평점출력 5.수정 6.삭제 7.종료 =>");
				ch = sc.nextInt();
			}while(ch<1 || ch>7);
			
			if(ch == 7) {
				return; // 7.종료 시 menu를 빠져나감
			}
			
			switch(ch) { //menu같은 것은 if 보다 switch가 가독성 높음
			case 1: input(); break;
			case 2: findByHak(); break;
			case 3: listAll(); break;
			case 4: gradeAll(); break;
			case 5: update(); break;
			case 6: delete(); break;
			}
		}
	}
	
	public void input() {
		System.out.println("\n데이터 등록...");
		
		// vo: input 안의 지역변수. 메소드 안에 있을 때 호출하면 잡을 수 있지만, 나가면 데이터를 못찾음(gc의 대상)
		ScoreVO vo = new ScoreVO();
		
		System.out.print("학번 ? ");
		vo.setHak(sc.next()); // 학번에 데이터 넣기
		
		System.out.print("이름 ? ");
		vo.setName(sc.next());
		
		System.out.print("국어 ? ");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어 ? ");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학 ? ");
		vo.setMat(sc.nextInt());
		
		// vo가 없어지지 않도록 append[]에 vo넘김
		int cnt = ss.append(vo);
		
		System.out.println("학생정보가 등록되었습니다.(총인원수 : " + cnt+" )\n");
	}

	public void findByHak() {
		System.out.println("\n학번 등록...");
		
		String hak;
		
		System.out.print("검색할 학번 ? ");
		hak = sc.next();
		
		ScoreVO vo = ss.readScore(hak);
		if(vo == null) {
			System.out.println("존재하지 않은 학번입니다.\n");
			return;
		}
		
		System.out.print(vo.getHak()+"\t");
		System.out.print(vo.getName()+"\t");
		System.out.print(vo.getKor()+"\t");
		System.out.print(vo.getEng()+"\t");
		System.out.print(vo.getMat()+"\t");
		System.out.println();
	}
	
	public void listAll() {
		System.out.println("\n전체 리스트...");
		
		ScoreVO[]list = ss.getList();
		int tot, ave;
		for(int idx = 0; idx <ss.getCount(); idx++) {
			ScoreVO vo = list[idx];
			tot = vo.getKor() + vo.getEng() + vo.getMat();
			ave = tot/3;
			
			System.out.print(vo.getHak()+"\t");
			// System.out.print(list[idx].getHak()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMat()+"\t");
			System.out.print(tot+"\t");
			System.out.println(ave);
		}
	}
	
	public void gradeAll() {
		System.out.println("\n평점 리스트...");
		
		ScoreVO[]list = ss.getList();
		for(int idx=0; idx<ss.getCount(); idx++) {
			System.out.print(ss.grade(idx));
			System.out.print(list[idx].getHak()+"\t");
			System.out.print(list[idx].getName()+"\t");
			
			System.out.print(ss.grade(list[idx].getKor())+"\t");
			System.out.print(ss.grade(list[idx].getEng())+"\t");
			System.out.println(ss.grade(list[idx].getMat()));
		}
		System.out.println();
	}
	
	public void update() {
		System.out.println("\n데이터 수정...");
		
		String hak;
		
		System.out.print("검색할 학번 ? ");
		hak = sc.next();
		
		ScoreVO vo = ss.readScore(hak);
		if(vo == null) {
			System.out.println("존재하지 않은 학번입니다.\n");
			return;
		}
		
		System.out.print("이름 ? ");
		vo.setName(sc.next());
		
		System.out.print("국어 ? ");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어 ? ");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학 ? ");
		vo.setMat(sc.nextInt());
		
		System.out.println("수정이 완료되었습니다.\n");
		
	}
	
	public void delete() {
		System.out.println("\n데이터 삭제...");
		
		String hak;
		
		System.out.print("삭제할 학번 ? ");
		hak = sc.next();
		
		ScoreVO vo = ss.readScore(hak);
		if(vo == null) {
			System.out.println("존재하지 않은 학번입니다.\n");
			return;
		}
		
		ss.deleteScore(vo);
		System.out.println("데이터를 삭제했습니다.\n");
		
	}
	
}

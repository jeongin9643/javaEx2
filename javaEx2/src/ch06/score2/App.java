package ch06.score2;
// main은 알고리즘과 같은 소스를 짜지 않음.
public class App {

	public static void main(String[] args) {
		System.out.println("[성적처리 프로그램]");
		
		new ScoreUI().menu();
		/* --> 동일.
		 ScoreUI ui = new ScoreUI();
		 ui.menu();
		 */
	}

}

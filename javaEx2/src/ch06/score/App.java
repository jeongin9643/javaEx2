package ch06.score;
// main은 알고리즘과 같은 소스를 짜지 않음.
public class App {

	public static void main(String[] args) {
		new ScoreUI().menu();
		/* --> 동일.
		 ScoreUI ui = new ScoreUI();
		 ui..menu();
		 */
	}

}

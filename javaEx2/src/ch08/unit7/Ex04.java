package ch08.unit7;

public class Ex04 {
	public static void main(String[] args) {
		Button.onClickListener listener = new Button.onClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("클릭...");
			}
		};
		listener.onClick();
	}

}

class Button { 
	// 중첩 인터페이스
	public interface onClickListener{
		public void onClick();
	}
}
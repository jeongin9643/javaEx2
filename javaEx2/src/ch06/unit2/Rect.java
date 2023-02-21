package ch06.unit2;
// 클래스의 단일책임의 원칙. 직사각형엔 직사각형처럼 관련된 것들만. 원이나 세모 들어올 수 없음
public class Rect {
	// 필드(데이터)
	private int width;
	private int height;
	
	// 생성자
	public Rect(int w, int h) {
		width = w;
		height = h;
	}
	
	// 메소드 - 하나의 메소드는 하나의 기능만.
	public int area() { // 넓이
		int result= width*height;
		
		return result;
	}
	
	public int len() { // 둘레
		return (width +height)*2;
	}
	
}

package ch08.unit10;

import java.util.Date;

public class Ex01_Annotation {
	public static void main(String[] args) {
		User1 u = new User1();
		u.sub1();
		u.sub2();
	}
}

class User1{
	@Override
	public String toString() {
		return "annotation test";
	}
	
	// @Deprecated : 더 나은, 개선된 메소드가 있음을 나타내는 애노테이션
	@Deprecated
	public void sub1() {
		System.out.println("사용을 자제하세요...");
	}
	
	// @SuppressWarnings
	// : 컴파일러의 경고와 관련된 애노테이션
	// : 이 부분에 대해서는 경고문을 출력하지 말라는 의미
	@SuppressWarnings("deprecation")
	public void sub2() {
		Date date = new Date();
		int y = date.getYear() + 1900;
		System.out.println(y);
	}
}
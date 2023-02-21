package ch07.unit4;

public class Ex03_String {

	public static void main(String[] args) {
		// String의 주요 메소드

		String s1 = "seoul korea";
		String s2;
		int n;

		n = s1.length(); // 문자열 길이
		System.out.println(s1 + ":" + n); //11
		
		// 6번째 인덱스부터 8번째 인덱스까지의 문자열 추출. 인덱스는 0부터 시작
		s2 = s1.substring(6,9);
		// substring(s,e);  -> s인덱스부터 e-1 인덱스까지의 문자열 추출
		System.out.println(s2); // kor
		
		// 6번째 인덱스부터 마지막까지 추출
		s2 = s1.substring(6);
		System.out.println(s2); // korea
		
		// s1.toUpperCase(); // 대문자로 변경안됨. String은 불변
		s2 = s1.toUpperCase(); // 대문자로 변환하여 반환 받음
		System.out.println(s2); //SEOUL KOREA

		// 특정 위치의 문자 추출
		char c = s1.charAt(6);
		System.out.println(c); // k

		

	}

}

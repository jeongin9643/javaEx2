package ch07.unit4;

public class Ex05_String {

	public static void main(String[] args) {
		String s1 = "seoul korea";
		String s2;
		int n;
		
		// indexOf() : 특정 문자 또는 특정 문자열 존재하는 위치 반환. 인덱스는 0부터
		// 0: 처음에 위치, -1: 존재하지 않음
		n = s1.indexOf("kor");
		System.out.println(n);//6
		
		n = s1.indexOf("KOR");
		System.out.println(n); //-1. 존재하지 않음
		
		n = s1.indexOf("o");
		System.out.println(n); // 2. 처음부터 비교하여 가장 먼저 찾은 위치
		
		n = s1.indexOf("o",3);
		System.out.println(n); // 7. 3인덱스 문자열부터 비교
		
		n = s1.lastIndexOf("o");
		System.out.println(n); // 7. 마지막 문자열부터 앞으로 찾는다.
		
		s1 = "우리나라 대한민국 대한독립만세";
		s2 = s1.replaceAll("대한", "大韓"); // 정규식 사용 가능. 정규식:패턴, 숫자, 이메일, 전화번호 형식
		System.out.println(s2);
		
		s2 = s1.replace("대한", "大韓"); // 정규식 사용 불가
		System.out.println(s2);
		
		s1 = "우리 123 나라 456 대한";
		s2 = s1.replaceAll(" ", ""); 
		System.out.println(s2);
		
		// 공백과 숫자를 제거
		// 정규식 패턴  -->  \\d:숫자, \\s: 공벡(엔터, 탭, 공백 포함), | : 또는
		s1 = "우리 123 나라 456 대한";
		s2 = s1.replaceAll("\\d|\\s", ""); 
		System.out.println(s2); // 우리나라대한

		// 숫자만 제거
		// s2 = s1.replaceAll("\\d", ""); 
		s2 = s1.replaceAll("[0-9]", ""); 
		System.out.println(s2); // 우리 나라 대한
		
		// 숫자를 *로
		s2 = s1.replaceAll("\\d", "*"); 
		System.out.println(s2); // 우리 *** 나라 *** 대한
		
		s1 = "우리 12나라 ab대한xy민국";
		// 영문자 제거
		s2 = s1.replaceAll("[a-zA-Z]", ""); 
		System.out.println(s2); // 우리 12나라 대한민국

		// 영문자, 숫자 제거
		// s2 = s1.replaceAll("[0-9a-zA-Z]", ""); 
		s2 = s1.replaceAll("\\w", ""); 	// \\w: 영숫자, _, $
		System.out.println(s2); // 우리 나라 대한민국
		
		s2 = s1.replaceAll("(\\w)|[대한]", "");  // 영숫자, 대한 제거
		System.out.println(s2); // 우리 나라 민국
		
		
		

		
		
		
	}

}

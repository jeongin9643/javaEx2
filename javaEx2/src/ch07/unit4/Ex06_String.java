package ch07.unit4;

public class Ex06_String {

	public static void main(String[] args) {
		String p, s;
		
		p = "\\d{1,3}";  // 문자열로 숫자 1~3자리 
		s = "123"; 
		System.out.println(s.matches(p)); //true. 정규식 패턴에 일치하면 true

		s="1234";
		System.out.println(s.matches(p)); // false. 
		
		// 가~힣
		// ^: 시작, $:끝, +:1개 이상
		p = "^[가-힣]+$";
		s = "김ㅋ나";
		System.out.println(s.matches(p)); // false. 
		s = "김가나";
		System.out.println(s.matches(p)); // true. 
		
		
		p = "[가-힣]";
		s = "자바 5 스프링 7";
		s = s.replaceAll(p,"");
		System.out.println(s);
		
		// \\b: 단어 경계
		p = "[가-힣]+\\b";
		s = "자바 스프링5";
		s = s.replaceAll(p,""); // 스프링5. --> 숫자가 있어서 남아 있음
		System.out.println(s);
		
		// 전화번호 형식 
		p = "010-\\d{4}-\\d{4}"; 
		s= "010-1111-1111";
		System.out.println(s.matches(p)); // true. 
		
		p = "우리 12 abc 67 & 79";
		// 숫자가 아닌 것을 *로 치환
		s = s.replaceAll("[^0-9]", "*"); // [^]: 대괄호 안에 있으면 부정, 밖에 있으면 시작
		System.out.println(s);
		
	}

}

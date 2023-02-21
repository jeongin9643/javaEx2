package ch07.unit4;

public class Ex07_String_split {

	public static void main(String[] args) {
		String s;
		int n, m;
		
		s = "	자	바	";
		System.out.println(":"+ s + ":");
		System.out.println(":"+ s.trim() + ":"); // 왼쪽과 오른쪽의 공백을 제거 
		System.out.println(":"+ s.replaceAll("\\s", "") + ":");
		
		n = 30;
		//s =n; //컴오류
		// s = n +""; // 기본자료형 + 문자열 => 문자열
		s = Integer.toString(n);
		System.out.println(s);
		
		n =12345;
		System.out.printf("%, d\n",n);
		s = String.format("%,d", n); // 서식에 맞추어 문자열로 변환. printf와 비슷. 모바일과 웹으로 출력할 때.
		System.out.println(s);
		
		// 같은 방식
		n =10; m=15;
		s = String.format("%d %d %d %d", m, n, m, m);
		System.out.println(s);
		
		s = String.format("%1$d %2$d %1$d %1$d", m, n);
		System.out.println(s);
		

		// split
		s = "자바, 오라클, HTML, css, javascript";
		String[] ss = s.split(","); //특정 패턴으로 문자열을 분리하여 배열로 반환
		for(String a : ss) {
			System.out.println(a + "  ");
		}
		System.out.println();
		
		s = "010-1111-2222";
		String[] tt = s.split("-");
		System.out.println(tt[0] + " : " + tt[1] + " : " + tt[2]);
		
		s = "KOREA";
		byte[] bb = s.getBytes(); // 문자열의 각 문자에 대한 ASCII 코드값을 byte 배열로 반환
		for(byte b : bb) {
			System.out.println(b); // 75 79 82 69 65
		}
		
	}

}

package ch07.unit4;

public class Ex13_String {

	public static void main(String[] args) {
		String s;
		s = "자바"+", 스프링"+", 오라클"+ ", HTML";
			// 내부적으로 StringBuilder로 처리하므로 성능이 우수
		System.out.println(s);
		
		// 가변문자열
		// 아래처럼 문자열을 += 하면 문자열은 불변으로 새로운 메모리 할당과 이전 메모리의 해제등의
		// 작업으로 성능이 매우 좋지 않음. 이렇게 코딩하면 욕을 많이 먹음.
		// 이런 가변문자열은 StringBuilder로 처리.
		s = "자바";
		s += ", 스프링";
		s += ", 오라클";
		s += ", HTML";
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder();
		sb.append("자바");
		sb.append(", 스프링");
		sb.append(", 오라클");
		sb.append(", HTML");
		System.out.println(sb);
	
		// Multiline String : JDK 13에서 preview로 제공하고, 15부터 스팩에 포함
		s =  """
		SELECT hak, name, kor, eng, mat
		FROM score
		WHERE hak = ?
		""";
		
		System.out.println(s);
		
		
	}

}

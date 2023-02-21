package ch07.unit4;

public class Ex02_String {

	public static void main(String[] args) {
		// 문자열 비교
		String s1 = "seoul";
		String s2 = new String("seoul");
		
		// 객체의 ==는 주소를 비교.
		System.out.println(s1 == "seoul"); // t
		System.out.println(s2 == "seoul"); // f 
		System.out.println(s1 == s2);	   // f
		
		// 주소가 아닌 문자열 비교
		// String의 equals()
		// : String의 equals() 메소드는 Object의 equals() 메소드를 override
		// : String의 equals() 메소드는 문자열 비교
		// : Object의 equals() 메소드는 주소 비교
		System.out.println(s1.equals(s2)); // t
		System.out.println(s2.equals("seoul")); // t
		System.out.println();
		
		s1 = "seoul";
		s2 = "SEOUL";
		System.out.println(s1.equals(s2)); // f. 대소문자 구분
		System.out.println(s1.equalsIgnoreCase(s2)); // t. 대소문자 구분하지 않음

		s1 = "seoul korea";
		s2 = "seoul";
		System.out.println(s1.equals(s2)); //f
		System.out.println(s1.startsWith(s2)); //t. 앞부분만 비교(시작하는지 판별)

		s1 = "seoul korea";
		s2 = "seoul";
		System.out.println(s1.endsWith(s2)); //t. 뒷부분만 비교(끝나는지 판별)
		
		// 문자열의 비교에서 >, <, = 등은 사용하면 안된다
		s1 = "seoul korea";
		s2 = "seoul good";
		System.out.println(s1.compareTo(s2)); //4. 
			// 사전식 비교. 틀린 첫 번째 문자의 ASCII코드 차이 : 'k' - 'g'
		
		
	}

}

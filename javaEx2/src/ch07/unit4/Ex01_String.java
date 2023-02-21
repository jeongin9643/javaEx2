package ch07.unit4;

public class Ex01_String {
	public static void main(String[] args) {
		// 문자열은 상수풀에 저장
		// 상수풀에 동일한 문자열이 존재하면 해당 문자열의 주소를 반환
		String s1 = "seoul"; // "seoul" 문자열이 상수풀에서 메모리 할당을 받아 저장하고 그 주소를 반환
		String s2 = "seoul"; // "seoul" 문자열이 상수풀에 존재하므로 이존재하는 문자열의 주소를 반환(메모리 할당 X)
			// s1과 s2는 동일한 영역을 참조한다.(주소가 같음)
		
		// 새로운 객체를 생성하여 문자열을 설정
		String s3 = new String("seoul");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// 주소 비교
		System.out.println(s1==s2);  //true. s1과 s2는 동일한 객체
		System.out.println(s1==s3);  // false. s1과 s2는 다른 객체 ---> new를 다시해서 주소가 달라짐
		
		// 동일한 객체는 해쉬코드가 같지만 해쉬코드가 같다고 동일한 객체는 아니다.
		System.out.println("s1: "+s1.hashCode());
		System.out.println("s2: "+s2.hashCode());
		System.out.println("s3: "+s3.hashCode()); // s3는 해쉬코드는 같지만 주소는 다름.
		
		// String, Integer, Long 클래스 등의 내용은 불변이다.
		s1 += "korea";  // String은 내용이 불면이므로 새로운 영역에 메모리 할당.
		System.out.println(s1); // seoulkorea
		System.out.println(s2); // seoul
		System.out.println(s1==s2); // false
		
		String s4 = ""; // 길이가 0인 문자열
		System.out.println(s4.length()); //0
			// length() : 문자열의 길이를 반환
		
		// String s5 = null; // 메모리가 할당되지 않은 상태
		// System.out.println(s5.length()); // 런타임오류(NullPointerException)
		
	}

}

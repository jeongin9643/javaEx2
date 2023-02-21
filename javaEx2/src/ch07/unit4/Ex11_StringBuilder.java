package ch07.unit4;

/*
  - StringBuilder, StringBuffer 
  : 가변적인 문자열을 처리할 경우 String 보다 속도가 빠름 -> 가변적인 문자는 변하기 때문에 string을 쓰면 안됨
  : new를 통해 객체 생성
  
  - StringBuilder
  : 동시성을 지원하지 않음. 멀티스레드 환경에서 안전하지 않음 -> 동시성은 문제점 안전하지 않음.
  : StringBuffer보다 빠름
  
  - StringBuffer
  : 동시성을 지원. 멀티스레드 환경에서 안전
  
  - StringBuilder나 StringBuffer는 최종적으로 String으로 변환하여 사용되므로
  	가변적인 문자열을 처리하지 않는 경우 String 사용
 */
public class Ex11_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("korea");
		StringBuilder sb2 = new StringBuilder("korea");
		
		System.out.println(sb1);
		System.out.println(sb2);
		// System.out.println(sb2.toString()); // 위 2개와 같음
		
		System.out.println(sb1==sb2); // false. 주소 비교 -> 다른 객체
		System.out.println(sb1.equals(sb2));// false. 주소 비교
					//  StringBuilder의 equals를 말하는데 equals가 없기에 아버지인 object의 주소 비교
		
		// String으로 변환
		String s = sb1.toString();
		System.out.println(s);
		System.out.println(sb1.toString().equals(sb2.toString())); // true
		
		String s1 = "korea";
		String s2 = "korea";
		System.out.println("다른 객체와 문자열 비교 : "+ s1.contentEquals(s2));//t. 다른 객체 : string, StringBuilder, StringBuffer
		System.out.println("다른 객체와 문자열 비교 : "+ s1.contentEquals(sb1)); //t.

		System.out.println("문자열 길이 : "+ sb1.length());//5

		StringBuilder sb3 = new StringBuilder(); // 기본 버퍼 크기 : 16 -----> 버퍼의 공간
		System.out.println("기본버퍼의 크기 : "+sb3.capacity());
		
		// 뒤에 문자열 추가
		sb3.append("java");
		sb3.append("oracle");
		sb3.append("html5");
		sb3.append("css3");
		sb3.append("javascript");
		sb3.append("spring");

		System.out.println(sb3);
		System.out.println("문자열길이 : "+sb3.length()); 
		System.out.println("버퍼크기 : "+sb3.capacity());
		
		System.out.println("css3 위치 : "+ sb3.indexOf("css3"));
		
		// 가장 앞에 프로그래밍 추가. 문자를 해당 위치에 추가
		sb3.insert(0,"프로그래밍");
		System.out.println(sb3);
		
		// oracle 뒤에 servlet 추가
		sb3.insert(sb3.indexOf("oracle")+"oracle".length(), "servlet");
		System.out.println(sb3);
		
		//html5 문자열 제거
		sb3.delete(sb3.indexOf("html5"), sb3.indexOf("html5")+"html5".length());
		System.out.println(sb3);
		
		// oracle 이후 문자열 제거
		sb3.delete(sb3.indexOf("oracle"), sb3.length());
		System.out.println(sb3);
		
		System.out.println("문자열길이 : "+sb3.length()); 
		System.out.println("버퍼크기 : "+sb3.capacity());
		
		// 버퍼의 크기를 문자열 길이로
		sb3.trimToSize();
		System.out.println("버퍼크기 : "+sb3.capacity());
		
		// 모든 문자열 지우기
		sb3.delete(0, sb3.length());
		System.out.println("모두 삭제 후 : "+ sb3);
		
	}

}

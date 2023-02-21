package ch07.unit4;
// append: 빌더에 문자 보관

public class Ex14_StringTime {
	public static void main(String[] args) {
		Test14 t = new Test14();
		t.stringTime();
		t.stringBuilderTime();
		t.stringBufferTime();
		
	}
}

class Test14{
	public void stringTime() {
		System.out.println("string...");

		// 시스템 시간을 millisecond로 환산하여 반환
		long start = System.currentTimeMillis();  // 현재 컴의 시간을 ms 값 환산
		String s = "a";
		for(int i=1; i <100000; i++) {
			s += "a";
		}
		long end = System.currentTimeMillis();
		
		System.out.println("문자열 길이 : "+ s.length()+", 처리 시간: "+(end-start)+"ms");
		System.out.println();
	}
	
	public void stringBuilderTime() {
		System.out.println("StringBuilder...");
	
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("a");
		for(int i =1; i<100000; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.println("문자열 길이 : "+ sb.length()+", 처리 시간: "+(end-start)+"ms");
		System.out.println();
	}

	public void stringBufferTime() {
		System.out.println("stringBuffer..");
		
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("a");
		for(int i =1; i<100000; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.println("문자열 길이 : "+ sb.length()+", 처리 시간: "+(end-start)+"ms");
		System.out.println();
	}
}
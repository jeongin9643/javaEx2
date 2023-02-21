package ch07.unit7;

import java.text.MessageFormat;

public class Ex05_MessageFormat {

	public static void main(String[] args) {
		// MessageFormat : 데이터를 정해진 양식의 문자열로 반환
		// {숫자} : 데이터가 들어갈 자리
		
		String s = "이름 : {0}\t전화:{1}\t나이:{2}";
		Object[] obj = {"김자바", "010-1111-1111", 20}; 
		// String[] obj = {"김자바", "010-1111-1111", 20};  // 20이 숫자라서 오류. "20"으로 해도 object라서 경고가 뜸.
		
		String result = MessageFormat.format(s, obj);
		System.out.println(result);
	}

}

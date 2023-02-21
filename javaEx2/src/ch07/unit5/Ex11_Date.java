package ch07.unit5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex11_Date {

	public static void main(String[] args) {
		Date date = new Date(); //현재 시스템 시간으로 Date객체 생성
		System.out.println(date.toString());  //Thu Feb 16 09:28:41 KST 2023
		
		// 1970년 1월 1일 0시0분0초를 기준으로 밀리초 단위로 환산
		long t = date.getTime();
		System.out.println(t);
		
		Date date2 = new Date(1676507391632L);
		System.out.println(date2);
		
		System.out.println(date.after(date2)); // date 객체가 date2이후의 날짜이면 true
		
		// SimpleDateFormat : 문자열 <-> Date
		
		// Date객체를 String 서식으로 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String s = sdf.format(date);
		System.out.println(s);
		
		// 문자열을 Date 객체로 변환
		String str = "2023-02-16";
		SimpleDateFormat sdf2	= new SimpleDateFormat("yyyy-MM-dd"); // 위 문자열과 형식이 똑같아야 됨
		
		// Date date3 = sdf.parse(str); // parse :문자열을 날짜로 바꿔주는데 메소드가 불안전하기 때문에 오류가 남. 문제가 일어날 때와 일어나지 않을 때를 대비해 코딩해야 함. 
		
		try {
			// 예외를 내포하고 있는 코드. 실행을 멈춤
			Date date3 = sdf2.parse(str);
			System.out.println(date3);
		} catch (ParseException e) {
			// 예외가 발생할 때 실행할 코드. 아래 코드 실행 후 나감
			e.printStackTrace();
		}
		
	}
}

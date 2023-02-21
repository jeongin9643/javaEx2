package ch07.unit5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex12_Date {

	public static void main(String[] args) {
		// 날짜 사이의 간격
		Date date = new Date();
		String s = "1996-04-03";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date2 = sdf.parse(s);
			
			// 두 날짜 사이의 간격
			long diff = (date.getTime() - date2.getTime()) / (1000 * 60 * 60 * 24); // 현재 날짜 - 생일 / (밀리초 * 분 * 초 * 시)
			System.out.println(diff);
		} catch (Exception e) {
			e.printStackTrace(); //에러가 발생한 경우 에러 메시지 출력
		}
		
		
	}

}

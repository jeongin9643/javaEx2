package ch07.unit5;

import java.util.Calendar;

public class Ex03_Calendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2023, 3-1, 2);
		cal.getTime(); // set()으로 변경한 날짜는 get() 관련 메소드를 호출해야 실제 시간이 변경됨
		System.out.printf("%tF %tA\n", cal, cal);
		System.out.println();
	
		//clone(): 복제, 필드의 값을 동일하게 다른 영역에 메모리 할당
		Calendar sday = (Calendar)cal.clone();
		sday.set(Calendar.DAY_OF_WEEK, 1); //일요일 날짜로 변경
		System.out.printf("주시작 : %tF %tA\n", sday, sday);
		System.out.println();

		Calendar eday = (Calendar)cal.clone();
		eday.set(Calendar.DAY_OF_WEEK, 7); // 토요일 날짜
		System.out.printf("주마지막 : %tF %tA\n", eday, eday);
		System.out.println();
	}

}

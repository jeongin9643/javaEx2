package ch07.unit8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex01_DateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("현재 날짜 : "+ date); //현재 날짜 : 2023-02-16
	
		LocalDate date2 = LocalDate.of(2023, 03, 01);
		System.out.println("현재 날짜 : "+ date2); //	현재 날짜 : 2023-03-01
		
		LocalTime time = LocalTime.now();
		System.out.println(time); // 14:37:06.921015500
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);  // 2023-02-16T14:38:14.628461

		

	}

}

package ch07.unit8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex02_DateTime {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		int y = now.getYear();
		int m = now.getMonthValue();
		int d = now.getDayOfMonth();
		DayOfWeek week = now.getDayOfWeek();
		System.out.println(y +"-" + m +"-"+d+" "+ week.toString()); // 2023-2-16 THURSDAY
		System.out.println(y +"-" + m +"-"+d+" "+ week.getValue()); // 2023-2-16 4

		LocalDate date = LocalDate.now();
		System.out.println("윤년여부 : "+date.isLeapYear());
		
		LocalDate date2 = date.plusYears(2); //2년 후
		System.out.println(date2);  // 2025-02-16

		// 년도 +2, 월 -2, 일 +3
		LocalDate date3 = date.plusYears(2).minusMonths(2).plusDays(3); //2년 후
		System.out.println(date3);  //2024-12-19

		
	}

}

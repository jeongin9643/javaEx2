package ch07.unit5;

import java.util.Calendar;

public class DateUtil2 {
	/**
	 * 날짜형식이 올바른지 판별
	 * @param date	날짜형식을 판별할 문자열
	 * @return		형식이 올바른지 여부(true/false)
	 */

	
	public boolean isLeapYear(String date) {
		// 2022-02-16
		try {
			if(date.length() !=8 && date.length() != 10) {
				return false;
			}
			date = date.replaceAll("(\\-|\\.|\\/)", "");
			if(date.length() !=8) {
				return false;
			} 
			// 20220216
			int y = Integer.parseInt(date.substring(0,4));
			int m = Integer.parseInt(date.substring(4,6));
			int d = Integer.parseInt(date.substring(6));
			
			Calendar cal = Calendar.getInstance();
			cal.set(y, m-1,d);
			
			 y = cal.get(Calendar.YEAR);
			 m = cal.get(Calendar.MONTH)+1;
			 d = cal.get(Calendar.DATE);
	
			if((y % 4 != 0 && y % 100 ==0) || (y % 400 != 0)) {
				return false;
			}

			
		} catch (Exception e) {
			return false;
		}
		
		return true;
		}
	}

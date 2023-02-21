package ch07.unit5;

public class Ex15_DateUtil2 {

 
	public static void main(String[] args) {
		DateUtil2 util2 = new DateUtil2();
		
		System.out.println("2022-02-29 : " + util2.isLeapYear("2022-02-29"));
		System.out.println("2016-02-29 : " + util2.isLeapYear("2016-02-29"));
		System.out.println("2000/02/29 : " + util2.isLeapYear("2000/02/29"));
		
	}
}

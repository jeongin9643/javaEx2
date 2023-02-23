package ch07.unit5;

public class Ex14_DateUtil {

	public static void main(String[] args) {
		DateUtil util = new DateUtil();
		
		System.out.println("2000-02-29 : " + util.isValidDate("2000-02-29"));
		System.out.println("2000-02-30 : " + util.isValidDate("2000-02-30"));
		System.out.println("2000/02/29 : " + util.isValidDate("2000/02/29"));
		
//		int age = util.toAge("1996-12-30");
//		System.out.println(age);
	}

}

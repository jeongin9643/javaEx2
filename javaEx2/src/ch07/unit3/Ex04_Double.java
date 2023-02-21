package ch07.unit3;

public class Ex04_Double {

	public static void main(String[] args) {
		double d;
		String s;
		
		s = "123.5";
		// 문자열을 double형으로 변환
		d = Double.parseDouble(s);
		System.out.println(s);  // 123.5
		
		d = Double.valueOf(s);
		System.out.println(d); // 123.5
	}

}

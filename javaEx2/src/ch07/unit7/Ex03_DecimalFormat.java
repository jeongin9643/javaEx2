package ch07.unit7;

import java.text.DecimalFormat;

public class Ex03_DecimalFormat {

	public static void main(String[] args) {
		// DecimalFormat : 패턴 형식으로 숫자를 문자열로 변환
		
		/*
		   -78.5267
		   "0.###"	 : 78.527
		   "000.###" : 078.527
		   "00.#"	 : 78.5
		 */
		
		String s;
		DecimalFormat df = new DecimalFormat("#,##0");
		s = df.format(1234567);
		System.out.println(s); // 1,234,567
		System.out.println();
		
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		System.out.println(df2.format(123)); // 123
		System.out.println(df2.format(0)); // 0
		System.out.println(df2.format(0.0)); // 0
		System.out.println(df2.format(0.567)); // 0.57
		System.out.println();
		
		DecimalFormat df3 = new DecimalFormat("#,###.0#");
		System.out.println(df3.format(123)); // 123.0
		System.out.println(df3.format(0)); // .0
		System.out.println();
		
		DecimalFormat df4 = new DecimalFormat("#,##0.0#");
		System.out.println(df4.format(123)); // 123.0
		System.out.println(df4.format(0)); // 0.0
		System.out.println();
		
		
	}

}

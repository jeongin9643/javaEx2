package ch07.unit7;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex01_NumberFormat {

	public static void main(String[] args) {
		String s;
		
		// 숫자 => 문자열
		int a =12345;
		s = Integer.toString(a);
		System.out.println(s);
		
		s = String.format("%,d", a);
		System.out.println(s);
		
		s = String.format("%.2f", 3457.8967);
		System.out.println(s); //3457.90

		s = String.format(Locale.ITALY, "%.2f", 3457.8967);
		System.out.println(s); //3457,90
		System.out.println();
		
		
		// 숫제에 대한 서식화
		NumberFormat nf = NumberFormat.getInstance();
		s = nf.format(a);
		System.out.println(s);//12,345
		
		s = nf.format(31459.56787);
		System.out.println(s); //31,459.568
		System.out.println();
		
		NumberFormat nf2 = NumberFormat.getInstance();
		nf2.setMaximumFractionDigits(4); // 소수점 이하를 최대 4
		nf2.setMinimumFractionDigits(2); // 소수점 이하를 최대 2
		System.out.println(nf2.format(12345));//12,345.00
		System.out.println(nf2.format(12345.456789));//12,345.4568
		
		// 통화
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		System.out.println(nf3.format(12345)); //₩12,345 

		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf4.format(12345));  // $12,345.00

		// %
		NumberFormat nf5 = NumberFormat.getPercentInstance();
		System.out.println(nf5.format(0.23)); // 23%
		
		
	}

}

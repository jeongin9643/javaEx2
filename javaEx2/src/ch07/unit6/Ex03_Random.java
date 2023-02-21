package ch07.unit6;

import java.util.Random;

public class Ex03_Random {

	public static void main(String[] args) {
		System.out.println(toNumber5());
	}
	
	// 00000 ~ 99999 사이의 난수. 결과는 string
	public static String toNumber5() {
		Random rnd = new Random();
		
		/*
		String s = String.format("%05d", rnd.nextInt(100000));
		return s;
		*/
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<5; i++) {
			sb.append(rnd.nextInt(10));
		}
		return sb.toString();
		
	}
	
	// 1~9 사이 수중 서로 다른 세자리수 : 123 ~987
	public static String toNumber3() {
		Random rnd = new Random();
		
		String s;
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i<3; i++) {
			s = Integer.toString(rnd.nextInt(9)+1); // 0~8 + 1 => 1~9
			if(sb.indexOf(s) >= 0) {
				i--;
				continue;
			}
			sb.append(s);
		}
		
		return sb.toString();
	}
}


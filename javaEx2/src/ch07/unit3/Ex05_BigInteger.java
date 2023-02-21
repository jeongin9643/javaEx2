package ch07.unit3;

import java.math.BigInteger;

public class Ex05_BigInteger {

	public static void main(String[] args) {
		//BigInteger : 아주 큰 정수를 다루기 위한 메소드, 필드를 제공하는 클래스

		BigInteger a = new BigInteger("123456789123456789123456789123456891123456789");
		BigInteger b = new BigInteger("12345678912345678912345678912345689112345");
	
		BigInteger c = a.add(b); // 더하기 
		System.out.println(c);

		BigInteger d = a.multiply(b); // 곱셈 
		System.out.println(d);
		
		BigInteger e = a.divide(b); // 나눗셈 
		System.out.println(e);
		
		BigInteger f = a.pow(3);
		System.out.println(f);
	}

}

package ch07.unit3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex07_BigDecimal {

	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("123456789.123456789");
		BigDecimal b = new BigDecimal("3456.89");
		
		// BigDecimal c = a.divide(b); // 런타임 오류. 실수라서 소수점이 한정된 형태여야 하는데 무한대로 계산하게 돼서 터짐. 옵션을 줘야 함(java.lang.ArithmeticException)
		BigDecimal c = a.divide(b, RoundingMode.DOWN);
		System.out.println(c);
		
		c = a.divide(b, 3, RoundingMode.DOWN); // 소수점 이하 3자리
		System.out.println(c);

		System.out.println(a.toBigInteger()); //BigInteger 객체로 변환
	}

}

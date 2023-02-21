package ch07.unit6;

import java.util.Random;

public class Ex02_Random {

	public static void main(String[] args) {
		// Math.random() : 0<= x <1
		
		// Random : 여러 형태의 난수를 발생
		Random rnd = new Random();
		int n;
		for(int i =1; i<=100; i++) {
			n = rnd.nextInt(100);	// 0~99 사이의 난수
			System.out.printf("%5d", n);
			if(i%10 ==0) {
				System.out.println();
			}
		}
	
	}

}

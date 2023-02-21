package ch07.unit4;

public class Quiz03 {

	public static void main(String[] args) {
		/* 	(for, while 사용)
		  - 1~100까지 수를 한 줄에 10개씩 출력. 단 수중에 3, 6, 9가 존재하면개수만큼 *로 출력
		    1 2 * 4  5 * 7  8 * 10
		    	:
		 *  * * ** ...........  100  => 91~100
		 */
		/*
		int n = 0;
		String s;
		
		for(int i =0; i<100; i++) {
			n++;
			s = Integer.toString(n);
			if(n%10==0) {
				System.out.println();
			}
			s = n%10==3 || n%10==6 || n%10==9? s.replaceAll("[3,6,9]", "*"): s;
			System.out.print(s+"\t");
		if( n%10==3 || n%10==6 || n%10==9) {
			s = n;
		}
		s.length() =s.replaceAll("[3, 6,9]","*");
		}
		*/
		
		
		String s;
		
		for(int i =0; i<=100; i++) {
			s = Integer.toString(i);
			s = s.replaceAll("(3|6|9)", "*");
			
			// *이 있는 숫자 지우기
			if(s.indexOf("*") != -1) { // *이 있으면
				s = s.replaceAll("\\d", "");
			}
			
			System.out.printf("%5s", s);
			if(i%10 == 0) {
				System.out.println();
			}
		}
		
	}

}

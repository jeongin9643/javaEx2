package ch06.unit3;

public class Ex02 {

	public static void main(String[] args) {
		Test2 tt =new Test2(); // 1) 객체 생성
		int s;
		
		s = tt.sum(10); // 10: 실매개변수- 호출하는 쪽에서 넘겨주는 변수. 반드시 정수 이하여야 함. 
						// 자료형은 적거나 같아야 함.
						// n 하나이기에 하나만 보낼 수 있음
		
		System.out.println(s);
		System.out.println(tt.sum(100));
		
		System.out.println(tt.isEven(10));
	
//		char a =tt.upper('a'); 선언하면
//		System.out.println(a); 이것도 가능
		System.out.println(tt.upper('a'));
		System.out.println(tt.upper('*'));
		System.out.println(tt.isUpper('a'));
		
		// s = tt.max(5); // 컴오류
		s = tt.max(5, 3);
		System.out.println(s);
		System.out.println(tt.max(5, 9));
		
		tt.gugudan(3); // void 메소드는 반환되는 것이 없음
		tt.gugudan(10); // 실행되지 않음
		
		System.out.println(tt.grade(98));
		System.out.println(tt.hakjeom(80));
	}

}

class Test2{
	//1~n까지 합 구하기
	// 인스턴스 메소드. Test2에 대해 객체 생성 후 사용해야 함
	public int sum(int n) {// n:형식 매개변수(지역변수)-메소드가 호출될때 스택영역에 메모리 확보
		int s =0; // 지역변수. 메소드가 호출될때 스택영역에 메모리 확보
				  // 지역변수(매개변수)는 메소드가 종료되는 시점에 메모리 회수
		for(int i=1; i<=n; i++) {
			s +=i;
		}
		return s; // 반환타입보다 적거나 같아야 함.
		//System.out.println(); // 컴파일 오류. return문 아래에는 실행문이 올 수 없다.
	}
	
	// n이 짝수이면 true를 반환하는 메소드
	public boolean isEven(int n) {
		return n%2 ==0;
		// return (n&1) == 0; // 비트단위 
		
	}
	
	// 인수로 넘어온 문자가 소문자이면 대문자로 변환하는 함수
	public char upper(char c) {
		return c>= 'a'&& c<= 'z' ? (char)(c-32) : c;
	}
	
	// 인수로 넘어온 문자가 대문자 인지 판별
	public boolean isUpper(char c) {
		return c >= 'A' && c<='Z';
	}
	
	// 두 수중 큰수를 구하는 함수
	//public int Max(int a, b){ // 컴파일 오류
	public int max(int a, int b) {
		return a>b ? a: b;
	}
	
	// n단의 구구단을 출력하는 메소드. 단, 인수로 넘어온 dan이 1보다 적거나 9보다 크면 출력하지 않는다.
	// void 리턴 타입 : 메소드를 실행하고 실행한 결과를 반환할 필요가 없는 경우에 사용
	public void gugudan (int dan) {
		if(dan <1 || dan>9) {
			return;
		}
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		// 반환타입이 void인 경우 return 생략 가능
		// return; // 생략가능
	}
	
	// 점수에 따른 평점을 계산하는 메소드
	// 95~100: 4.5, 90~94: 4.0, ... 0~59: 0.0
	public  double grade(int score) {
		double s; // else s=0;으로 초기화 하지 않아도 됨.
		
		if(score>=95) s = 4.5;
		else if(score>=90) s = 4.0;
		else if(score>=85) s = 3.5;
		else if(score>=80) s = 3.0;
		else if(score>=75) s = 2.5;
		else if(score>=70) s = 2.0;
		else if(score>=65) s = 1.5;
		else if(score>=60) s = 1.0;
		else s=0;
		return s;
	}
	
	// 점수에 따른 학점 구하기
	// 90~100: A, 80~89:B, ... 0~59:F
	
	
	public String hakjeom(int score) {
		String s;
		
		switch(score/10) {
		case 10:
		case 9 : s = "A"; break;
		case 8 : s = "B"; break;
		case 7 : s = "C"; break;
		case 6 : s = "D"; break;
		default : s = "F"; break;
		}
		
		return s;
		
	}
}
package ch07.unit3;

public class Ex03_Long {

	public static void main(String[] args) {
		long a;
		Long b;
		
		a = 10; // long 변수에 int리터널 10을 대입
		// b = 10; // 컴파일 오류. Long 클래스 객체에는 int리터널 대입 불가
		b = 20L;
		System.out.println(a+":"+b); // 10:20
		
		b= b+a;
		System.out.println(b); //30
		
		// int x = a; // 컴오류. 큰 자료형을 적은 자료형에 대입 불가
		int x = (int)a; // 형변환
		// int y = (int)b; // 컴오류
		// Integer y = (Integer)b; // 컴오류. 클래스는 상하관계가 아닌 경우 형변환 불가 (Integer / Long)의 부모는 Num. 클래스는 형제(자식)은 남. --> 형변환 아예불가. 
		System.out.println(x);
		
		
	}

}

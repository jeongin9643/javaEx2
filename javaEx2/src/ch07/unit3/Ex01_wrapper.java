package ch07.unit3;

public class Ex01_wrapper {

	public static void main(String[] args) {
		int a = 10, b;
		Integer ob =null; // Integer : int에 대응되는 wrapper 클래스. 클래스는 null을 가질 수 있음
		
		//b = null; // 컴오류. 기본 자료형은 null을 가질 수 없다.
		
		ob = a; // 10. 기본자료형(int)이 Integer형으로 자동 변환 (Auto-boxing)
		// ob = Integer.valueOf(a); 
		b = ob; // Integer객체가 기본 자료형인 int로 자동 변환 (Auto-unboxing)
		// b = ob.intValue();

		System.out.println(a+":"+b+":"+ob);
		
		System.out.println("정수 최대값: "+ Integer.MAX_VALUE);
		System.out.println("정수 최대값: "+ Integer.MIN_VALUE);
		System.out.println("int size: "+ Integer.SIZE);
	}

}

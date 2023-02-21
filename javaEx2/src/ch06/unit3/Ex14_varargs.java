package ch06.unit3;

public class Ex14_varargs {

	public static void main(String[] args) {
		Test14 t = new Test14();
		
		int s1 = t.sum(1,3,5,7,9);
		int s2 = t.sum(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
	
	class Test14{
		public int sum(int ...args) { // 비정형 인자
			int s =0;
			
			for(int n : args) {
				s += n;
			}
			return s;
		}
}

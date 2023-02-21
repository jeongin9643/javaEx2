package ch06.unit3;

public class Ex08 {
	public static void main(String[] args) {
		Test8 t= new Test8();
		int s = t.sum(10);
		System.out.println(s);
	}

}


class Test8{
	// 재귀호출을 이용한 합구하기
	public int sum(int n) { 
		return n > 1 ? n + sum(n-1) : 1;  // 자기가 자기를 부름
	}
	
	public int sum2(int n) {
		int s =0;
		for(int i=1; i<=n; i++) {
			s += i;
		}
		return s;
	}
}
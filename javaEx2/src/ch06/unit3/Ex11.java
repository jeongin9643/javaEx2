package ch06.unit3;

public class Ex11 {

	public static void main(String[] args) {
		Test11 t = new Test11();

		double s;
		s = t.pow(2, 10);
		System.out.println(s);

		s = t.pow2(2, -2);
		System.out.println(s);

		s = t.pow(2, 10);
		System.out.println(s);

	}
}

class Test11 {
	// x의 y승을 계산. 단 y가 0이상
	public double pow(int x, int y) {
		return y == 0 ? 1 : x * pow(x, y - 1);
	}

	// x의 y승을 계산. 단 y가 음수도 가능
	public double pow2(int x, int y) {
		if(y>=0) {
			return y == 0 ? 1 : x * pow2(x, y - 1);
		}else {
			return(1.0/x)*pow2(x, y+1);
		}
	}
}

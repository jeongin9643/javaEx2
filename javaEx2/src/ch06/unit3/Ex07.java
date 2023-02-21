package ch06.unit3;

public class Ex07 {

	public static void main(String[] args) {
		Test7 t = new Test7();
		
		t.write(5);
	}

}

// 재귀호출(자기 자신을 부르는 것)
// 재귀호출은 종료조건을 주지 않으면 StackOverflowError이 발생되어 프로그램이 종료. 주기억장치는 용량 한도가 있음. 주기억 장치 공간이 꽉 차버려서 프로그램 실행할 수 없음.
class Test7{
	public void write(int n) { // 5
		if(n>1) {
			write(n-1);  //5 4 3 2 (stack에 쌓임 Last in First out)
		}
		System.out.printf("%5d", n); // 1 2 3 4 5 

	}
}
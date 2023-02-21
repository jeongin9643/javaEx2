package ch06.unit3;

public class Ex06 {

	public static void main(String[] args) {
		Test6 t = new Test6();
		int a;
		a=10;

		t.sub1(a); //  값을 보내줌
		System.out.println("sub1()메소드 호출 후 a : "+a); // 10
		
		t.sub2(t);// 주소를 보내줌 
		System.out.println("sub2() 메소드 호출 후 x : "+ t.x); // 110
		
		int[]nn = {1,3,5,7,9};
		t.sub3(nn);
		System.out.println("sub3 호출 후 nn[1] :" + nn[1]); //103
	}

}


class Test6{
	int x = 10;
	
	public void sub1(int a) { // call by value : 값이 전송. 실매개변수와 형식매개변수가 기억공간을 따로 확보
		a = a + 10;
	}
	
	public void sub2(Test6 tt) { // call by reference(객체) : 객체(참조주소)가 전송
		tt.x += 100;
	}
	
	public void sub3(int[]aa) { // call by reference(배열) : 배열(참조주소)가 전송
		aa[1] += 100;
	}
}
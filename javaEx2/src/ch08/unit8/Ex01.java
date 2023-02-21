package ch08.unit8;

import com.util.MyUtil;
// 동일한 패키지가 아닐 시 import 해야 함
public class Ex01 {
	public static void main(String[] args) {
		MyUtil util = new MyUtil();
		//System.out.println(util.c); // 컴오류. 패키지가 다르면 protected는 접근 불가
		System.out.println(util.d); // public은 패키지가 달라도 접근 가능. 나머지 접근제어자 불가
		util.disp(); // public. 
		
	}

}

class Test1 extends MyUtil {
	public void sub() {
		//System.out.println(b); //  패키지가 다르면 default 접근 제어는 하위 클래스도 접근 불가
		// c: protected는 하위에서 접근 가능
		System.out.println(c+":"+d);  
	}
}
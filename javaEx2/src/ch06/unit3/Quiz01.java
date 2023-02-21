package ch06.unit3;

public class Quiz01 {
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		
		int[]nn = {20, 15, 17, 30, 24, 27};
		System.out.println(obj.max(nn)); //30
		
		System.out.println(obj.number3());
		System.out.println(obj.numberLen(123));
		System.out.println(obj.ascii('A'));
		System.out.println(obj.ascii('z'));
		System.out.println(obj.isAlphabetic('ㄱ'));
		
	}

}

class Demo1{
	// 정수 배열을 매개변수로 넘겨 받아 배열에 있는 데이터중 가장 큰값 변화
	public int max(int[]num) {
		int max;
		max = num[0];
		for(int i=1; i<num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		return max;
	}
	
	// 서로다른 세자리 정수를 반환하는 메소드 : 1xx ~ 9xx
	// 102 ~ 987
	public int number3() {
		int first, second, third;
		
		first = (int)(Math.random()*9)+1; //1~9
		
		do {
			second =(int)(Math.random()*10); // 0~9
		}while(second == first);
		
		do {
			third = (int)(Math.random()*10);	//0~9
		}while(second == third || first ==third);
		
		return first*100 + second*10 +third;
	}
	
	// 매개변수의 정수가 몇자리 정수인지 반환
	public int numberLen(int n) {
		/*
		if(n<0) {
			n=-n;
		}
		return n>=10 ?1+numberLen(n/10):1;  // 재귀호출
		*/
		int len =1;
		if(n<0) {
			n=-n;
		}
		
		while(n>=10) {
			n/=10;
			len++;
		}
		
		return len; 
		
	}
	
	// 매개변수로 주어진 문자의 ASCII코드 반환
	public int ascii(char c) {
		return c;
	}

	// ascii코드에 해당하는 문자 반환
	public char character(int ch) {
		return (char)ch;
	}
	
	//매개변수가 영문자이면 true를 반환하고 그렇지 않으면 false를 반환하는 메소드
	public boolean isAlphabetic(char c) {
		return c>='A' && c<='Z' || c>='a'&& c<='z';
	}
}
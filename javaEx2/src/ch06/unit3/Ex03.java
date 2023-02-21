package ch06.unit3;

public class Ex03 {

	public static void main(String[] args) {
		Test3 tt = new Test3();
		int s;
		int[]a = {1,3,5,7,9};
		
		s =tt.sum(a);
		System.out.println("결과 :"+s); //25

		
		int[] aa = tt.random();
		for(int n:aa) {
			System.out.println(n + "  ");  // 배열은 참조변수여서 heap에 담음. 
		}								  //, 배열은 주소를 넘겨 받으면 사라지지 않음
		System.out.println();
		
	
		System.out.println("\n");
		
		
		int[] nn = tt.random(5);
		for(int n:nn) {
			System.out.print(n + "  ");   
		}								  
		System.out.println();
	

	}
}

class Test3{
	// 인수로 넘어온 배열의 합을 계산하여 반환  지역변수는 return 후 사라지지만
	public int sum(int[]num) { //매개변수가 배열인 경우
		int s=0;
		
		for(int n: num) {
			s+=n;
		}
		
		
		/*
		 for(int i=0; i<num.length; i++){
		 	s += num[i];
		 }
		 */
		
		return s;
	}
	
	// 배열을 반환 -> 배열의 참조값(주소) 반환
	// 1~100까지 수중 난수 10개를 발생하여 반환하는 메소드
	public int[] random() {
		int[]n= new int[10]; 
		
		for(int i=0; i<n.length; i++) {
			n[i] = (int)(Math.random()*100)+1;
		}
		
		return n;
	}
	
	public int[] random(int count) {
		int[]n= new int[count]; 
		
		for(int i=0; i<n.length; i++) {
			n[i] = (int)(Math.random()*100)+1;
		}
		
		return n;
	}
	
}
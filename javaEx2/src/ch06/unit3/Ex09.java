package ch06.unit3;

public class Ex09 {

	public static void main(String[] args) {
		Test9 ob = new Test9();
		ob.print(3);
	}

}

class Test9{
	public void print(int n) {  // n=3
		System.out.println("start : "+ n); 
		
		if(n>1) {
			print(n-1);
			print(n-1);
			
		}
		System.out.println("end : "+n);
	} 
	
}
package ch08.unit11;

public class Ex02 {
	public static void main(String[] args) {
		Point p = new Point(10, 5);
		System.out.println(p.x()+","+p.y());
		System.out.println(p.toString()); // Point[x=10, y=5]. 클래시이름@해쉬코드
	}
}

record Point(int x, int y) {
}

/*
 - 컴파일러는 헤더를 통해 내부 필드를 추론하여 아래의 필드를 자동으로 만듦
 	private final int x; 
 	private final int y;
 - 모든 필드를 초기화 하는 아래의 생성자를 만듦.
  	public Point(int x, int y){
  		this.x = x;
  		thix.y = y;
  	}

 - toString(), equals(), hashCode() 메소드에 대한 구현을 자동으로 제공
 - 각 필드는 getter는 getXxx()가 아니라 필드명을 getter로 만듦
   public int x(){
   		return x;
   }
*/

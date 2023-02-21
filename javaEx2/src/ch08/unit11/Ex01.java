package ch08.unit11;

public class Ex01 {
	public static void main(String[] args) {
		Test obj = new Test(10,5);
		System.out.println(obj.getX()+ "," + obj.getY());
	}
}

final class Test{
	private final int x;
	private final int y; 
	
	public Test(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
}
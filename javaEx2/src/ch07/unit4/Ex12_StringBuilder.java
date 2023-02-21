package ch07.unit4;

public class Ex12_StringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("123456789");
		
		sb.replace(1, 3, "AB"); // 1, 3-1 => 1,2 
		System.out.println(sb); // 1AB456789
		
		sb.delete(0, 3).replace(1, 3, "XY").delete(4, 6);
		// 456789		4XY789				4XY7
		System.out.println(sb); // 4XY7
	
	}

}

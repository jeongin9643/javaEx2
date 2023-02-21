package ch08.unit3;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		Object obj = "korea"; // up-casting "korea"는 String이기 때문에
		System.out.println(((String)obj).length()); // String으로 down-casting해야 함.
		
		Object n1 = 10;  // up-casting
		Object n2 = 20;  // up-casting
		
		// Object n3 = n1+n2; // 컴파일오류
		int n3 = (Integer)n1 + (Integer)n2;	// 다운 캐스팅
		System.out.println(n3);
		
		// Object[] oo = {"seoul", 90, 80, "korea"};
		// Arrays.sort(oo); // 런타임 오류. 문자열과 숫자는 비교 불가
		
		Object[] oo = {"seoul", "90", "80", "korea"};
		Arrays.sort(oo);
		for(Object o : oo) {
			System.out.println(o + " ");
		}
		System.out.println();
	}
}

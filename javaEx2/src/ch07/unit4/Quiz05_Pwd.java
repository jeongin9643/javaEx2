package ch07.unit4;

public class Quiz05_Pwd {

	public static void main(String[] args) {
		Test5 t = new Test5();
		System.out.println(t.generatedPwd());
		System.out.println(t.generatedPwd());
		System.out.println(t.generatedPwd());
	}
}

class Test5{
	// 10자리 패스워드 생성
	public String generatedPwd() {
		// 영문자, 숫자, 특수문자 혼합하여 10자리의 패스워드 생성
		StringBuilder sb = new StringBuilder();
		String s = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ~!@#$%^&*+";
		
		int n;
		for(int i=0; i<10; i++) {
			// sb에 난수를 이용하여 s에 있는 문자 하나를 추출하여 append
			n=(int)(Math.random()* s.length());
			// sb.append(s.substring(n, n+1));
			// sb.append(s.substring(n, n+1));
			sb.append(s.charAt(n));
		
		}
		return sb.toString();
	}
}
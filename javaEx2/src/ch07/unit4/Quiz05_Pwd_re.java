package ch07.unit4;

public class Quiz05_Pwd_re {

	public static void main(String[] args) {
		Test5_re t = new Test5_re();
		System.out.println(t.generatedPwd());
		System.out.println(t.generatedPwd());
		System.out.println(t.generatedPwd());
		
		
	}

}


class Test5_re{
	public String generatedPwd() {
		// 영문자, 숫자, 특수문자 혼합하여 10자리의 패스워드 생성
		StringBuilder sb = new StringBuilder();
		String s = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ~!@#$%^&*+";
				
		int n;
		for(int i=0; i<10; i++) {
			n = (int)(Math.random()*s.length());
//			sb.append(s.substring(n, n+1));
			sb.append(s.charAt(n));
		}
		
		return sb.toString();
	}
}
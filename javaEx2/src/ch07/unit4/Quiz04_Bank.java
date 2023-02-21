package ch07.unit4;

public class Quiz04_Bank {

	public static void main(String[] args) {
		Bank bank = new Bank();
		String s;
		
		s= bank.generateAccountNo();	// 020-08-0000171
		System.out.println(s);

		s= bank.generateAccountNo();	// 020-08-0000172
		System.out.println(s);
		
		s= bank.generateAccountNo();	// 020-08-0000173
		System.out.println(s);
	}
}

class Bank{
	// 마지막 7자리 다음 문자열 만들기
	private String accountNo = "020-08-0000170";
	
	public String generateAccountNo() {
		
		// 020-08-
		//String s1 = accountNo.substring(0,7);
		String s1 = accountNo.substring(0,accountNo.lastIndexOf("-")+1);
		
		// 0000170
		// String s2 = accountNo.substring(7);
		String s2 = accountNo.substring(accountNo.lastIndexOf("-")+1);
		
		// s2를 정수로 변환하여 +1
		int n=Integer.parseInt(s2)+1;
		
		// accountNo를 만들기 : s1 + s2에 1더한 것으로
		accountNo = s1+String.format("%07d", n); // 7자리 확보
		
		return accountNo;
	}

}
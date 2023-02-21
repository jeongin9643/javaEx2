package ch07.unit4;

public class Quiz04_Bank_re {

	public static void main(String[] args) {
		Bank2 bank = new Bank2();
		String s;
		
		s = bank.generateAccountNo();
		System.out.println(s);
		
		s = bank.generateAccountNo();
		System.out.println(s);
		
		s = bank.generateAccountNo();
		System.out.println(s);
		
	}

}

class Bank2{
	private String accountNo = "020-08-000170"; 
		
	public String generateAccountNo(){
			
		// 020-08-
		String s1 = accountNo.substring(0,accountNo.lastIndexOf("-")+1);
			
			
		// 0000170
		String s2 = accountNo.substring(accountNo.lastIndexOf("-")+1);
		
		// s2를 정수로 변환하여 +1
		int n = Integer.parseInt(s2)+1;
			
		// accountNo를 만들기 : s1+s2에 1더한 것
		
		accountNo = s1+String.format("%07d", n);
				
		return accountNo;
		}
}
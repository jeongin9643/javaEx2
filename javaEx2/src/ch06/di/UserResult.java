package ch06.di;

public class UserResult {
	// private User user = new User(); // UserUI에 같은 생성자가 있으므로 UserUI에서 넘겨 받아야 함
	private User user; // 메모리 할당 하지 않음. 객체가 생성되지 않아 NullPointerException오류.
	
	// 생성자를 이용한 의존성 주입
	public UserResult(User user) {
		this.user =user;
	}
	
	public void printAll() {
		UserVO[] list = user.getList(); // user가 null이기 때문에 
		
		System.out.println("\n이름\t나이\t결과");
		System.out.println("------------------------------");

		for(int i=0; i<user.getCount(); i++) {
			UserVO vo = list[i];
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getAge()+"\t");
			System.out.println(vo.getAdult());
		}
		System.out.println();
	}
}

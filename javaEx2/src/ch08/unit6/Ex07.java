package ch08.unit6;

public class Ex07 {
	public static void main(String[] args) {
		// 인터페이스의 익명 구현 - 1회성 : Ex07$1.class의 이름으로 클래스 파일 만들어짐. 저장시 총 3개의 .class 파일 생성됨
		// 원래는 클래스를 만들어야 하는데 Demo7에서 인터페이스 생성자를 만들어 구현 가능. 딱 한 번 사용할 때 사용. 
		
		Demo7 obj = new Demo7() {
			
			@Override
			public void disp() {
				System.out.println("disp...");
			}
		};
		
		obj.disp();
	}
}

interface Demo7 {
	public void disp();
}
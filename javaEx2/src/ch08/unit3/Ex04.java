package ch08.unit3;

public class Ex04 {
	public static void main(String[] args) {
		Object obj = new Test4(); // up-casting
		System.out.println(obj);
			// Object의 toString() : 클래스이름@해쉬코드
			// Object의 toString()을 재정의했으므로 a:10 출력 // 아버지 것 숨어서 출력 불가
		
		// System.out.println(obj.a)); // 컴오류
		System.out.println(((Test4)obj).a); // 다운캐스팅 형변환
		((Test4)obj).print();
	}

}

class Test4{
	int a = 10;
	public void print() {
		System.out.println(a);
		
	}
	
	@Override
	public String toString() {
		return "a:"+a;
	}
	
	
}
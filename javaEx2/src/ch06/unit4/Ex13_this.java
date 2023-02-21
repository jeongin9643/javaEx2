package ch06.unit4;

public class Ex13_this {
	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		// obj.name = "김자바"; // 컴오류. private은 외부에서 접근 불가
		obj.setName("김자바");
		obj.setAge(20);
		String s = obj.result();
		
		System.out.println(obj.getName()+ " : "+ obj.getAge()+ " : "+s);
	}

}

// setter / getter : <Shift>+<alt>+S R A. --> settet: 인스턴스 값 대입, 수정 getter는 값 가져오는 거
class Demo3{
	// 필드는 private으로 만들어야 함
	private String name; 
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; // 필드가 됨.
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String result() { 
		return this.age >= 19 ? "성인": "미성년자";  // this 생략 가능
	}
	
}

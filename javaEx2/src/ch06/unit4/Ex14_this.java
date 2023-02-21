package ch06.unit4;

public class Ex14_this {
	public static void main(String[] args) {
		Demo4 obj = new Demo4("김자바");
		
		obj.print();
		
	}

}

class Demo4{
	private String name;
	private int age;
	
	public Demo4() {
		System.out.println("인자가 없는 생성자");
	}
	
	public Demo4(String name) {
		// Demo4(name); // 컴파일 오류. 생성자는 new 다음에 객체를 생성할 때만 호출 가능
		this(name, 0); // 다른 생성자 호출(다른 생성자의 몸체를 실행)
					   // 생성자의 최상단에 한 번만 사용 가능
		System.out.println("인자가 하나인 생성자");
	}
	
	public Demo4(String name, int age) {
		System.out.println("인자가 두개인 생성자");
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println(name + " : "+age + ", "+ (age>=19 ? "성인" : "미성년자"));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
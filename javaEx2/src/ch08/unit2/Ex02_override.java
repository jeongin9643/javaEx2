package ch08.unit2;

public class Ex02_override {
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.setName("김자바");
		t.setAge(20);
		
		// Object의 toString(): 클래스명@해쉬코드
		System.out.println(t.toString()); // 클래스명@해쉬코드
		System.out.println(t); // 클래스명@해쉬코드
		System.out.println(t.getName()+":"+t.getAge()); //김자바:20
	}

}

class Test2{
	private String name;
	private int age;
	
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
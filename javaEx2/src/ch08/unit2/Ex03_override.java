package ch08.unit2;

public class Ex03_override {
	public static void main(String[] args) {
		Test3 t = new Test3();
		
		t.setName("김자바");
		t.setAge(20);
		
		System.out.println(t);  // 김자바,20
		System.out.println(t.toString());  // 김자바,20
	}
}


class Test3{
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
	
	@Override
	public String toString() {
		return name + "," + age;
	}

 
}
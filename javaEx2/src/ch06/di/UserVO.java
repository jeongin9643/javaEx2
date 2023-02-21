package ch06.di;

public class UserVO { // 한 사람 객체를 저장

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
	public String getAdult() {
		return this.age >= 19 ? "성인" : "미성년자";
	}
}

package ch08.unit9;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(City.SEOUL); // 서울:1000. toString()이 재정의되어 있지 않으면 SEOUL.
		System.out.println(City.SEOUL.getCount()); // 1000
		System.out.println("\n전체 리스트...");
		for(City c : City.values()) {
			System.out.println(c.getName() +":" + c.getCount());
		}
	}

}

// 열거형 상수에 값 할당 - 생성자를 만들어야 함
enum City { 
	SEOUL("서울", 1000),
	BUSAN("부산", 350),
	INCHON("인천", 330);
	
	private String name;
	private int count;
	
	// 생성자는 private만 가능. private 생략하도 private
	private City(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	
	public String getName() {
		return name;
	}


	public int getCount() {
		return count;
	}


	@Override // toString 재정의하면 원하는 형태를 돌려받을 수 있다. 필드니까 값을 돌려주술 있어 getter 가능
	public String toString() {
		return name + ":" + count;
	}
}
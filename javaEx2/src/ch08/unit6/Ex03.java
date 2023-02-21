package ch08.unit6;

/*
  - 인터페이스의 특징
  	: 클래스 간의 결합도를 낮출 수 있다. 클래스 내의 매개 변수가 의존성이 강한 것을 결합도가 높다고 함.
  	: 표준화가 가능(getPrice, getName으로 같은 메소드 사용)
  	: 개발시간 단축
  	
 */
public class Ex03 {
	public static void main(String[] args) {
		Store st = new Store();
		
		st.sell(new Apple());
		st.sell(new Orange());
	}
}

interface Fruit{ 
	public int getPrice();
	public String getName();
}

class Apple implements Fruit{
	@Override
	public int getPrice() {
		return 1000;
	}
	
	@Override
	public String getName() {
		return "사과";
	}
}

class Orange implements Fruit{
	@Override
	public int getPrice() {
		return 900;
	}
	
	@Override
	public String getName() {
		return "오렌지";
	}
}

class Store{
	public void sell(Fruit a) { // 결합도를 낮추어 Orange, Apple도 모두 처리 가능
		System.out.println(a.getName()+", "+a.getPrice());
	}
}

class Store2{  // Apple 클래스에 의존관계가 강함. Orange는 판매할 수 없는 클래스
	public void sell(Apple a) {
		System.out.println(a.getName()+", "+a.getPrice());
	}
}




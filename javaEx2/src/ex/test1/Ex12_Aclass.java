package ex.test1;

public class Ex12_Aclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Aclass {
	public int a;

	protected Aclass(int a) { //420이 들어와 Aclass this.a에 값 대입, a = 420 출력
		this.a = a;
	}
}

class Bclass extends Aclass {
	private Bclass(int a) { // 420 들어와서 super(420)으로 Aclass 호출
		super(a);
	}

	public static void main(String[] args) {
		Bclass ob = new Bclass(420); // Bclass 420 인자. 
		System.out.print(ob.a);
	}
}

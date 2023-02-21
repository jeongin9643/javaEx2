package ex.test1;

class X {
	X() {
		System.out.print(1);
	}

	X(int x) {
		this();
		System.out.print(2);
	}
}

public class Ex06_Y extends X {
	Ex06_Y() {
		super(6);
		System.out.print(3);
	}

	Ex06_Y(int y) {
		this();
		System.out.println(4);
	}

	public static void main(String[] args) {
		new Ex06_Y(5);
	}
}
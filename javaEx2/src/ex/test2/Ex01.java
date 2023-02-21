package ex.test2;

public class Ex01 {

	public static void main(String[] args) {
		
	}

}

interface Inter {
}

class A implements Inter {
}

class B extends A {
	B() {
		A[] arr = new A[10];
		boolean b1 = this instanceof Inter;
		boolean b2 = arr instanceof Object;
		System.out.println("b1 = " + b1 + ", b2 = " + b2);
	}
}
package ex.test2;

//public class Ex03 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

interface TestA {
	String toString();
}

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(new TestA() {
			public String toString() {
				return "test";
			}
		});
	}
}
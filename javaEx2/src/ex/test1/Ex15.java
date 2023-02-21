package ex.test1;

//public class Ex15 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

class A {
    protected void write() {System.out.println("a"); }
}
class B extends A {
    public void write() {System.out.println("b"); } // 오버라이드. 부모의 write 숨음
}
public class Ex15 {
    public static void main(String[] args) {
        B ob=new B(); // B생성
        ob.write();  // b 
    }
}

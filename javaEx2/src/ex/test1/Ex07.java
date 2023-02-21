package ex.test1;

public class Ex07 {

	public static void main(String[] args) {
		 Object ob=new Ex();
		 int x=((Test)ob).a;
		 System.out.println(x);
	}

}
class Test{
    int a=10;
}
class Ex extends Test {
    int b=20;
}
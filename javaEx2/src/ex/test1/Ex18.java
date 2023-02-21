package ex.test1;

//public class Ex18 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

class Ex18 {
    int a=20;
    public String toString() {
         return a+"살"; // 20살
    }
     public static void main(String[] args) {
         Object ob=new Ex18();  // up-casting
         System.out.println(ob);
     }
}
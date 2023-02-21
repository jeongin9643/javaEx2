package ex.test1;

//public class Ex14 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
class TestA {
	   private int x;
	   public void setX( int x ) { this.x = x;}
	   public int getX(){ return x; }  // x 값 리턴
	}

	class ExA{
	   private TestA y;
	   public void setY( TestA y ) { this.y =y; }
	   public TestA getY() { return y; } // y값 리턴
	}

	public class Ex14{
	   public static void main(String[] args){
		   ExA o = new ExA();
		   TestA i = new TestA();
	       int n = 10;
	       i.setX( n );  
	       o.setY( i );
	 
	       System.out.println( o.getY().getX() );
	   }
	}
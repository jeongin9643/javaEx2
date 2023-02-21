package ch06.unit4;

class Target{
    private int i = 0;
    public int addOne(){
       return ++i;
    }
}

public class Client {
   public static void main(String[] args){
       System.out.println(new Target().addOne());
   }
}

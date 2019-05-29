import java.util.Scanner;
class Main{
  public static void function(int x,int y,int z){
       if (x>y){
           if(x>z){
             System.out.println(x);
       }
         else{
                      System.out.println(z);
         }
  }
    else{
    if(y>z){
                 System.out.println(y);
}
      else{
                   System.out.println(z);
      }
    }
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int x=in.nextInt();
            int y=in.nextInt();
      int z=in.nextInt();
function(x,y,z);
	}
}
import java.util.Scanner;
class Main{
   public static void power(int x,int y ) {

        int base = x, exponent = y;
        long result = 1;
        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println(result);
   }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int x=in.nextInt();
      int y=in.nextInt();
      power(x,y);
	}
}
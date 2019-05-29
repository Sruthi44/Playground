import java.util.Scanner;
public class Main{
  public static void gcdFun(int n1,int n2,int n3){
        int gcd = 1;
        for(int i = 1; i <= n1 && i <= n2 && i<=n3; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0 && n3% i==0)
                gcd = i;
        }

        System.out.print(gcd);
    }
	public static void main (String[] args)
	{
	    Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
            int n2=in.nextInt();
      int n3=in.nextInt();
      gcdFun(n1,n2,n3);
	}
}
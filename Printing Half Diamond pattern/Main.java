import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j,k;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n-i;++j)
        {
          System.out.print(" ");
        }
        for(k=1;k<=2*i-1;k++)
        {
            System.out.print("*");
        }
        System.out.println();
      }
	}
}
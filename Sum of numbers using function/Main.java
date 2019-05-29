import java.util.Scanner;
class Main{
  public static int addNumber(int n)
  {
   int sum=0;
    for(int i=1;i<=n;i++)
    {
      sum=sum+i;
    }
    return(sum);
  }
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int r;
      r=addNumber(n);
      System.out.print(r);
	}
}
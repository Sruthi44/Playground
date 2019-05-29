import java.util.Scanner;
class Main
{
  public static int squareNumber(int n)
  {
    int s=n*n;
    return(s);
  }
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int r=squareNumber(n);
      System.out.print(r);
	} 
}
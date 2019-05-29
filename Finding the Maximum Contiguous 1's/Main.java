import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[ ]=new int[n];
      int i,sum=0;
      for(i=0;i<n;i++)
      {
        a[i] = in.nextInt();
      }
      for(i=0;i<n;i++)
      {
        if(a[i]==0)
        {
          break;
        }
        else
        {
          sum=sum+a[i];
        }
      }
      System.out.print(sum);
    }
}
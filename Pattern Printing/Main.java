import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int r=in.nextInt();
      int c=in.nextInt();
      for (int i = r; i > 0; i--)
     {
    for (int j = c; j > i; j--)
        System.out.print(j);
 
    for (int j = i; j > 0; j--)
        System.out.print(i);
 
    System.out.println();
     }
    }
}

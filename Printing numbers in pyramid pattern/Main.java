import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt(); 
        int c = 1; 
        for (int i = 1; i <= n; i++) 
        {
           for (int j = n; j > i; j--) 
             {
                System.out.print(" ");  
            } 
            for (int k = 1; k <= i; k++) 
            {
                System.out.print(c+" "); 
                c++;
            } 
            System.out.println();
        }
    }    
}
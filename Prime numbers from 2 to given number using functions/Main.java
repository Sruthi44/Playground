import java.util.Scanner;
class Main{
   public static boolean checkPrimeNumber(int num) {
        boolean flag = true;
        for(int i = 2; i <= num/2; ++i) {
            if(num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int low = 2;
      int high = in.nextInt();
        while (low < high) {
            if(checkPrimeNumber(low))
                System.out.println(low);
            ++low;
        }
	}
}
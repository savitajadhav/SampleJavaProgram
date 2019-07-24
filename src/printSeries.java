import java.util.Scanner;

/* Print below series
 (a + 2^0*b),(a+2^0*b +2^1*b),.......(a + 2^0*b + 2^1*b +.......+2^n-1*b)
 */



public class PrintSeries {

	public static void main(String[] args) {
		
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the no of series you want to print:");
       int t = scan.nextInt();
       System.out.println("Enter the value of a:");
       int a = scan.nextInt();
       System.out.println("Enter the value of b:");
       int b = scan.nextInt();
       System.out.println("Enter the value of n:");
       int n = scan.nextInt();
       for(int i=0; i<t; i++)
       {
    	   int x=1;
    	   int temp =a;
    	   for(int j=1; j<=n; j++)
    	   {
    		   temp += (x*b);
    		   System.out.print(temp + " ");
    		   x *=2;
    	   }
       }
       System.out.println();
	}

}

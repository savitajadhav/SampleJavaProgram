import java.util.Scanner;

public class FibonacciSeries {
	
	public static void printFibonacci()
	{
		int n1=0;
		int n2=1;
		int n3;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of terms:");
		int terms = s.nextInt();
		System.out.print(n1 + " "+ n2);
		for(int i=2; i<terms; i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+ n3);
		}
		
	}

	public static void main(String[] args) {

		     printFibonacci();
		}

}

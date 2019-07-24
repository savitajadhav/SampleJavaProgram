import java.util.Scanner;

public class FactorialNumber {
	
	public static void factorial()
	{
		int num;
		int fact=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = s.nextInt();
		for(int i=1; i<=num; i++ )
		{
			fact = fact*i;
		}
		System.out.println("The factorial of number is:" +fact);
	}

	public static void main(String[] args) {
         factorial();
		
	}

}

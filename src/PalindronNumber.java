import java.util.Scanner;

public class PalindronNumber {
	
	public static void isPalindrome()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = s.nextInt();
		int sum =0;
		int rem=0,t;
		t=num;
			
		while(num>0)
		{
			rem = num%10;
			sum = (sum*10) + rem;
			num = num/10;
		}
		if(t==sum)
		{
			System.out.println(t + " is Palindrome number");
		}
		else
		{
			System.out.println(t + " is not Palindrome number");
		}
	}

	public static void main(String[] args) {

		isPalindrome();
	}

}

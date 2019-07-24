import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int rem, temp, num, c=0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = s.nextInt();
		temp = num;
		while(num>0)
		{
			rem = num%10;
			num = num/10;
			c =c+(rem*rem*rem);
		}
		if(temp ==c)
		{
			System.out.println(temp + " is Armstrong Number");
		}
		else
		{
			System.out.println(temp + "is not Armstrong Number");
		}
	}

}

import java.util.Scanner;

/*
* * * *
* * *
* *
*
*/
public class Pattern6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = s.nextInt();
		for(int i=rows; i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}

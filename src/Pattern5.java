import java.util.Scanner;
/*
1 2 3  4 
1 2 3
1 2
1
*/
	

public class Pattern5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int rows = s.nextInt();
		for(int i=rows; i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

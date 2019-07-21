import java.util.Scanner;

/*1
1 2
1 2 3
1 2 3 4 */

public class Pattern4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of rows:");
		int rows = s.nextInt();
		int no=1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(no + " ");
				no++;
			}
			System.out.println();
		}
		
		
	}

}

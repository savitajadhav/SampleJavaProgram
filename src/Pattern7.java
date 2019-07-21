import java.util.Scanner;
 /*     
       *
      * *
     * * *
    * * * * 
  */

public class Pattern7 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of rows:");
		int rows = s.nextInt();
		for(int i=1; i<=rows;i++)
		{
			for(int j=rows;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}

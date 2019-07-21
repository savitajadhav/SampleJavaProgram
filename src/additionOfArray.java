
public class additionOfArray {

	public static void main(String[] args) {

		int a[][] = {{4,6,7},{8,9,2}};
		int b[][] = {{5,2,6},{7,4,9}};
		int c[][]=new int[2][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]= a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}

import java.util.Scanner;

public class PritnArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of Array elements:");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i] = scan.nextInt();
		}
		scan.close();
		//Pritn array elements
		System.out.println("The array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}

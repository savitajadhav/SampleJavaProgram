import java.util.Scanner;

public class PrtintTable {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int N = scanner.nextInt();
        
        int result=0;
        for(int i=1 ; i<=10;i++)
        {
            result =N*i;
            System.out.println(N + " x " +i + " = " + result);
        }

        scanner.close();
	}

}

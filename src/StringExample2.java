import java.util.Scanner;

/* The first line contains a single string denoting . 
The second line contains two space-separated integers denoting the respective values of  and .
sample input
Helloworld
3 7
Sample output
lowo
*/
public class StringExample2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String:");
        String S = in.next();
        System.out.println("Enter the start index:");
        int start = in.nextInt();
        System.out.println("Enter the end index:");
        int end = in.nextInt();
        String temp = S.substring(start, end);   
        System.out.println(temp);

	}

}

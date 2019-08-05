import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = scan.next();
		String reverse = "";
		for(int i= str.length()-1; i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse String is:" +reverse);
		if(str.equals(reverse))
		{
			System.out.println("Sting is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
			
	}

}

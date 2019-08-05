import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
      
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String1:");
		String s1 = scan.next();
		System.out.println("Enter the String2:");
		String s2 = scan.next();
		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");
		boolean status = true;
		if(s1.length() != s2.length()) {
			status = false;
		}else {
			char[] ArrayS1 = s1.toCharArray();
			char[] ArrayS2 = s2.toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
    	}
		if(status) {
			System.out.println(s1 + " and " + s2 + " are Anagram");
		} else {
			System.out.println(s1 + " and " + s2 + " are not Anagram");

		}
	}

}

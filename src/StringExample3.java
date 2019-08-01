import java.util.Scanner;
/* String s="welcometojava" has the following lexicographically-ordered substrings of length k=3 :
 * [wel, elc,lco,com,ome,met,eto,toj,oja,jav,ava]

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.*/

public class StringExample3 {
	
	public static String getSmallestAndLargest(String s,int k) {
		String smallest="";
		String largest="";
		for(int i=0;i<=s.length()-k;i++) {
			String subString = s.substring(i, i+k);
			System.out.println(subString);
			if(i==0) {
				smallest = subString;
			}
			if(subString.compareTo(largest)>0) {
				largest = subString;
			}else if(subString.compareTo(smallest)<0) {
				smallest = subString;
			}
		}
		return ("Smallest:" +smallest + "\n" + "Largest:" +largest);
	}

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the string:");
	  String s = scan.next();
	  System.out.println("Enter the the length of string interger value:");
	  int k = scan.nextInt();
	  System.out.println(getSmallestAndLargest(s,k));
	  

	}

}

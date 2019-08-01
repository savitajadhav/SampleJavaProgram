import java.util.Scanner;
/* String  is "hello" and  is "java".

 has a length of , and  has a length of ; the sum of their lengths is . 
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore,  is not greater than  and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java". */

public class StringExample {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter String A:");
          String A = sc.next();
    	  System.out.println("Enter String B:");
          String B = sc.next();
          int length = A.length() + B.length();
          System.out.println("Length:" +length);
          int i= A.compareTo(B);
          
          if(i>0)
          {
        	  System.out.println("Yes");
          }else {
        	  System.out.println("No");
          }
          String atemp = A.substring(0, 1).toUpperCase() + A.substring(1);
          String btemp = B.substring(0,1).toUpperCase() + B.substring(1);
          System.out.println(atemp + " " + btemp);
	}

}

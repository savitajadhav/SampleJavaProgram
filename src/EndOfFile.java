import java.util.Scanner;

/* Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
 * For each line, print the line number, followed by a single space, and then the line content received as input.
 * Sample input:
 * Hello world
I am a file
Read me until end-of-file.
  Sample output
 1 Hello world
2 I am a file
3 Read me until end-of-file. 
 */

public class EndOfFile {

	public static void main(String[] args) {
		
	   
		   Scanner scan = new Scanner(System.in);
		   String s=null;
		   int i=1;
		   while(scan.hasNext())
		   {
		       s = scan.nextLine();
	           i++;
		   } 
	           while(scan.hasNext())
	            {
	        	  
	                s = scan.nextLine();
	                System.out.println(i + " " + s);
	                i++;
	        	  
	            }
	           
	         
	}

}

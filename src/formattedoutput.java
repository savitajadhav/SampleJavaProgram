import java.util.Scanner;

/* Print the output 
================================
java          100
cpp           052
c             004
================================
 */

public class FormattedOutput {
	

	public static void main(String[] args) {
		String s11= " ";
		int s2 = 0;
		String output = "";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input:");
		for(int i=0;i<3;i++) {
			s11 = sc.next();
				s2 = sc.nextInt();
				output += (String.format("%-14s", s11) +  String.format("%03d", s2) + "\n");
		}
		//sc.reset();
        System.out.println("================================");
    	System.out.printf(output);
        System.out.println("================================");
        }

	

}




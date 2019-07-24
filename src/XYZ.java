import java.util.Scanner;

public class XYZ {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer value:");
        int i = scan.nextInt();

        // String s = "";
        System.out.println("Enter the double value:");
        Double d = scan.nextDouble();
        System.out.println("Enter the string:");
        String s = scan.nextLine();

        while (scan.hasNext()) {
            s += (scan.nextLine() + " ");
        }

        
        while (scan.next().charAt(index)) {
            s += (scan.nextLine() + " ");
        }
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuffer sb = new StringBuffer("Welcome");
     sb.append(" Home"); //Welcome Home
     sb.insert(7, " to"); //Welcome to Home
     sb.replace(11, 15, "World");
     sb.delete(7, 16);

    // sb.reverse();
     System.out.println(sb);
	}

}

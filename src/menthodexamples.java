
public class MenthodExamples {

	public static void main(String[] args) {
	/*	String result;
		result = isEven(12);
		System.out.println(result);
		result =isEven(23);
		System.out.println(result); */
		
		System.out.println(isEven(12));
		System.out.println(isEven(23));

	}
	
/*	private static void isEven(int num) {
		if(num %2 == 0)
			System.out.println(num + " is Even number");
		else
			System.out.println(num + " is odd number");
	}*/
	
	private static String isEven(int num)
	{
		String str;
		if(num %2 ==0)
		    str = num + " is Even Number";
		else
			str = num + " is Odd Number";
             
		return str;
	}

}

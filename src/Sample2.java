
public class Sample2 {

	public static void main(String[] args) {
        
		String str1 = new String("Hi Programming");
		String str2 = new String("Hi Programming");
		String str3 = str1;
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);
	}

}


public class MinimumofArray {

	public static void main(String[] args) {

		int a[] = {34,10,78,25,89};
		int min =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("The minimum of array is:" +min);
	}

}

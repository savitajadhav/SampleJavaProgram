import java.util.Scanner;

public class PrimeNumber {
	
	public static void isPrimeNumber()
	{
		int flag=0;
	  	Scanner s = new Scanner(System.in);
  	  	System.out.println("Enter the number:");
  	  	int num = s.nextInt();
  	  	if(num==0 || num==1)
  	  	{
  	  		System.out.println(num + " is not prime number" );
  	   	}
  	  	else
  	  	{
  	  		for(int i=2; i<num;i++)
  	  		{
  	  			if(num%i==0)
  	  			{
  	  				System.out.println(num + " is not prime number");
  	  				flag=1;
  	  				break;
  	  			}
  	  				
  	  		}
  	  		if (flag==0) 
  	  		{
  	  			System.out.println(num + " is prime number");
  	  		}
  	  	}    

	}
	
	public static void main(String[] args) {
		
		isPrimeNumber();
	}

}

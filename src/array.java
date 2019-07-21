import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		
		int[] firstSet = new int[5];
		firstSet[0] = 12;
		firstSet[1] = 36;
		firstSet[2] = 75;
		firstSet[3] = 62;
		firstSet[4] = 85;
		
	/*	for(int i=0; i<firstSet.length; i++)
		{
			System.out.println(firstSet[i]);
		} */
		  
        //int [] testArray = firstSet;
        //testArray[2]= 100;
		System.out.println("The Elements of firstSet Array are:");
        for(int i : firstSet)
        {
        	System.out.println(i);
        }
      
        //copy the content of firstSet into testArray
        int [] testArray = Arrays.copyOf(firstSet, firstSet.length);
        testArray[2]=100;
        System.out.println("The Elements of testArray Array are:");
        for(int i: testArray)
        {
        	System.out.println(i);
        	
        }
        
        //Addition of all elements of Array
        
        int sum=0;
        for(int i=0; i<testArray.length; i++)
        {
        	sum=sum+testArray[i];
        }
        System.out.println("The sum of all array elements is:" +sum);
        //2D Array
        System.out.println("The two dimentional array is:");
        int [][] myArray = {{23,56,78},{87,12,90},{34,22,67}};
        for(int i=0; i<myArray.length;i++)
        {
        	for(int j=0;j<myArray.length;j++)
        	{
        		System.out.print(myArray[i][j] + " ");
        	}
        	System.out.println();
        }
        //2D Array presentation using for each
        System.out.println("2D Array presentation using for each");
        int [][] myArray2 = {{23,56,78},{87,12,90},{34,22,67}};
        
        	   System.out.print(Arrays.deepToString(myArray2));
        	
        //Jagged Array
        System.out.println("The Jagged Array is:") ;
        	   int [][] sampleArray = {
        				                   {34,45,67,21},
        				                   {38,70, 34},
        				                   {44,98,24,46,86,5}
        				                  };
        	   for(int i=0; i<sampleArray.length;i++)
        	   {
        		   for(int j=0;j<sampleArray[i].length;j++)
        		   {
        			   System.out.print(sampleArray[i][j] + " ");
        		   }
        		   System.out.println();
        	   }
        	   
      	
	
	
	}
 
  
}


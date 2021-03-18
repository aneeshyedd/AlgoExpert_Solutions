package Arrays;
import java.util.*;

public class SmallestDifference {
	
	 public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo)
	 {
		    Arrays.sort(arrayOne);
		    Arrays.sort(arrayTwo);
		    
		    int i = 0, j = 0;
		    int diff = 0;
		    int prevDiff = Integer.MAX_VALUE;
		    int res[] = new int[2];
		    
		    while (i < arrayOne.length && j < arrayTwo.length)
		    {
		    	int ele1 = arrayOne[i];
		    	int ele2 = arrayTwo[j];
		    	
		    	diff = Math.abs(ele1 - ele2);
		    	
		    	if(diff == 0)
		    	{
		    		res[0] = ele1;
		    		res[1] = ele2;
		    		return res;
		    	}
		    	else
		    	{
		    		if(diff < prevDiff)
		    		{
		    			prevDiff = diff;
		    			res[0] = ele1;
			    		res[1] = ele2;
		    		}
		    		
		    		if(ele1 < ele2)
		    			i++;
		    		else
		    			j++;
		    	}
		    	
		    }
		    
		    return res;
	 }

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of array 1: ");
		int size1 = input.nextInt();
		
		System.out.println("Enter the size of array 2: ");
		int size2 = input.nextInt();
		
		int[] arr1 = new int[size1];
		System.out.println("Enter elements into the array1: ");
		for(int i = 0; i < arr1.length; i++)
			arr1[i] = input.nextInt();

		int[] arr2 = new int[size2];
		System.out.println("Enter elements into the array2: ");
		for(int i = 0; i < arr2.length; i++)
			arr2[i] = input.nextInt();
		
		int[] res = smallestDifference(arr1, arr2);
		System.out.println(res[0] + " " + res[1]);
	}
}

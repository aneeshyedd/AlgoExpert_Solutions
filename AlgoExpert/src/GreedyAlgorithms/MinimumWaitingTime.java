package GreedyAlgorithms;
import java.util.*;

public class MinimumWaitingTime {
	
	public static int minimumWaitingTime(int[] queries) 
	{
	    Arrays.sort(queries);
	    
	    int minWait = 0;
	    int queriesLeft = queries.length - 1;
	    		 
	    for(int i = 0; i < queries.length - 1; i++)
	    	 minWait += queries[i] * queriesLeft--;
	    
	    return minWait;
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int s = input.nextInt();
		
		int[] arr = new int[s];
		System.out.println("Enter the elements of array: ");
		for(int i = 0; i < arr.length; i++)
			arr[i] = input.nextInt();
		
		System.out.println(minimumWaitingTime(arr));
	}
}

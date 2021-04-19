package DynamicProgramming;

public class MaxSubsetSumNoAdjacent {
	
	public static int maxSubsetSumNoAdjacent(int[] array) 
	{
		if(array.length == 0)
			return 0;
		else if(array.length == 1)
			return array[0];
		else
		{
			int[] maxSums = new int[array.length];
	    
			maxSums[0] = array[0];
			maxSums[1] = array[0] > array[1] ? array[0] : array[1];
	    
			for(int i = 2; i < array.length; i++)
			{
				maxSums[i] = Math.max(maxSums[i - 1], maxSums[i - 2] + array[i]);
			}
			
			return maxSums[maxSums.length - 1];
		}
	}
}

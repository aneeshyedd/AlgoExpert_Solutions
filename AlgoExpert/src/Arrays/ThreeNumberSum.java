package Arrays;
import java.util.*;

public class ThreeNumberSum {

	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) 
	{
		// Write your code here.
		Arrays.sort(array);
		
		List<Integer[]> resultList = new ArrayList<>();
		
		for(int i = 0; i < array.length - 2; i++)
		{
			int leftIndex = i + 1;
			int rightIndex = array.length - 1;

			while(leftIndex < rightIndex)
			{
				int result = array[i] + array[leftIndex] + array[rightIndex];
				
				if(result == targetSum)
				{
					Integer[] res = {array[i], array[leftIndex], array[rightIndex]};
					resultList.add(res);
					leftIndex++;
					rightIndex--;
				}
				else if(result > targetSum)
					rightIndex--;
				else
					leftIndex++;
			}
		}
		
	    return resultList;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int s = input.nextInt();
		
		int[] arr = new int[s];
		System.out.println("Enter elements into array: ");
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = input.nextInt();
		
		System.out.print("Enter target sum value: ");
		int targetSum = input.nextInt();
		
		List<Integer[]> res = threeNumberSum(arr, targetSum);
		
		for(int i = 0; i < res.size(); i++)
		{
			Integer[] subRes = res.get(i);
			for(int val : subRes)
				System.out.print(val + " ");
			
			System.out.println();
		}
	}
}

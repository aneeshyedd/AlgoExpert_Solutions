package Arrays;
import java.util.*;

public class TwoNumberSum {

	public static int[] twoNumberSum(int[] array, int targetSum)
	{
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int num : array)
		{
			int diff = targetSum - num;
			if(map.containsKey(diff))
				return new int[] {num, diff};
			
			map.put(num, true);
		}
		
		return new int[0];
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
		
		int[] res = twoNumberSum(arr, targetSum);
		
		for(int num : res)
			System.out.print(num + " ");
	}
}

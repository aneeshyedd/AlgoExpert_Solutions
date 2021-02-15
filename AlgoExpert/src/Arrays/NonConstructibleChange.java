package Arrays;
import java.util.*;

public class NonConstructibleChange {
	
	public int nonConstructibleChange(int[] coins) 
	{
	    // Write your code here.		
		Arrays.sort(coins);
		if(coins.length == 0 || coins[0] != 1)
			return 1;
	
		int change = 0;
		
		for(int i = 0; i < coins.length; i++)
		{
			if(coins[i] <= change + 1)
				change += coins[i];
			else
				return change + 1;
		}
		
	    return change + 1;
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter elements into the array: ");
		for(int i = 0; i < arr.length; i++)
			arr[i] = input.nextInt();
		
		NonConstructibleChange obj = new NonConstructibleChange();
		System.out.println(obj.nonConstructibleChange(arr));
	}
}

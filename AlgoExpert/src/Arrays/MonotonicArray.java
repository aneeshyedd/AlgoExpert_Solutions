package Arrays;
import java.util.*;

public class MonotonicArray {

	public static boolean isMonotonic(int[] array) 
	{
		if(strictlyIncreasing(array))
			return true;
		else if(strictlyDecreasing(array))
			return true;
		else 
			return false;
	}
	
	public static boolean strictlyIncreasing(int[] arr)
	{
		int i = 1;
		while(i < arr.length)
		{
			if(arr[i - 1] <= arr[i])
				i++;
			else
				return false;
		}
		
		return true;
	}
	
	public static boolean strictlyDecreasing(int[] arr)
	{
		int i = 1;
		while(i < arr.length)
		{
			if(arr[i - 1] >= arr[i])
				i++;
			else
				return false;
		}
		
		return true;
	}
	
	public static boolean isMonotonic2(int[] array)
	{
		boolean strictlyIncreasing = true;
		boolean strictlyDecreasing = true;
		
		for(int i = 1; i < array.length; i++)
		{
			if(array[i - 1] < array[i])
				strictlyDecreasing = false;
			if(array[i - 1] > array[i])
				strictlyIncreasing = false;
		}
		
		return strictlyIncreasing || strictlyDecreasing;
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
		
		System.out.println(isMonotonic(arr));
		System.out.println(isMonotonic2(arr));
	}
}

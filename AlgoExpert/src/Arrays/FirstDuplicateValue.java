package Arrays;
import java.util.*;

public class FirstDuplicateValue {
	
	public static int firstDuplicateValue(int[] array) 
	{	
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int num : array)
		{
			if(list.contains(num))
				return num;
			
			list.add(num);
		}
		
	    return -1;
	}

	public static int firstDuplicateValue2(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{	
			int abs = Math.abs(array[i]);
			if(array[abs - 1] < 0)
				return abs;
			array[abs - 1] *= -1;
		}
		
		return -1;
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
		
		System.out.println(firstDuplicateValue2(arr));
	}
}

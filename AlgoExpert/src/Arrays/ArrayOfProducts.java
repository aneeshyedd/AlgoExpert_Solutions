package Arrays;
import java.util.*;

public class ArrayOfProducts {
	
	public static int[] arrayOfProducts(int[] array) 
	{
	    int totalProduct = 1;
	    
	    int countOfZeroes = findNumberOfZeroes(array);
	    
	    int[] res = new int[array.length];
	    
	    if(countOfZeroes == 1)
	    {
	    	int index = returnIndex(array);
	    	for(int i = 0; i < array.length; i++)
	    	{
	    		if(i != index)
	    		{
	    			totalProduct *= array[i];
	    			res[i] = 0;
	    		}
	    		
	    		res[index] = totalProduct;
	    	}
	    	
	    	return res;
	    		
	    }
	    
	    else if(countOfZeroes > 1)
	    	return new int[array.length];
	    
	    else
	    {
	    	for(int num : array)
	    		totalProduct *= num;
	    
	    	for(int i = 0; i < res.length; i++)
	    		res[i] = totalProduct / array[i];
	    	return res;
	    }
	}

	public static int findNumberOfZeroes(int[] arr)
	{
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == 0)
				count++;
		}
		
		return count;
	}
	
	public static int returnIndex(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == 0)
				return i;
		}
		
		return 0;
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
		
		int[] res = arrayOfProducts(arr);
		for(int num : res)
			System.out.print(num + " ");
	}
}

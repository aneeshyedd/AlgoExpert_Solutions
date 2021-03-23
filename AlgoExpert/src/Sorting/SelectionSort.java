package Sorting;
import java.util.*;

public class SelectionSort {

	public static int[] selectionSort(int[] array) 
	{
	    if(array.length == 0)
	    	return new int[] {};
	    
	    int i = 0;
	    while(i < array.length)
	    {
	    	int smallestIndex = i;
	    	for(int j = i + 1; j < array.length; j++)
	    	{
	    		if(array[smallestIndex] > array[j])
	    			smallestIndex = j;
	    	}
	    	
	    	swap(array, i, smallestIndex);
	    	i++;
	    }
	    
	    return array;
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
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
		
		int[] res = selectionSort(arr);
		for(int num : res)
			System.out.print(num + " ");
	}
}

package Sorting;
import java.util.*;

public class InsertionSort {

	public static int[] insertionSort(int[] array) 
	{
	    // Write your code here.
		if(array.length == 0)
			return new int[] {};
		else
		{
			for(int i = 1; i < array.length; i++)
			{
				int j = i;
				while(j > 0 && array[j] < array[j - 1])
				{
					swap(j, j - 1, array);
					j -= 1;
				}
			}
		}
		
		return array;
	}
	
	public static void swap(int i, int j, int[] arr)
	{
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int s = input.nextInt();
		
		System.out.println("Enter values into array: ");
		int[] arr = new int[s];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = input.nextInt();
		
		int[] sortedArray = insertionSort(arr);
		
		for(int i = 0; i < sortedArray.length; i++)
			System.out.print(sortedArray[i] + " ");
	}
}

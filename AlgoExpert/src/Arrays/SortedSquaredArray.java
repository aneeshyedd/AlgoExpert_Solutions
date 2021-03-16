package Arrays;

import java.util.Scanner;

public class SortedSquaredArray {

	public static int[] sortedSquaredArray(int[] array) 
	{
		for(int i = 0; i < array.length; i++)
			array[i] = array[i] * array[i];
		
		int[] sortedSquaredArray = new int[array.length];
		
		int i = 0;
		int j = array.length - 1;
		int k = j;
		
		while ((i <= j) && k > -1)
		{
			if(i == j)
				sortedSquaredArray[k--] = array[i];
			else if(array[i] == array[j])
			{
				sortedSquaredArray[k--] = array[j--];
				sortedSquaredArray[k--] = array[i++];
			}
			else if(array[j] > array[i])
				sortedSquaredArray[k--] = array[j--];
			else
				sortedSquaredArray[k--] = array[i++];
		}
		
	    return sortedSquaredArray;
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
		
		
		int[] res = sortedSquaredArray(arr);
		
		for(int num : res)
			System.out.print(num + " ");
	}
}

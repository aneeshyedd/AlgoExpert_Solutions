package Searching;

import java.util.*;

public class FindThreeLargestNumbers {

	public static int[] findThreeLargestNumbers(int[] array)
	{
		int[] res = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		
		for(int num: array)
			updateLargest(res, num);
		
		return res;
	}
	
	public static void updateLargest(int[] arr, int num)
	{
		if(num > arr[2])
			shiftAndUpdate(arr, num, 2);
		else if(num > arr[1])
			shiftAndUpdate(arr, num, 1);
		else if(num > arr[0])
			shiftAndUpdate(arr, num, 0);
	}
	
	public static void shiftAndUpdate(int[] arr, int num, int index)
	{
		for(int i = 0; i <= index; i++)
		{
			if(i == index)
				arr[i] = num;
			else
				arr[i] = arr[i + 1];
		}
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
		
		
		int[] res = findThreeLargestNumbers(arr);
		
		for(int num : res)
			System.out.print(num + " ");
	}
}

package Arrays;
import java.util.*;

public class LongestPeak {
	
	public static int longestPeak(int[] array) 
	{
		ArrayList<Integer> list = findPeakIndex(array);
		int prevPeak = 0;
		int maxPeakLength = 1;
		int res = 0;
		
		for(int i = 0; i < list.size(); i++)
		{
			int peakIndex = list.get(i);
			int dec = peakIndex;
			while(dec > 0 && (array[dec] > array[dec - 1]))
			{
				maxPeakLength += 1;
				dec--;
			}
			
			int inc = peakIndex;
			while(inc < array.length - 1 && (array[inc] > array[inc + 1]))
			{
				maxPeakLength += 1;
				inc++;
			}
			
			prevPeak = maxPeakLength;
			
			if(prevPeak >= res)
			{
				res = maxPeakLength;
				maxPeakLength = 1;
			}
		}
		
		return res;
	    
	}
	
	public static ArrayList<Integer> findPeakIndex(int[] arr)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i < arr.length - 1; i++)
		{
			if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
				list.add(i);
		}
		
		return list;
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
		
		System.out.println(longestPeak(arr));
	}
}

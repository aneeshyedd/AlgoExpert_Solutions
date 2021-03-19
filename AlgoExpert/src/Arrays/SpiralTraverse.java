package Arrays;
import java.util.*;
public class SpiralTraverse {

	public static List<Integer> spiralTraverse(int[][] array) 
	{
		if(array.length == 0)
			return new ArrayList<Integer>();
		
	    int startingRow = 0;
	    int endingRow = array.length - 1;
	    int startingCol = 0;
	    int endingCol = array[0].length - 1;
	    
	    List<Integer> list = new ArrayList<Integer>();
	    
	    while(startingRow <= endingRow && startingCol <= endingCol)
	    {
	    	for(int col = startingCol; col <= endingCol; col++)
	    		list.add(array[startingRow][col]);
	    	
	    	for(int row = startingRow + 1; row <= endingRow; row++)
	    		list.add(array[row][endingCol]);
	    	
	    	for(int col = endingCol - 1; col >= startingCol; col --)
	    	{
	    		if(startingRow == endingRow) 
	    			break;
	    		list.add(array[endingRow][col]);
	    	}
	    	
	    	for(int row = endingRow - 1; row > startingRow; row--)
	    	{
	    		if(startingCol == endingCol) 
	    			break;	
	    		list.add(array[row][startingCol]);
	    	}
	    		
	    	
	    	startingRow++;
		    endingRow--;
		    startingCol++;
		    endingCol--;
	    }
	    
	    return list;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the n*m dimesnion of 2D array: ");
		int size = input.nextInt();
		
		int[][] arr = new int[size][size];
		System.out.println("Enter elements into the array: ");
		for(int i = 0; i <= arr.length - 1; i++)
			for(int j = 0; j <= arr[0].length - 1; j++)
			arr[i][j] = input.nextInt();
		
		List<Integer> res = spiralTraverse(arr);
		
		for(int num : res)
			System.out.print(num + " ");
		
	}
}

package Searching;
import java.util.*;

public class SearchInSortedMatrix {

	public static int[] searchInSortedMatrix(int[][] matrix, int target)
	{
		int row = 0;
		int col = matrix[0].length - 1;
		
		while(row < matrix.length && col >= 0)
		{
			if(matrix[row][col] > target)
				col--;
			else if(matrix[row][col] < target)
				row++;
			else
				return new int[] {row, col};
		}
	    return new int[] {-1, -1};
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the target: ");
	    int target = input.nextInt();
		
		System.out.println("Enter The Number Of Matrix Rows");
		int row = input.nextInt();

		System.out.println("Enter The Number Of Matrix Columns");
		int col = input.nextInt();
		
		//defining 2D array to hold matrix data
		int[][] matrix = new int[row][col];
		
		System.out.println("Enter Matrix Data");

	      for (int i = 0; i < row; i++)
	      {
	          for (int j = 0; j < matrix[0].length; j++)
	          {
	              matrix[i][j] = input.nextInt();
	          }
	      }
	      
	     int[] res = searchInSortedMatrix(matrix, target);
	      
	     System.out.println(res[0] + ", " + res[1]);
	}
}

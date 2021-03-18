package Arrays;
import java.util.*;

public class MoveElementToEnd {

	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove)
	{
	    int i = 0;
	    int j = array.size() - 1;
	    
	    while(i < j)
	    {
	    	if(array.get(j) == toMove)
	    		j--;
	    	if(array.get(i) != toMove)
	    		i++;
	    	if(array.get(i) == toMove && array.get(j) != toMove)
	    	{
	    		swap(array, i, j);
	    		i++;
	    		j--;
	    	}
	    }
	    
	    return array;
	}
	
	public static void swap(List<Integer> array, int index1, int index2)
	{
		int num1 = array.get(index1);
		int num2 = array.get(index2); 
		
		array.set(index1, num2);
		array.set(index2, num1);
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		List<Integer> array = new ArrayList<Integer>(8);
		System.out.println("Enter elements into the array: ");
		for(int i = 0; i < 8; i++)
		{
			array.add(input.nextInt());
		}
		
		System.out.println("Enter ele to move: ");
		int num = input.nextInt();
		
		List<Integer> res = moveElementToEnd(array, num);
		for(int nums : res)
			System.out.print(nums + " ");
	}
}

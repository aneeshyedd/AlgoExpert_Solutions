package GreedyAlgorithms;
import java.util.*;

public class ClassPhotos {

	public static boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) 
	{
		boolean redIncreasing = true;
		boolean blueIncreasing = true;
		
		Collections.sort(redShirtHeights, Collections.reverseOrder());
		Collections.sort(blueShirtHeights, Collections.reverseOrder());
		
		for(int i = 0, j = 0; i < redShirtHeights.size(); i++, j++)
		{
			if(redShirtHeights.get(i) >= blueShirtHeights.get(j))
				blueIncreasing = false;
			if(blueShirtHeights.get(j) >= redShirtHeights.get(i))
				redIncreasing = false;
		}
		
		return redIncreasing || blueIncreasing;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
	    System.out.print("Enter red shirt heights: ");

	    for(int i= 0 ; i < 5 ; i++){
	        list1.add(input.nextInt());
	    }
	    
	    ArrayList<Integer> list2 = new ArrayList<Integer>();
	    System.out.print("Enter blue shirt heights: ");
	    
	    for(int i= 0 ; i < 5 ; i++){
	        list2.add(input.nextInt());
	    }
		
		System.out.println(classPhotos(list1, list2));
	}
}

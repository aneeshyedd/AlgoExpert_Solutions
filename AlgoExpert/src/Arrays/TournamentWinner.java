package Arrays;
import java.util.*;

public class TournamentWinner {
	
	public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) 
	{
		    HashMap<String, Integer> map = new HashMap<>();
		    int resultcount = 0;
		    int j = 0;
		    String winner = "";
		    int oldCount = 0;
		    
		    for(ArrayList<String> list : competitions)
		    {
		    	int intialWinner = results.get(j);
		    	if(intialWinner == 0)
		    		intialWinner += 1;
		    	else
		    		intialWinner = 0;
		    	
		    	if(map.containsKey(list.get(intialWinner)))
		    	{
		    		map.put(list.get(intialWinner), map.getOrDefault(list.get(intialWinner), 0) + 3);
		    	}
		    	else
		    		map.put(list.get(intialWinner), resultcount + 3);	
		    	
		    	j++;
		    }
		    
		    for(Map.Entry<String, Integer> entry : map.entrySet())
		    {
		    	int newCount = entry.getValue();
		    	
		    	if(newCount > oldCount)
		    		winner = entry.getKey();
		    	
		    	oldCount = newCount;
		    }
		    
		    return winner;
	}

	public static void main(String[] args)
	{
		//The below test case is a sample test case, the above code passes for all test cases in AlgoExpert environment
		
		ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
		ArrayList<Integer> results = new ArrayList<>();
		
		results.add(0);
		results.add(0);
		results.add(1);
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("HTML");
		list1.add("C#");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("C#");
		list2.add("Python");
		
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("Python");
		list3.add("HTML");
		
		competitions.add(list1);
		competitions.add(list2);
		competitions.add(list3);
		
		TournamentWinner obj = new TournamentWinner();
		System.out.println(obj.tournamentWinner(competitions, results));
	}
}

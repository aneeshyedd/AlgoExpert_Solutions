package String;
import java.util.*;

public class GenerateDocument {

	public static boolean generateDocument(String characters, String document) 
	{
	    HashMap<Character, Integer> map = new HashMap<>();
	    
	    for(int i = 0; i < characters.length(); i++)
	    {
	    	char ch = characters.charAt(i);
	    	map.put(ch, map.getOrDefault(ch, 0) + 1);
	    }
		
	    for(int i = 0; i < document.length(); i++)
	    {
	    	char ch = document.charAt(i);
	    	
	    	if(!map.containsKey(ch) || map.get(ch) == 0)
	    		return false;
	    	
	    	map.put(ch, map.get(ch) - 1);
	    }
	    
	    return true;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the characters: ");
		String characters = input.nextLine();
				
		
		System.out.println("Enter the document");
		String document = input.next();
		
		System.out.println(generateDocument(characters, document));
	}
}

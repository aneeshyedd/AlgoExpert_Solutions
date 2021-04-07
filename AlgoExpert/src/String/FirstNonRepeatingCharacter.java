package String;
import java.util.*;

public class FirstNonRepeatingCharacter {

	public static int firstNonRepeatingCharacter(String string) 
	{
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < string.length(); i++)
		{
			map.put(string.charAt(i), map.getOrDefault(string.charAt(i), 0) + 1);
		}
		
		for(int i = 0; i < string.length(); i++)
		{
			if(map.get(string.charAt(i)) == 1)
				return i;
		}
		
		return -1;
	}
}

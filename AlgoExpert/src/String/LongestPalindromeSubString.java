package String;

public class LongestPalindromeSubString {
	
	public static String longestPalindromicSubstring(String str) 
	{
		String res = "";
		for(int i = 0; i < str.length(); i++)
		{
			for(int j = i; j < str.length(); j++)
		    {
		    	String longestPalindome = str.substring(i, j + 1);
		    	if(isPalindrome(longestPalindome) && longestPalindome.length() > res.length())
		    		res = longestPalindome;
		    }
		}
		
		return res;
	}

	private static boolean isPalindrome(String longestPalindome) {
		int i = 0, j = longestPalindome.length() -  1;
		while(i <= j)
		{
			if(longestPalindome.charAt(i) != longestPalindome.charAt(j))
				return false;
			
			i++;
			j--;
		}
		
		
		return true;
	}
	
}

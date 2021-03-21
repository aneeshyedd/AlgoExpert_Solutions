package String;
import java.util.*;

public class PalindromeCheck {

	public static boolean isPalindrome(String str) {
	    // Write your code here.
			int i = 0;
			int j = str.length() - 1;
			
			while(i <= j)
			{
					if(str.charAt(i) != str.charAt(j))
							return false;
					else
					{
						  i++;
							j--;
					}
			}
			
	    return true;
	  }
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String str = input.next();
		
		System.out.println(isPalindrome(str));
	}
}

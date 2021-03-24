package Stacks;
import java.util.*;

public class BalancedBrackets {

	public static boolean balancedBrackets(String str) 
	{
		Stack<Character> s = new Stack<Character>();
		
		int i = 0;
		while(i < str.length())
		{
			char ch = str.charAt(i);
			
			if(ch == '(' || ch == '[' || ch == '{')
				s.push(ch);
			else if(!Character.isLetter(ch))
			{		
				if(i != str.length() - 1 && s.isEmpty())
					return false;
				else if(ch == ')' && s.pop() != '(')
					return false;
				else if(ch == ']' && s.pop() != '[')
					return false;
				else if(ch == '}' && s.pop() != '{')
					return false;
			}
			
			i++;
		}
		
		if(s.isEmpty())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String str = input.next();
		
		System.out.println(balancedBrackets(str));
	}
}

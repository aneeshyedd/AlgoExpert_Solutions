package String;
import java.util.*;

public class RunLengthEncoding {
	
	public static String runLengthEncoding(String string) 
	{
		int count = 1;
		String res = "";
		int i = 1;
		int j = i - 1;
		
		while(i <= string.length() && j < string.length())
		{ 	
			while(i < string.length() && (string.charAt(i) == string.charAt(j)))
			{
				count++;
				i++;
			}
			
			int rem = count % 9;
			int quo = count / 9;
			
			while(quo >= 1)
			{
				res += String.valueOf(9) + String.valueOf(string.charAt(j));
				quo--;
			}
			
			if(rem != 0)
				res += String.valueOf(rem) + String.valueOf(string.charAt(j));
			
			j = i;
			i = j + 1;
			count = 1;			
		}
		
		return res;
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String str = input.next();
		
		System.out.println(runLengthEncoding(str));
	}
}

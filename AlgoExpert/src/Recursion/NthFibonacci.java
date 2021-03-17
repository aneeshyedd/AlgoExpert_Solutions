package Recursion;
import java.util.*;

public class NthFibonacci {

	public static int getNthFib(int n) 
	{
		if(n == 2)
			return 1;
		else if(n == 1)
			return 0;
		else
			return getNthFib(n - 1) + getNthFib(n - 2);
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		
		System.out.println(getNthFib(num));
	}
}

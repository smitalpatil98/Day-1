//Write a Program to find Palindrome Number using for Loop 
//eg. Input n=121 then after reverse output is same 121 then it is a palindrome.
//eg. Input n=321 then after reverse output is not same it's 123 then it is not a palindrome number.
package Day_1_Codes;

import java.util.Scanner;

public class Palindrome_forloop 
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number");
	   int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		for(;n!=0;n=n/10)
		{
			int d = n%10;
			rev = rev*10+d;	
		}
		//System.out.println(rev);
		if(rev == temp)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}

//Write a Program to Check Vowel or Consonant
package Day_1_Codes;

import java.util.Scanner;

public class Vowel_Consonant_Switchcase 
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character : ");
		char ch = sc.next().charAt(0); //charAt(0)returns the character at the first position (index 0) of the string.
		// Convert the character to lowercase for case-insensitive comparison
		ch = Character.toLowerCase(ch);
		switch(ch) 
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':	
			System.out.println(ch + " is a vowel");
			break;
		default:
			if ((ch >= 'a' && ch <= 'z')) 
			{
				System.out.println(ch + " is a consonant.");
			} 
			else 
			{
				System.out.println(ch + " is not an alphabet character.");
			}
		}
	}
}

//Using If else statement 
//Read a single Digit Number and write in word
package Day_1_Codes;

import java.util.Scanner;
public class number_to_word 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the single digit number you want to convert into word :-");
		int digit = sc.nextInt();
		{
			if (digit == 0) {
				System.out.println("zero");
			} else if (digit == 1) {
				System.out.println("one");
			} else if (digit == 2) {
				System.out.println("two");
			} else if (digit == 3) {
				System.out.println("three");
			} else if (digit == 4) {
				System.out.println("four");
			} else if (digit == 5) {
				System.out.println("five");
			} else if (digit == 6) {
				System.out.println("six");
			} else if (digit == 7) {
				System.out.println("seven");
			} else if (digit == 8) {
				System.out.println("eight");
			} else if (digit == 9) {
				System.out.println("nine");
			} else {
				System.out.println("Invalid input"); // Handle invalid input
			}
		}
	}
}

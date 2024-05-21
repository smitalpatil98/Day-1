//Using If else statement 
//Read a Number 1,10,100,1000 and display unit, ten hundred 

package Day_1_Codes;

import java.util.Scanner;

public class Unit_Tens_Hundred {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number :- ");
		int number = sc.nextInt();
		if(number<1 || number > 999)
		{
			System.out.println("Invalid number please enter a valid number");
		}
		else
		{
			int hundred = (number%1000)/100 ;
			int tens = (number%100)/10;
			int unit = number%10;

			System.out.println(hundred);
			System.out.println(tens);
			System.out.println(unit);
		}
	}
}

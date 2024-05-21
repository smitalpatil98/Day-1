//Operator programs 
//work of command line argument :- to customise functionality of main method
//:- they are always of string datatype
//:- 
//Write a program SpringSeason.java that takes two int values m and d from the command line 
//and prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.
package Day_1_Codes;
import java.util.Scanner;
public class SpringSeason 
{
	public static void main(String[] args) 
	{
		//Check if exactly 2 command-linearguments are provided
		if(args.length !=2)
		{
			System.out.println("usage:java SpringSeason <month> <days>");
			return;
		}
		//parse command-line arguments to integer
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		//Check if the date falls within the spring season 
		boolean isSpring = isSpringSeason(month,day);
		//Print the result
		System.out.println(isSpring);
	}
	//Method to check if the date falls within the spring season 

	private static boolean isSpringSeason(int month, int day)
	{	
		if(month < 3 || month>60) {
			return false; // Not within March to June
		}
		if (month == 3 && (day < 20 || day > 31)) {
			return false; // Not within March 20 to March 31
		}
		if (month == 6 && (day < 1 || day > 20)) {
			return false; // Not within June 1 to June 20
		}
		return true; // Within the spring season
	}
}
//Status :- Pending 


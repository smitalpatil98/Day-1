package Day_1_Codes;

import java.util.Scanner;

public class Sample 
{
	public static void main(String[] args)
	{
		// Check if exactly 2 command-line arguments are provided
		if (args.length != 2) {
			System.out.println("Usage: java SpringSeason <month> <day>");
			return;
		}

		// Parse command-line arguments to integers
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);

		// Check if the date falls within the spring season
		boolean isSpring = isSpringSeason(month, day);

		// Print the result
		System.out.println(isSpring);
	}

	// Method to check if the date falls within the spring season
	public static boolean isSpringSeason(int month, int day) {
		if (month < 3 || month > 6) {
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



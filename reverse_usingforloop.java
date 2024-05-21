//Write a Program to reverse the integer number eg. Input n=231 reverse is 132

package Day_1_Codes;
public class reverse_usingforloop 
{
	public static void main(String[] args) {

		int number = 987;
		int reversedNumber = 0;
		{    
			//for(i=0;i<=10;i++)
			//for(initialization;condition;updation)
			for (; number != 0; number /= 10) 
			{
				int digit = number % 10;
				reversedNumber = reversedNumber * 10 + digit;
			}
			System.out.println(reversedNumber);
		}
	}
}

//Write a Program to reverse the integer number eg. Input n=231 reverse is 132
package Day_1_Codes;
public class Reverse_integer_number 
{
	public static void main(String[] args) 
	{
		int n = 231;
		int rev = 0;
		while(n!=0)
		{
			int d = n%10; // 1 3 2 
			rev = rev*10+d; //1 3 2 
			n = n/10;// 31 1 0 
		}
		System.out.println(rev);
	}
}

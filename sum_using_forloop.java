//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
package Day_1_Codes;

public class sum_using_forloop 
{
	public static void main(String[] args) {
	int n = 5;
	int sum = 0;
	for(int i = 0;i<=n;i++)
	{
	 sum = sum+i;	
	}
	System.out.println(sum);
	}

}


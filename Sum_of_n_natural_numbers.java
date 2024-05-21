//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
package Day_1_Codes;

public class Sum_of_n_natural_numbers {

	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		int sum=0;
		while(i<=n)
		{
			sum = sum+i;
			i++;
		}
		System.out.println(sum);
	}

}

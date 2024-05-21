//Operator Programs
//1. Enter two numbers and do the following arithmetic Operations find max and min.
//i) a+b*c ii) c+a/b
//iii) a%b+c iV) a*b+c
package Day_1_Codes;

import java.util.Scanner;

public class Arithmetic_Operations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a = sc.nextInt();
		
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter the value of b");
		double b = scc.nextInt();
		
		Scanner sccc = new Scanner(System.in);
		System.out.println("Enter the value of c");
		double c = sccc.nextInt();
		
		double x = a+b*c ;
		System.out.println(x);
		
		double y = c+a/b;
		System.out.println(y);
		
		double z =  a%b+c;
		System.out.println(z);
		
		double w =  a*b+c;
		System.out.println(w);
		
		// Find maximum and minimum
        double max = Math.max(Math.max(x, y), Math.max(z, w));
        System.out.println("max value is"+ max);
        double min = Math.min(Math.min(x, y), Math.min(z, w));
        System.out.println("min valude is "+min);

	}

}

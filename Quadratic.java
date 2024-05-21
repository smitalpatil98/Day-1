package Day_1_Codes;
import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter coefficients a, b, and c
		System.out.println("Enter the coefficients a, b, and c of the quadratic equation:");
		System.out.print("a: ");
		double a = scanner.nextDouble();
		System.out.print("b: ");
		double b = scanner.nextDouble();
		System.out.print("c: ");
		double c = scanner.nextDouble();

		// Calculate the discriminant
		double delta = b * b - 4 * a * c;

		// Calculate roots
		if (delta > 0) {
			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			double root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Root 1: " + root1);
			System.out.println("Root 2: " + root2);
		} else if (delta == 0) {
			double root = -b / (2 * a);
			System.out.println("Root: " + root);
		} else {
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-delta) / (2 * a);
			System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
			System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
		}

		scanner.close();
	}
}

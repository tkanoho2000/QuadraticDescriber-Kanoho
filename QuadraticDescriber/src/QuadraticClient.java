import java.util.Scanner;

/*
 * Conatains a main method and handle interactions w users
 * version 1.0
 * By Tyler Kanoho
 */

public class QuadraticClient {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String welcome1 = "Welcome to the quadratic scanner";
		String welcome2 = "Provides values for coefficients a, b, and c";
		String author = "By Tyler Kanoho";
		boolean stop = false;
		while (stop == false) {
			System.out.println(welcome1);
			System.out.println(welcome2);
			System.out.println(author); 
			System.out.print("a: ");
			double a = input.nextDouble();
			System.out.print("b: ");
			double b = input.nextDouble();
			System.out.print("c: ");
			double c = input.nextDouble();
			System.out.println(Quadratic.quadrDescriber(a, b, c));
			System.out.print("Continue?(y/n): ");
			String decision =  input.next();
			if ((decision.equals("n"))) {
				System.out.println("You are complete. Thank you!");
				stop = true;
			}
		}
		
	}
}
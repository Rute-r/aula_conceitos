package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;

		do {

			try {
				System.out.println("Digite o dividendo: ");
				dividendo = scanner.nextInt();

				System.out.println("Digite o divisor: ");
				divisor = scanner.nextInt();

				divide(dividendo, divisor);
			} catch (InputMismatchException e) {
				System.err.println("\nExceção: " + e);
				scanner.nextLine();
				System.out.println("\n Digite valores inteiros! ");
			} catch(ArithmeticException e) {
				System.err.println("\nExceção: " + e);
				scanner.nextLine();
				System.out.println("\nUse numros difrente de zero! ");
			} finally {
				System.out.println("Finally sempre aparece!");
			}

		} while (loop);

	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));

	}

}

package by.training.javabasics27.mainTask_2;

import java.util.Scanner;

//Определить класс «Дробь» в виде пары m/n. Объявить массив из k дробей, ввести/вывести значения для массива дробей.

public class L6T1_Fraction {

	public static void main(String[] args) {

		fractionArray();
	}

	public static void fractionArray() {

		int k = 0;
		int m;
		int n = 0;

		while (k <= 0) {
			k = readInput("Enter the number of fractions: ");
			if (k < 0) {
				System.out.println("Please enter positive integer!");
			}
		}

		String[] fractions = new String[k];

		for (int i = 0; i < k; i++) {
			m = readInput("Enter the numerator for the " + (i + 1) + " fraction: ");
			while (n <= 0) {
				n = readInput("Enter the denominator for the " + (i + 1) + " fraction: ");
				if (n <= 0) {
					System.out.println("Please enter positive integer!");
				}
			}
			fractions[i] = m + "/" + n;
			n = 0;
		}
		System.out.println("\nYour fractions are:");

		for (int i = 0; i < k; i++) {
			System.out.println(fractions[i]);
		}

	}

	public static int readInput(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = 0;

		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}

		x = sc.nextInt();
		return x;
	}
}

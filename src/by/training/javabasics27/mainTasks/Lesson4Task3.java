package by.training.javabasics27.mainTasks;

import java.util.Random;
import java.util.Scanner;

// Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей

public class Lesson4Task3 {

	public static void main(String[] args) {

		int n = (int) readInput("Enter number of elements in the sequence: ");
		double[] seq = randArray(n);

		System.out.println("\nGenerated sequence:");
		for (int i = 0; i < n; i++) {
			System.out.println("[" + i + "] = " + seq[i]);
		}

		boolean isAsc = false;

		for (int j = 0; j < n-1; j++) {

			if (seq[j] > seq[j + 1]) {
				System.out.println("\nThis sequence is not ascending.");
				isAsc = false;
				break;
			} else {
				isAsc = true;
			}

		}
		
		if (isAsc == true) {
			System.out.println("\nThis sequence is ascending.");
		}

	}

	public static double[] randArray(int n) {

		Random rand = new Random();
		double[] mas = new double[n];
		for (int i = 0; i < n; i++) {
			mas[i] = rand.nextDouble()*1000;
		}
		return mas;
	}

	public static double readInput(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double x = 0;

		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print(message);
		}

		x = sc.nextDouble();
		return x;
	}

}

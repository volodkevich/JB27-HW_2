package by.training.javabasics27.mainTasks;

import java.util.Random;
import java.util.Scanner;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К

public class Lesson4Task2 {

	public static void main(String[] args) {

		int n = (int) readInput("Enter array length: ");
		int k = (int) readInput("Enter K: ");
		int[] A = randArray(n);

		System.out.println("\nYour array:");
		for (int i = 0; i < n; i++) {
			System.out.println("A[" + i + "] = " + A[i]);
		}
		System.out.println("");
		sumOfMultiples(A, k);

	}

	public static void sumOfMultiples(int[] A, int k) {

		int sum = 0;

		for (int i = 0; i < A.length; i++) {

			if (A[i] % k == 0) {
				sum = sum + A[i];
			}

		}

		System.out.println("Sum of elements that are multiples of " + k + " equeals " + sum);
	}

	public static int[] randArray(int n) {

		Random rand = new Random();
		int[] mas = new int[n];
		for (int i = 0; i < n; i++) {
			mas[i] = rand.nextInt(100);
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

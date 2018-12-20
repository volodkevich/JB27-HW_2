package by.training.javabasics27.mainTasks;

import java.util.Scanner;

public class Lesson3Tasks {

	public static void main(String[] args) {

// #2 Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, 
// первый столбец которой – значения аргумента, второй - соответствующие значения функции		

		double a = readInput("a");
		double b = readInput("b");
		double h = readInput("h");

		function(a, b, h);

		System.out.println("");

// #3 Вычислить значение функции

		double x = readInput("x");
		funcCond(x);
	}

// Method for #2
	public static void function(double a, double b, double h) {

		double fx = 0;
		System.out.println("\nResults:\n  x | F(x) \n");

		for (double x = a; x <= b; x = x + h) {

			fx = 2 * Math.tan(x / 2) + 1;

			System.out.println(x + " |  " + Math.round(fx * 100.0) / 100.0);
		}

	}

// Method for #3
	public static void funcCond(double x) {

		double fX = 0;

		if (x <= -3) {
			fX = 9;
			System.out.println("The result of calculation: F(x) = " + fX);
		} else if (x > 3) {
			fX = 1 / (x * x + 1);
			System.out.println("The result of calculation: F(x) = " + Math.round(fX * 10000.0) / 10000.0);
		} else {
			System.out.println("The value of X is not in [-3; 3] range");
		}

	}

	public static double readInput(String let) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double x = 0;

		System.out.print("Введите значение " + let + ": ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Введите значение " + let + ": ");
		}

		x = sc.nextDouble();
		return x;
	}

}

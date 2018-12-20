package by.training.javabasics27.mainTasks;

import java.util.Scanner;

//Примените при решении задач из листингов l3-5, l3-6, l3-7, l3-8 процедурную 
//декомпозицию – оформите решения как совокупность взаимоствязанных методов,
//каждый из которых выполняет одно действие.

public class Lesson3Task1L38Line01 {
	public static void main(String[] args) {

		int number = readInput();

		findEvenDigit(number);
	}

	public static void findEvenDigit(int number) {

		int digit = 0;
		while (number != 0) {
			digit = number % 10;
			number = number / 10;
			if (digit % 2 == 0) {
				System.out.println("В числе есть четная цифра.");
				return;
			}
		}
		System.out.println("В числе нет четных цифр.");
	}

	public static int readInput() {
		System.out.print("Введите число: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = 0;
		if (sc.hasNextInt()) {
			x = sc.nextInt();
		}
		return x;
	}
}

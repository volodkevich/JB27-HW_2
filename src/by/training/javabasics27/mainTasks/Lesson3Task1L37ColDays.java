package by.training.javabasics27.mainTasks;

import java.util.Scanner;

//Примените при решении задач из листингов l3-5, l3-6, l3-7, l3-8 процедурную 
//декомпозицию – оформите решения как совокупность взаимоствязанных методов,
//каждый из которых выполняет одно действие.

public class Lesson3Task1L37ColDays {

	public static void main(String[] args) {

		System.out.print("Введите год: ");
		int year = readInput();
		System.out.print("Введите номер месяца: ");
		int month = readInput();

		findColDays(year, month);
	}

	public static void findColDays(int year, int month) {
		int col_day = 0;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			col_day = 31;
			break;
		case 2:
			if (year % 4 == 0) {
				col_day = 29;
			} else {
				col_day = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			col_day = 30;
			break;
		}
		System.out.println("Количество дней равно - " + col_day);
	}

	public static int readInput() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = 0;
		if (sc.hasNextInt()) {
			x = sc.nextInt();
		}
		return x;
	}
}

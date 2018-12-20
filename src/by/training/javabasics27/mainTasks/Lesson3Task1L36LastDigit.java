package by.training.javabasics27.mainTasks;

import java.util.Scanner;

//Примените при решении задач из листингов l3-5, l3-6, l3-7, l3-8 процедурную 
//декомпозицию – оформите решения как совокупность взаимоствязанных методов,
//каждый из которых выполняет одно действие.

public class Lesson3Task1L36LastDigit {

	public static void main(String[] args) {


		int number = readInput();
		int poslZifra = number % 10;

		int poslZifraKv = LastDigitSquare(poslZifra);
		
		System.out.println("Квадрат последней цифры числа " + number + " равняется " + poslZifraKv);
	}

	public static int LastDigitSquare(int poslZifra) {

		int poslZifraKv = 0;
		
		switch (poslZifra) {
		case 0:
			poslZifraKv = 0;
			break;
		case 1:
			poslZifraKv = 1;
			break;
		case 2:
			poslZifraKv = 4;
			break;
		case 3:
			poslZifraKv = 9;
			break;
		case 4:
			poslZifraKv = 6;
			break;
		case 5:
			poslZifraKv = 5;
			break;
		case 6:
			poslZifraKv = 6;
			break;
		case 7:
			poslZifraKv = 9;
			break;
		case 8:
			poslZifraKv = 4;
			break;
		case 9:
			poslZifraKv = 1;
			break;
		default:
			System.out.println("Что-то не то с программой.");

		}
		return poslZifraKv;
	}

	public static int readInput() {

		int number = 0;
		
		System.out.print("Введите число: ");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			number = sc.nextInt();
		}
		return number;
	}
}

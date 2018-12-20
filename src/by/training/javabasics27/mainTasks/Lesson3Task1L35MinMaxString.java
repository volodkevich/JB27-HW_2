package by.training.javabasics27.mainTasks;

import java.util.Scanner;

//Примените при решении задач из листингов l3-5, l3-6, l3-7, l3-8 процедурную 
//декомпозицию – оформите решения как совокупность взаимоствязанных методов,
//каждый из которых выполняет одно действие.

public class Lesson3Task1L35MinMaxString {

	public static void main(String[] args) {

		int n = 3;

		findMinMaxString(n);
		
	}

	public static void findMinMaxString(int n) {
		String max = "", min = "", str = "";

		for (int i = 0; i < n; i++) {
			str = readInput();
			if (i == 0) {
				min = str;
			}
			if (str.length() > max.length()) {
				max = str;
			} else if (str.length() < min.length()) {
				min = str;
			}
		}

		System.out.println("max string = " + max + " length=" + max.length());
		System.out.println("min string = " + min + " length=" + min.length());
	}

	public static String readInput() {

		System.out.print("> ");
		String str = null;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		if (sc.hasNextLine()) {
			str = sc.nextLine();
		}
		return str;
	}
}
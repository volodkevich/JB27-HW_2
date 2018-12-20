package by.training.javabasics27.mainTasks;

import java.util.Scanner;

// Прочитайте код листинга l2-3.

public class Lesson2Task1 { // объявляем класс

	public static void main(String[] args) { // объявляем метод main, с которого начинается выполнение программы
		
		int n = 3; // объявляем переменную, определяющую кол-во строк для чтения
		Scanner sc = new Scanner(System.in); // обращаемся к классу Scanner для чтения ввода в консоль
		
		String max = "", min = "", str = ""; // объявляем переменные для хранения введенных строк
		
		for (int i = 0; i < n; i++) { // начинаем цикл, в котором будут вводиться и анализироваться строки
			System.out.print("> "); // приглашение ко вводу с клавиатуры
			if (sc.hasNextLine()) { // проверка наличия какой-либо величины в потоке ввода
				str = sc.nextLine(); // присваиваем введенное значение переменной str
				if (i == 0) { 
					min = str; // присваиваем первое введенное значение переменной min, чтобы далее сравнение шло не с нулем
				}
				if (str.length() > max.length()) { // определяем максимальную по длине строку
					max = str; // и присваиваем ее переменной max
				} else if (str.length() < min.length()) { //определяем минимальную по длине строку
					min = str; // и присваиваем ее переменной min
				}
			}
		}
		System.out.println("max string = " + max + " length=" + max.length()); // выводим в консоль сообщение с максимальной по длине строкой и ее длиной 
		System.out.println("min string = " + min + " length=" + min.length()); // выводим в консоль сообщение с минимальной по длине строкой и ее длиной 
	}
}

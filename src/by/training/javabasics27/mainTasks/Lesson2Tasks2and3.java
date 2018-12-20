package by.training.javabasics27.mainTasks;

import java.util.Scanner;

public class Lesson2Tasks2and3 {
	
	public static void main(String[] args) {

// #2 Вычислить значение выражения по формуле (все переменные принимают lействительные значения).
		
		double a = readInput ("a");
		double b = readInput ("b");
		double c = readInput ("c");
		
		double res = 0;
		
		res = (b + Math.sqrt(b*b + 4*a*c))/2*a - Math.pow(a, 3)*c + b;
		
		System.out.println ("Результат вычисления равен: " + Math.round(res*100.0)/100.0);
		System.out.println();
		
	
// #3 Вычислить длину окружности и площадь круга одного и того же заданного радиуса	R.
	
		double R = readInput("R");
		
		double C = 2*Math.PI*R;
		double S = Math.PI*R*R;
		
		System.out.println ("Длина окружности радиусом " + R + " равна " + Math.round(C*100.0)/100.0 + ", "
				+ "площадь круга с таким же радиусом равна " + Math.round(S*100.0)/100.0); 
		
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

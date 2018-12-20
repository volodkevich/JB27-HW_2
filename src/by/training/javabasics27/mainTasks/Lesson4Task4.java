package by.training.javabasics27.mainTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang.ArrayUtils;

// В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

public class Lesson4Task4 {

	public static void main(String[] args) {

		//entering 
		int n = (int) readInput("Enter number of elements in the sequence: ");
		int[] seq = new int[n];

		System.out.println("\nEnter elements:");
		for (int i = 0; i < n; i++) {
			seq[i] = (int) readInput("> ");
		}

		int[] temp = new int[n];
		int nz = 0;
		
		// finding zero elements
		for (int i = 0; i < n; i++) {

			if (seq[i] == 0) {
				temp[i] = i; // putting zero elements indexes into temporary array
				nz++; // counter of zero elements
			} else {
				temp[i] = -1; // marking non-zero elements indexes
			}
		}

		
		// putting zero elements indexes to list
		List<Integer> tempList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (temp[i] != -1) {
				tempList.add(i);
			}

		}
 
		// converting list to array
		int[] zeroInd = ArrayUtils.toPrimitive(tempList.toArray(new Integer[tempList.size()]));

		if (nz == 0) {
			System.out.println("\n\nThere are no zero elements in this sequence.");
		} else {
			System.out.println("\n\nZero elements in the sequence are in places with following numbers:");
			for (int i = 0; i < nz; i++) {
				System.out.println(zeroInd[i]);
			}
		}

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

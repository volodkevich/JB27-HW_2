package by.training.javabasics27.mainTask_2;

/*Самостоятельно разберитесь с классом(классами) в Java, позволяющими читать символьные данные из файла. 
Создайте файл, содержащий информацию о книгах из библиотеки, прочитайте его, 
и на основе прочитанной информации создайте коллекцию книг.*/

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class L12T1_ReadFromFile {

	public static void main(String[] args) throws Exception {

		ArrayList<String> books = new ArrayList<>();

		FileReader fr = new FileReader("C:\\Users\\Kate\\Desktop\\books_L12T1.txt");
		Scanner scan = new Scanner(fr);

		int i = 1;

		while (scan.hasNextLine()) {
			books.add(scan.nextLine());
			i++;
		}

		fr.close();

		System.out.println("Books collection: ");

		for (i = 0; i < books.size(); i++) {

			System.out.println(books.get(i));

		}

	}

}
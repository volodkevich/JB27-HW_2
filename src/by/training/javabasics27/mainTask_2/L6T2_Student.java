package by.training.javabasics27.mainTask_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/*Оценки, полученные студентами в сессию, являются атрибутами класса Student. Определить:
	а) средний балл учебной группы (использовать класс Group);
	б) средний балл каждого студента;
	в) число отличников;
	г) количество студентов, имеющих "2".*/

public class L6T2_Student {

	public static void main(String[] args) {

		Group group = new Group(25);
		group.add(new Student("Sam", 8, 7, 9, 7));
		group.add(new Student("Tom", 2, 4, 5, 6));
		group.add(new Student("Ray", 10, 9, 9, 9));
		group.add(new Student("Jess", 10, 7, 8, 6));
		group.add(new Student("Rudy", 6, 3, 5, 7));
		
		group.averageMarkGr(group);

	}
}

class Student {
	
	String name;
	public int m1;
	public int m2;
	public int m3;
	public int m4;

	public Student() {}

	public Student(String name, int m1, int m2, int m3, int m4) {
		this.name = name;
		// generating marks for 4 subjects in session
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m3;
		
		double averageMarkSt = averageMarkSt(m1,m2, m3, m4, name);

	}

	// calculating average mark for a student
	public double averageMarkSt(int m1,int m2, int m3, int m4, String name) {
		double sum = m1+m2+m3+m4;		
		double averageMarkSt = sum / 4;
		System.out.println("Average session mark for student " + name + " is " + averageMarkSt);
		return averageMarkSt;

	}

}

class Group {

	ArrayList<Student> group = new ArrayList<Student>();

	public Group(int groupNumber) {
	}

	public static void averageMarkGr(Group group) {

		ArrayList<Student> groupAverage = new ArrayList<Student>();
		double sumOfAv=0;
		
		for (int i = 0; i < groupAverage.size(); i++) {
			Student student = groupAverage.get(i);
			sumOfAv = sumOfAv + student.averageMarkSt(student.m1, student.m2, student.m3, student.m4, student.name);			
		}
		double averageMarkGr = sumOfAv/5;
		System.out.println("Group avearage mark: " + averageMarkGr);

	}

	public void add(Student student) {
		group.add(student);
	}

	public static double average(int groupMarks[]) {

		double average = 0;
		double sum = 0;

		for (int i = 0; i < groupMarks.length; i++) {
			sum = sum + groupMarks[i];
		}
		average = sum / groupMarks.length;
		return average;

	}

}

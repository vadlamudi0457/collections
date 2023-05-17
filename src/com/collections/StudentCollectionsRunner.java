package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DecendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		return Integer.compare(student2.getId(), student1.getId());
	}
}

public class StudentCollectionsRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Naga"), new Student(100, "Raju"), new Student(5, "Adam"));
		// System.out.println(students);
		ArrayList<Student> StudentsAl = new ArrayList<>(students);

		Collections.sort(StudentsAl);
		StudentsAl.sort(new DecendingStudentComparator());
		System.out.println("DecendingStudentComparator" + StudentsAl);
	}
}

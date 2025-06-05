package com.oopsProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentManager {
	private ArrayList<Student> listOfStudent = new ArrayList<>();

	public StudentManager() {

	}

	public void addStudent(Student student) {
		listOfStudent.add(student);
	}

	public void viewAllStudents() {
		if (listOfStudent.isEmpty()) {
			System.out.println("No Student found");
		} else {
		for (Student student : listOfStudent) {
			student.displayStudentInfo();
		}
	}
}

	public void removeStudent(int studentId) {
		Iterator<Student> iterator = listOfStudent.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.getId() == studentId) {
				iterator.remove();
				return;
			}
		}
	}

	public Student findStudentById(int studentId) {
		for (Student student : listOfStudent) {
			if (student.getId() == studentId) {
				return student;
			}
		}
		return null;
	}

	public Student findStudentByName(String studentName) {
		for (Student student : listOfStudent) {
			if (student.getName().equalsIgnoreCase(studentName)) {
				return student;
			}
		}
		return null;
	}

	public ArrayList<Student> findStudentByGrade(String studentGrade) {
		ArrayList<Student> studentWithGrade=new ArrayList<>();
		for (Student student : listOfStudent) {
			if (student.getGrade().equalsIgnoreCase(studentGrade)) {
				studentWithGrade.add(student);
			}
		}
		return studentWithGrade;
	}

	public void updateStudent(int studentId, String name, int age, String grade) {
		for (Student student : listOfStudent) {
			if (student.getId() == studentId) {
				if (!name.isEmpty()) {
				student.setName(name);
				}
				if (age > 0) {
				student.setAge(age);
				}
				if (!grade.isEmpty()) {
					student.setGrade(grade);
				}
				System.out.println("Updated successfully");
				return;
			}
		}
		System.out.println("Student not found");
	}

	public void sortStudentsByName() {
		Collections.sort(listOfStudent);
	}
}

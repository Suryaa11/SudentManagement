package com.oopsProject;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRunner {

	public static void main(String[] args) {

		Scanner z = new Scanner(System.in);
		int choice;
		StudentManager manager = new StudentManager();
		do {
		System.out.println("Welcome to the Student Management System!");
			System.out.println("1. Add a student");
			System.out.println("2. View all students");
			System.out.println("3. Update student details");
			System.out.println("4. Remove a student");
			System.out.println("5. Find a student by ID");
			System.out.println("6. Find a student by name");
			System.out.println("7. Find students by grade");
			System.out.println("8. Exit");
			System.out.print("Enter any choice from 1 to 8 : ");
			choice = z.nextInt();
			switch (choice) {
			case 1: {
				System.out.print("Enter a unique Id : ");
				int id = z.nextInt();
				z.nextLine();
				System.out.print("Enter Student's Name : ");
				String name = z.nextLine();
				System.out.print("Enter Student's Age : ");
				int age = z.nextInt();
				System.out.print("Enter Student's Grade : ");
				String grade = z.next();
				Student student = new Student(id, name, age, grade);
				manager.addStudent(student);
				System.out.println("Student added successfully");
				break;
			}
			case 2: {
				manager.viewAllStudents();
				break;
			}
			case 3: {
				System.out.println("Enter the Student Id : ");
				int id = z.nextInt();
				Student student = manager.findStudentById(id);
				if (student == null) {
					System.out.println("Student not found");
				} else {
					z.nextLine();
					System.out.print("Enter Student's New Name : ");
					String name = z.nextLine();
					System.out.print("Enter Student's New Age : ");
					int age = z.nextInt();
					System.out.print("Enter Student's New Grade : ");
					String grade = z.next();
					manager.updateStudent(id, name, age, grade);
				}
				break;
			}
			case 4: {
				System.out.println("Enter the Student Id : ");
				int id = z.nextInt();
				Student student = manager.findStudentById(id);
				if (student == null) {
					System.out.println("Student not found");
				} else {
					manager.removeStudent(id);
				}
				break;
			}
			case 5: {
				System.out.println("Enter the Student Id : ");
				int id = z.nextInt();
				Student student = manager.findStudentById(id);
				if (student == null) {
					System.out.println("Student not found");
				} else {
					student.displayStudentInfo();
				}
				break;
			}
			case 6: {
				z.nextLine();
				System.out.print("Enter Student's Name : ");
				String name = z.next();
				Student student = manager.findStudentByName(name);
				if (student == null) {
					System.out.println("Student not found");
				} else {
					student.displayStudentInfo();
				}
				break;
			}
			case 7: {
				System.out.print("Enter Student's Grade : ");
				String grade = z.next();
				ArrayList<Student> gradeList = manager.findStudentByGrade(grade);
				if (gradeList.isEmpty()) {
					System.out.println("No students found with that grade");
				} else {
					for (Student student : gradeList) {
						student.displayStudentInfo();
					}
				}
				break;
			}
			case 8: {
				System.out.println("Thank you for using the Student Management System");
				break;
			}
			default: {
				System.out.println("Enter a valid choice");
			}
			}
			System.out.println("----------------------------------------------------");
		} while (choice != 8);
	}
}

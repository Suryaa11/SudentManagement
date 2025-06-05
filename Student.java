package com.oopsProject;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;
	private String grade;

	public Student(int id, String name, int age, String grade) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void displayStudentInfo() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Grade : " + grade);
		System.out.println();

	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}

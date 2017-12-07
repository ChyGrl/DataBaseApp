package com.chygrl.studentDBapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String gradeLevel;
	private String studentId;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 10001;

	// Constructor to prompt name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();

		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();

		System.out.print("1 - Freshman\n2 - Sophmore\n3- Junior\n4- Senior\nEnter student class level:");
		this.gradeLevel = in.nextLine();
		// System.out.println(firstName + " " + lastName + ":" + " " + gradeLevel);
		
		
		
		setStudentId();

		System.out.println(firstName + " " + lastName + " " + gradeLevel + " " + studentId);

	}

	// Generate ID using a Random password code
	private void setStudentId() {
		// grade level +id
		
		id++;
		this.studentId = gradeLevel + " " + id;
	}

	// Enroll in courses
	public void enroll() {
		do {
			// create a loop
			System.out.print("Enter Course name to enroll (Press Q to quit):");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;

			} else {
				break;
			}
		} while (1 != 0);

		System.out.println("Enrolled in: " + courses);
	}

	// View balance

	public void viewBalance() {
		System.out.println("Your Balance is: " + tuitionBalance);
	}

	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $ :" + payment);
		viewBalance();
	}
	// Show status

}

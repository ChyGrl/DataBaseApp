package com.chygrl.studentDBapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String gradeLevel;
	private String studentId;
	private String courses = null;
	private int tuitionBalance;
	private int costOfCourse = 600;
	private static int id = 10001;
	
	//Constructor to prompt name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		

		System.out.println("Enter student grade level: ");
		this.gradeLevel = in.nextLine();
		System.out.println(firstName + " " + lastName + ":" + " " + gradeLevel);
		
		setStudentId();
		
		System.out.println(firstName + " " + lastName + " " + gradeLevel + " " + studentId);
		
//		this.studentId = randomID(8);
//		System.out.println("Your Student ID is:" + studentId);
//	
	
	}
	
	
	//Generate ID using a Random password code
	//Does NOT meet the criteria set by the scenario; 
	//5 digit unique ID with the first number being thier grade level
//	private String randomID(int length) {
//		String studentIdSet = "1234567890";
//		char[] ID = new char[length];
//		for (int i = 0; i <length; i++) {
//			int rand = (int) (Math.random() * studentIdSet.length());
//			ID [i] = studentIdSet.charAt(rand);
//		}
//		return new String(ID);
//	}
//	
	//Generate an ID in a more 'controlled fashion.'
	
	private void setStudentId() {
		//grade level +id
		id++; 	
		this.studentId = gradeLevel + " " + id;
	} 
	
	//Enroll in courses
	public void enroll() {
		//create a loop
		System.out.println("Enter to enroll Q to quit):");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (course != "Q") {
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
			
		}
	System.out.println("Enrolled in" + courses);
	System.out.println(tuitionBalance);
	}
	
	
	
	//View balance  
	
	
	//Pay tuition
	
	//Show status
	
}

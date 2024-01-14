package com.test;

import com.manager.*;
import java.util.Scanner;

public class TestAcademy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Course Lists >Course Id
		CourseManager.addCourse();
		// CourseManager.printCourse();

		// Students Lists > Course Id
		StudentManager.addStudent();
		// StudentManager.printStudent();

		// Attendance Lists >Course Id
		AttendanceManager.addAttendance();
		// AttendanceManager.printAttendance();

		// Transaction Lists >Course Id
		TransactionManager.addTransaction();
		// TransactionManager.printTransaction();

		// Find Students List By Course Id
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Course Id");
//		int id=sc.nextInt();
//		StudentManager.getStudentsByCourseId(id);

		// 24.Find Most Favoured Course
//		StudentManager.mostFavouredCourse();

		// TestResult Lists >Course Id
		TestResultManager.addTestResult();
		// TestResultManager.printTestResult();

		// 10. List Of Students Who Paid Complete Fees
		// TransactionManager.findFeePaidStudents();

		// 14. Show one table which has course name ,
		// course start date and total students,
		// CourseManager.totalStudent();

		// 8.One method which takes course id as input and
		// shows all students registered for this course. //
//		 System.out.print("Enter Course Id");
//		int cid=sc.nextInt();
//		CourseManager.findStudentsRegisterForCourse(cid);

		// 19 & 20 .Method to add all student names in one place and print all student
		// names which are duplicate / Unique .
		// StudentManager.allstdnameinoneplace();

		// 12. Update Student Mobile Number By Entering Student Id
		// StudentManager.updateMobileNumber();
		// StudentManager.printStudent();

		// 1.Add functions, add, modify, delete, search for Course.
		CourseManager.amdsFun();
		CourseManager.printCourse();

	}

}

package com.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Academy {
	// ArrayList object course
	public static ArrayList<Course> coursesList = new ArrayList<>();

	// create map object for student - key = course id
	// ONE STUDENT ONE COURSE
	public static HashMap<Integer, List<Student>> studentMap = new HashMap<>();

	// create map object for attendance - key = course id
	public static HashMap<Integer, List<Attendance>> attendanceMap = new HashMap<>();

	// create map object for TestResult - key = course id
	public static HashMap<Integer, List<TestResult>> testresultMap = new HashMap<>();

	// create map object for transaction - key = course id
	// NOTE ONE STUDENT CAN PAY FEES MANY TIME FOR SAME COURSE
	// EG courseId 1 fees is 10k, then in this map for one stud 2 entry can also
	// be there. Eg 5k one time, 5k another time
	public static HashMap<Integer, List<Transaction>> transactionMap = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

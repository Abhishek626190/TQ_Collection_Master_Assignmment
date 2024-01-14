package com.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

//import java.util.List;
import com.bean.*;

public class StudentManager {

	static Scanner sc = new Scanner(System.in);
	// ArrayList<Student>studentlist=new ArrayList<>();

	// add student
	public static void addStudent() {
		List<Student> studentlist1 = new ArrayList<>();
		Student s1 = new Student(101, "Rupali", "priyanka@gmail.com", 6261904221l);
		Student s2 = new Student(102, "Pratiksha", "pratiksha@gmail.com", 1234567890l);
		Student s3 = new Student(103, "Rupali", "rupali@gmail.com", 1234754786l);
		// Student s4 = new Student(104, "Muskan", "muskan@gmail.com", 1235744796l);
		// Student s5 = new Student(105, "Dhaani", "dhaani@gmail.com", 123414786l);
		studentlist1.add(s1);
		studentlist1.add(s2);
		studentlist1.add(s3);
//		studentlist1.add(s4);
//		studentlist1.add(s5);

		Academy.studentMap.put(201, studentlist1);
		List<Student> studentlist2 = new ArrayList<>();
		Student s6 = new Student(106, "Sanu", "sanu@gmail.com", 6261904221l);
		Student s7 = new Student(107, "Snehal", "snehal@gmail.com", 1234567890l);
		Student s8 = new Student(108, "Suraj", "suraj@gmail.com", 1234754786l);
		Student s9 = new Student(109, "Sanu", "ishwar@gmail.com", 1235744796l);
		// Student s10 = new Student(110, "Adarsh", "adarsh@gmail.com", 123414786l);
		studentlist2.add(s6);
		studentlist2.add(s7);
		studentlist2.add(s8);
		studentlist2.add(s9);
		// studentlist2.add(s10);

		Academy.studentMap.put(202, studentlist2);
		List<Student> studentlist3 = new ArrayList<>();
		Student s11 = new Student(111, "Sudarshan", "sudarshan@gmail.com", 6261904221l);
		Student s12 = new Student(112, "Utkarsha", "utkarsha@gmail.com", 1234567890l);
		Student s13 = new Student(115, "Ankit", "ankit@gmail.com", 1234754786l);
		Student s14 = new Student(113, "Utkarsha", "ganesh@gmail.com", 1235744796l);
		Student s15 = new Student(114, "Pritam", "pritam@gmail.com", 123414786l);
		studentlist3.add(s11);
		studentlist3.add(s12);
		studentlist3.add(s13);
		studentlist3.add(s14);
		studentlist3.add(s15);

		Academy.studentMap.put(203, studentlist3);

	}

	// print student list
	public static void printStudent() {
		Set<Entry<Integer, List<Student>>> set = Academy.studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Integer, List<Student>> e = itr.next();
			System.out.println("Course ID: " + e.getKey());
			System.out.println("Student Lists: " + e.getValue());
		}
	}

	// student details by course id
	public static void getStudentsByCourseId(int courseId) {
		Set<Entry<Integer, List<Student>>> set = Academy.studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Integer, List<Student>> e = itr.next();
			if (e.getKey() == courseId) {
				System.out.println(e.getValue());
			}
		}

	}

	// Most favoured course
	public static void mostFavouredCourse() {
		int max = 0;
		Set<Entry<Integer, List<Student>>> set = Academy.studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> itr = set.iterator();
		int fav = 0;
		while (itr.hasNext()) {
			Entry<Integer, List<Student>> e = itr.next();
			int size = e.getValue().size();
			if (max < size) {
				// System.out.println("I am in if"+e.getKey());
				max = size;
				fav = e.getKey();
			}
		}
		// System.out.println(fav);
		CourseManager.findCourseId(fav, max);

	}

	// 19&20 .Method to add all student names in one place and print all student
	// names which are duplicate./Unique
	public static void allstdnameinoneplace() {
		Set<Entry<Integer, List<Student>>> setstd = Academy.studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> setstditr = setstd.iterator();
		List<Student> stdlist = new ArrayList<>();
		while (setstditr.hasNext()) {
			Entry<Integer, List<Student>> e = setstditr.next();
			List<Student> list = e.getValue();
			Iterator<Student> itr = list.iterator();
			while (itr.hasNext()) {
				Student s = itr.next();
				stdlist.add(s);
			}

		}
//		Iterator<Student>stditr=stdlist.iterator();
//		while(stditr.hasNext())
//		{
//			Student std=stditr.next();
//			System.out.println(std);
//		}
		List<Student> uniquestdlist = new ArrayList<>();
		List<Student> duplicatestdlist = new ArrayList<>();
		int count = 0;

		for (int i = 0; i < stdlist.size(); i++) {
			count = 0;
			for (int j = 0; j < stdlist.size(); j++) {
				if (i != j) {
					if (stdlist.get(i).getSname().equals(stdlist.get(j).getSname())) {
						count++;
					}
				}
 			}
			if (count == 0) {
				uniquestdlist.add(stdlist.get(i));
			} else {
				duplicatestdlist.add(stdlist.get(i));
			}
		}
		System.out.println("List of duplicates Students");
		System.out.println(duplicatestdlist);
		System.out.println("********************");
		System.out.println("List of unique Students");
		System.out.println(uniquestdlist);
 	}

	// Update student mobile number
	public static void updateMobileNumber() {
		System.out.println("Enter Student Id to Update Number:");
		int sid = sc.nextInt();
		Academy.studentMap.entrySet();
		Set<Entry<Integer, List<Student>>> set = Academy.studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> itr = set.iterator();
		while(itr.hasNext())
		{
			Entry<Integer, List<Student>> e = itr.next();
			List<Student> list = e.getValue();
			Iterator<Student> listitr = list.iterator();
			while (listitr.hasNext()) {
				Student s = listitr.next();
				 if(s.getSid()==sid)
				 {
					 System.out.println("Enter New Phone Number ");
					 long num=sc.nextLong();
					 s.setPhno(num);
					 System.out.println("Mobile Number Updated Successfully");
				 }
			}
		}
	}
}

package com.manager;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import com.bean.*;

public class CourseManager {
	static Scanner sc = new Scanner(System.in);

	public static void addCourse() {
		Course c1 = new Course(201, 9, "Full Stack Java", new MyDate(03, 10, 2017), 300000, "Java,SQL");
		Course c2 = new Course(202, 6, "Full Stack Python", new MyDate(15, 10, 2017), 200000, "Python");
		Course c3 = new Course(203, 3, "Front End Developer ", new MyDate(27, 10, 2017), 100000, "JavaScript");
		Academy.coursesList.add(c1);
		Academy.coursesList.add(c2);
		Academy.coursesList.add(c3);
	}

	public static void printCourse() {
		// List<Course> courseList = Academy.coursesList;
		Iterator<Course> iterator = Academy.coursesList.iterator();
		while (iterator.hasNext()) {
			Course course = iterator.next();
			System.out.println(course);
		}
	}

	public static void findCourseId(int fav, int max) {
		Iterator<Course> itr = Academy.coursesList.iterator();
		while (itr.hasNext()) {
			Course c = itr.next();
			// System.out.println(c.getCid()+" "+fav);
			if (c.getCid() == fav) {
				// System.out.println(fav);
				System.out.println(c.getCname() + " has " + max + " Students");
				break;
			}
		}
	}

	public static void totalStudent() {
		int count;
		Iterator<Course> citr = Academy.coursesList.iterator();
		System.out.println("\nCourse_Id   Course_Name       Course_Start_Date   Enrolled_Students");
		while (citr.hasNext()) {
			// int cid = citr.next().getCid();
			Course c = citr.next();
			int cid = c.getCid();
			String cname = c.getCname();
			MyDate cdate = c.getStartDate();
			System.out.println("");
//			System.out.println("Course Name: "+cname+" : "+"\nCourse Start Date: "+cdate+
//					" : \nCourse Id: "+cid);
			System.out.print(" " + cid + "        " + cname + "        " + cdate + "      ");

			Set<Entry<Integer, List<Student>>> stdset = Academy.studentMap.entrySet();
			Iterator<Entry<Integer, List<Student>>> stditr = stdset.iterator();
			count = 0;
			while (stditr.hasNext()) {
				Entry<Integer, List<Student>> e = stditr.next();
				int scid = e.getKey();
				// System.out.println(scid);
				List<Student> list = e.getValue();
				Iterator<Student> listitr = list.iterator();
				if (cid == scid) {
					while (listitr.hasNext()) {
						listitr.next();
						count++;
						// System.out.println(count);
					}
					// System.out.println("Number Of Students Enrolled In This Course:"+count);
					System.out.print("   " + count);
					System.out.println();

				}
			}
		}

	}

	public static void findStudentsRegisterForCourse(int id) {
		Set<Entry<Integer, List<Student>>> stdset = Academy.studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> stdsetitr = stdset.iterator();
		while (stdsetitr.hasNext()) {
			Entry<Integer, List<Student>> e = stdsetitr.next();
			int cid = e.getKey();
			if (id == cid) {
				System.out.println("Students Register For This Course are:");
				List<Student> stdlist = e.getValue();
				Iterator<Student> itr = stdlist.iterator();
				while (itr.hasNext()) {
					Student s = itr.next();
					System.out.println(s);
				}
			}
		}
	}

	public static void amdsFun() {
		System.out.println("Welcome to the Course Admin Panel");
		// List<Course> newCourse = new ArrayList<>();
		while (true) {
			System.out.println("Enter A to Add new Course");
			System.out.println("Enter D to Delete  Course");
			System.out.println("Enter M to Modify  Course");
			System.out.println("Enter S to Search  Course");
			System.out.println("Enter Your Choice:");
			char choice = sc.next().charAt(0);
			Character.toLowerCase(choice);
			switch (choice) {
			case 'a':
				addCourseFun();
				break;
			case 'd':
				deleteCourseFun();
				break;
			case 'm':
				break;
			case 's':
				break;
			default:
				System.out.println("Invalid Input");
			}// switch body end
			System.out.println("To Continue Press 'C' or For Exit Press Any Key ");
			char c = sc.next().charAt(0);
			Character.toLowerCase(c);
			if (c == 'c') {
				continue;
			} else {
				System.out.println("Thank You");
				break;
			}
		}
		// Academy.coursesList.addAll(newCourse);
	}// method body end

	public static void addCourseFun() {
		while (true) {// while outer start
			System.out.println("Enter Course Details:");
			System.out.println("Enter Course Id");
			int cid = sc.nextInt();
			Iterator<Course> itr = Academy.coursesList.iterator();
			while (itr.hasNext()) {// while inner start
				Course cobj = itr.next();
				if (cobj.getCid() == cid) {
					System.out.print("Course Id Already Exists Two Course Can not have Same Id:");
					System.out.println("Please Enter Another Id:");
					continue;
				}
			} // while inner end

			System.out.println("Enter Course Name:");
			String cname = sc.next();
			System.out.println("Enter Subject Name Separated By Comma if more than one subject");
			String subj = sc.next();
			System.out.println("Enter Course Duration");
			int duration = sc.nextInt();
			System.out.println("Enter Course Fees");
			double cfees = sc.nextDouble();
			System.out.println("Enter Course Start Date");
			System.out.println("Enter Date");
			int d = sc.nextInt();
			System.out.println("Enter Month");
			int m = sc.nextInt();
			System.out.println("Enter Year");
			int y = sc.nextInt();
			Course obj = new Course(cid, duration, cname, new MyDate(d, m, y), cfees, subj);
			Academy.coursesList.add(obj);
			System.out.println("Course Added Successfully");

			System.out.println("To Add Another course Enter 'Y' Else press any other key");
			char ch = sc.next().charAt(0);
			Character.toLowerCase(ch);
			if (ch == 'y') {
				continue;
			} else
				break;
		} // outer loop end
	}// method end

	public static void deleteCourseFun() {
		while (true) {
			System.out.println("Enter Course Id To delete course");
			int cid = sc.nextInt();
			boolean set = false;
			Iterator<Course> courseitr = Academy.coursesList.iterator();
			while (courseitr.hasNext()) {
				Course cobj = courseitr.next();
				int id = cobj.getCid();
				if (id == cid) {
					courseitr.remove();
					System.out.println("Course Deleted SuccessFully");
					set = true;
				}
			}
			if (set == false) {
				System.out.println(cid + " Course Id not exists");
			}
			System.out.println("To Delete Another course Enter 'Y' Else press any other key");
			char ch = sc.next().charAt(0);
			Character.toLowerCase(ch);
			if (ch == 'y') {
				continue;
			} else
				break;
		}
	}

}// class body end

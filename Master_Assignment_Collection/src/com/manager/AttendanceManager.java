package com.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import com.bean.*;

public class AttendanceManager {

	public static void addAttendance() {
		List<Attendance> attendancelist1 = new ArrayList<>();

		Attendance a1 = new Attendance(1, 101, "P", new MyDate(12, 12, 2023));
		Attendance a2 = new Attendance(2, 102, "P", new MyDate(12, 12, 2023));
		Attendance a3 = new Attendance(3, 103, "A", new MyDate(12, 12, 2023));
		Attendance a4 = new Attendance(4, 104, "P", new MyDate(12, 12, 2023));
		Attendance a5 = new Attendance(5, 105, "A", new MyDate(12, 12, 2023));

		attendancelist1.add(a1);
		attendancelist1.add(a2);
		attendancelist1.add(a3);
		attendancelist1.add(a4);
		attendancelist1.add(a5);

		Academy.attendanceMap.put(1, attendancelist1);

		ArrayList<Attendance> attendancelist2 = new ArrayList<>();

		Attendance a6 = new Attendance(1, 101, "P", new MyDate(12, 12, 2023));
		Attendance a7 = new Attendance(2, 102, "P", new MyDate(12, 12, 2023));
		Attendance a8 = new Attendance(3, 103, "A", new MyDate(12, 12, 2023));
		Attendance a9 = new Attendance(4, 104, "P", new MyDate(12, 12, 2023));
		Attendance a10 = new Attendance(5, 105, "A", new MyDate(12, 12, 2023));

		Academy.attendanceMap.put(2, attendancelist2);

		attendancelist2.add(a6);
		attendancelist2.add(a7);
		attendancelist2.add(a8);
		attendancelist2.add(a9);
		attendancelist2.add(a10);

		ArrayList<Attendance> attendancelist3 = new ArrayList<>();

		Attendance a11 = new Attendance(1, 101, "P", new MyDate(12, 12, 2023));
		Attendance a12 = new Attendance(2, 102, "P", new MyDate(12, 12, 2023));
		Attendance a13 = new Attendance(3, 103, "A", new MyDate(12, 12, 2023));
		Attendance a14 = new Attendance(4, 104, "P", new MyDate(12, 12, 2023));
		Attendance a15 = new Attendance(5, 105, "A", new MyDate(12, 12, 2023));

		attendancelist3.add(a11);
		attendancelist3.add(a12);
		attendancelist3.add(a13);
		attendancelist3.add(a14);
		attendancelist3.add(a15);

		Academy.attendanceMap.put(3, attendancelist3);

	}
	public static void printAttendance() {
		Set<Entry<Integer, List<Attendance>>> set = Academy.attendanceMap.entrySet();
		Iterator<Entry<Integer, List<Attendance>>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Integer, List<Attendance>> e = itr.next();
			System.out.println("Course ID: " + e.getKey());
			System.out.println("Attendance Lists: " + e.getValue());
		}
	}

}

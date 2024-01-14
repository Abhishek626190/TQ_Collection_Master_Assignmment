package com.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import com.bean.*;

public class TestResultManager  {
	public static void addTestResult() {
		List<TestResult> testResultList1 = new ArrayList<>();
		TestResult t1 = new TestResult(501, 90, 100, 201, 101, new MyDate(12, 10, 2023));
		TestResult t2 = new TestResult(501, 80, 100, 201, 102, new MyDate(12, 10, 2023));
		TestResult t3 = new TestResult(501, 95, 100, 201, 103, new MyDate(12, 10, 2023));
		testResultList1.add(t1);
		testResultList1.add(t2);
		testResultList1.add(t3);
		Academy.testresultMap.put(201, testResultList1);

		List<TestResult> testResultList2 = new ArrayList<>();
		TestResult t4 = new TestResult(502, 90, 100, 202, 104, new MyDate(12, 10, 2023));
		TestResult t5 = new TestResult(502, 95, 100, 202, 105, new MyDate(12, 10, 2023));
		TestResult t6 = new TestResult(502, 98, 100, 202, 106, new MyDate(12, 10, 2023));
		TestResult t7 = new TestResult(502, 88, 100, 202, 107, new MyDate(12, 10, 2023));

		testResultList2.add(t4);
		testResultList2.add(t5);
		testResultList2.add(t6);
		testResultList2.add(t7);

		Academy.testresultMap.put(202, testResultList2);

		List<TestResult> testResultList3 = new ArrayList<>();
		TestResult t8 = new TestResult(503, 82, 100, 203, 108, new MyDate(12, 10, 2023));
		TestResult t9 = new TestResult(503, 87, 100, 203, 109, new MyDate(12, 10, 2023));
		TestResult t10 = new TestResult(503, 97, 100, 203, 110, new MyDate(12, 10, 2023));
		TestResult t11 = new TestResult(503, 77, 100, 203, 111, new MyDate(12, 10, 2023));
		TestResult t12 = new TestResult(503, 83, 100, 203, 112, new MyDate(12, 10, 2023));

		testResultList3.add(t12);
		testResultList3.add(t8);
		testResultList3.add(t9);
		testResultList3.add(t10);
		testResultList3.add(t11);

		Academy.testresultMap.put(203, testResultList3);

	}
	
	public static void printTestResult() {
		Set<Entry<Integer, List<TestResult>>> set = Academy.testresultMap.entrySet();
		Iterator<Entry<Integer, List<TestResult>>> itr = set.iterator();
		//Collections.sort(itr.next().getValue());
		while (itr.hasNext()) {
			Entry<Integer, List<TestResult>> e = itr.next();
			Collections.sort(e.getValue());
 			System.out.println("Course ID: " + e.getKey());
			System.out.println("Test Result Lists: " + e.getValue());
		}
	}

}

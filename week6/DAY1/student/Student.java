package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Harrish A");
	}
	public void studentDept() {
		System.out.println("CSE");
	}
	public void studentId() {
		System.out.println("URK20CS2036");
		
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
	}

}

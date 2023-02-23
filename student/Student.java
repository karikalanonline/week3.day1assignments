package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName(){
		System.out.println("This is studentName");
	}
	
	public void studentDept() {
		System.out.println("This is studentDept");
	}
	
	public void studentId() {
		System.out.println("studentID");
	}
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentDept();
		stu.studentId();
		stu.studentName();
	}
}

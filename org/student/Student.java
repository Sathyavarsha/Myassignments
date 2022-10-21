package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Name:Sathya");

	}

	public void studentDept() {
		System.out.println("Dept:CSE");

	}
	public void studentId() {
		System.out.println("Id:CSE0026");

	}
	
	public static void main(String[] args) {
		Student S=new Student();
	      S.collegeCode();
	      S.collegeName();
	      S.collegeRank();
	      S.deptName();
	      S.studentDept();
	      S.studentId();
	      S.studentName();
}}
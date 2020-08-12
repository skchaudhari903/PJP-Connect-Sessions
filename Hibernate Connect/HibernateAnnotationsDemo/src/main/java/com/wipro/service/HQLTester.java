package com.wipro.service;

import java.util.List;

import com.wipro.bean.Student;
import com.wipro.dao.StudentDAO;

public class HQLTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO dao = new StudentDAO();
		
		List<Student> result = dao.getStudents();
		System.out.println("Student Records");
		for(Student ob : result)
			System.out.println(ob);
		System.out.println("************************************************************");
		
		List<Student> result1 = dao.getStudentsByCourse("Java");
		System.out.println("JAVA Student Records");
		for(Student ob : result1)
			System.out.println(ob);
		System.out.println("************************************************************");
		
		List<Student> result2 = dao.getStudentsTop3();
		System.out.println("First 3 Student Records");
		for(Student ob : result2)
			System.out.println(ob);
		System.out.println("************************************************************");
	}

}

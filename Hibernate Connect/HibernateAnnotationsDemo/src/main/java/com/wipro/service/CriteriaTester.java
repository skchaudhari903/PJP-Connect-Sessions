package com.wipro.service;

import java.util.List;

import com.wipro.bean.Student;
import com.wipro.dao.StudentCriteria;

public class CriteriaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentCriteria dao = new StudentCriteria();
		
		List<Student> result = dao.getAllStudents();
		System.out.println("Student Records");
		for(Student ob : result)
			System.out.println(ob);
		System.out.println("************************************************************");
		
		List<Student> result1 = dao.getStudentsByCourse("Oracle");
		System.out.println("Oracle Student Records");
		for(Student ob : result1)
			System.out.println(ob);
		System.out.println("************************************************************");
	}

}

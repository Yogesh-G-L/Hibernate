package com.tns.client;

import com.tns.entities.student;
import com.tns.service.studentservice;
import com.tns.service.studentserviceimpl;

public class client {
	public static void main(String [] arg) {
		studentservice service=new studentserviceimpl();
		student student=new student();
		
		// cerate the optertions
		student.setStudentId(100);
		student.setName("Shashank.M");
		service.addstudent(student);
		
		
		// at this breakpoint, we have added one record to table
		// retrive operation
		student=service.findstudentById(100);
		System.out.println("ID: "+ student.getStudentId());
		System.out.println("Name: "+ student.getName());
		
		//Update operation value in the table
		student =service.findstudentById(100);
		student.setName("yogesh G L");
		service.updatestudent(student);
		
		
		// rremove  or delete operation
		student= service.findstudentById(100);
		service.removestudent(student);
		System.out.println("end of program / Life cycle is completed....");
		
		
		
		
		
		
		
		
	}

}

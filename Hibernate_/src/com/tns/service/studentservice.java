package com.tns.service;

import com.tns.entities.student;

public interface studentservice {
	
	
	public abstract void addstudent(student student);
	 public abstract void updatestudent(student student);
	 public abstract void removestudent(student student);
	 public abstract student findstudentById(int id);
	
}

package com.tns.dao;




import com.tns.entities.student;

public interface studentDao {
	
	
	public abstract student getstudentById(int id);
	
	public abstract void addstudent (student student);
	
	public abstract void removestudent (student student);
	
	public abstract void updatesudent (student student);
	
	
	
	public abstract void commitTranscatio();
	public abstract void beginTraanscatio();


}

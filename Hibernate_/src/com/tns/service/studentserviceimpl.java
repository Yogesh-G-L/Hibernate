package com.tns.service;


import com.tns.dao.*;
import com.tns.entities.*;
public class studentserviceimpl  implements studentservice{

	public static void main(String[] args) {
		
		
		private studentDao Dao;
		public studentserviceimpl() {
			Dao= new studentdaoimple();
			
		}

	}

	@Override
	public void addstudent(student student) {
		Dao.beginTransationa();
		Dao.addstudent(student);
		Dao.commitTransation();
		
	}

	@Override
	public void updatestudent(student student) {
		Dao.beginTransationa();
		Dao.updatetudent(student);
		Dao.commitTransation();
		
	}

	@Override
	public void removestudent(student student) {
		Dao.beginTransationa();
		Dao.removetudent(student);
		Dao.commitTransation();
		
	}

	@Override
	public student findstudentById(int id) {
		student student=Dao.getstudentbyId(id);
		return student;
	}

}

package com.tns.dao;

import javax.persistence.EntityManager;
import com.tns.entities.student;

public class studentdaoimple implements studentDao {

	public static void main(String[] args) {
		
		 EntityManager entityManager;
		
		public studentdaoimple() {
			entityManager= jpautil.getEntityManager();
			
		}
		
		
		
	

	


	}

	@Override
	public student getstudentById(int id) {
		student student= entityManager.find(student.class, id);
		return student;
	}

	@Override
	public void addstudent(student student) {
		entityManager.persist(student);
		
	}

	@Override
	public void removestudent(student student) {
		entityManager.remove(student);
		
		
	}

	@Override
	public void updatesudent(student student) {
		entityManager.merge(student);
		
	}

	@Override
	public void commitTranscatio() {
		entityManager.getTransaction().begin();
		
		
	}

	@Override
	public void beginTraanscatio() {
		entityManager.getTransaction().commit();
		
	}
	}

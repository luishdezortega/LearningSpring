package com.pragma.hibernate.dao;

import java.util.List;

import com.pragma.hibernate.model.Profesor;

public class ProfesorDaoImPlements extends PlatziSession implements ProfesorDao {
	
	
	
	private PlatziSession platziSession;
	
	public ProfesorDaoImPlements() {
		platziSession = new PlatziSession();
	}


	public void guardarProfesor(Profesor profesor) {
		platziSession.getSession().persist(profesor);
		platziSession.getSession().getTransaction().commit();
		
	}

	public void borrarProfesor(Long id_Profesor) {
		// TODO Auto-generated method stub
		
	}

	public void actualizarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		
	}

	public List<Profesor> listarProfes() {
		// TODO Auto-generated method stub
		return platziSession.getSession().createQuery("from Profesor").list();
	}

	public Profesor buscarProfeID(Long id_Profesor) {
		// TODO Auto-generated method stub
		return null;
	}

	public Profesor buscarProfeNombre(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}

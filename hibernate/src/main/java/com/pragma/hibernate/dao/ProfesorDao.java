package com.pragma.hibernate.dao;

import java.util.List;

import com.pragma.hibernate.model.Profesor;

public interface ProfesorDao {

	void guardarProfesor(Profesor profesor);
	
	void borrarProfesor(Long id_Profesor);
	
	void actualizarProfesor(Profesor profesor);
	
	List<Profesor> listarProfes();
	
	Profesor buscarProfeID(Long id_Profesor);
	
	Profesor buscarProfeNombre(String name);
	
	
}

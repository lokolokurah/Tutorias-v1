package org.iesalandalus.programacion.tutorias.mvc.modelo;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.Alumno;
import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.Cita;
import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.Profesor;
import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.Sesion;
import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.Tutoria;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.Alumnos;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.Citas;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.Profesores;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.Sesiones;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.Tutorias;

public class Modelo {
	
	private static final int CAPACIDAD = 10;
	
	private Profesores profesores;
	private Tutorias tutorias;
	private Sesiones sesiones;
	private Citas citas;
	private Alumnos alumnos;
	
	public Modelo() 
	{
		profesores = new Profesores();
		tutorias = new Tutorias();
		sesiones = new Sesiones();
		citas = new Citas(CAPACIDAD);
		alumnos = new Alumnos();
	}

	public void insertar(Alumno alumno) throws OperationNotSupportedException
	{
		alumnos.insertar(alumno);
	}

	public void insertar(Profesor profesor) throws OperationNotSupportedException
	{
		profesores.insertar(profesor);
	}

	public void insertar(Tutoria tutoria) throws OperationNotSupportedException
	{
		tutorias.insertar(tutoria);
	}

	public void insertar(Sesion sesion) throws OperationNotSupportedException
	{
		sesiones.insertar(sesion);
	}

	public void insertar(Cita cita) throws OperationNotSupportedException
	{
		citas.insertar(cita);
	}

	public Alumno buscar(Alumno alumno) 
	{
		return alumnos.buscar(alumno);
	}

	public Profesor buscar(Profesor profesor)
	{
		return profesores.buscar(profesor);
	}

	public Tutoria buscar(Tutoria tutoria)
	{
		return tutorias.buscar(tutoria);
	}

	public Sesion buscar(Sesion sesion) 
	{
		return sesiones.buscar(sesion);
	}

	public Cita buscar(Cita cita) 
	{
		return citas.buscar(cita);
	}

	public void borrar(Alumno alumno) throws OperationNotSupportedException
	{
		alumnos.borrar(alumno);
	}

	public void borrar(Profesor profesor) throws OperationNotSupportedException
	{
		profesores.borrar(profesor);
	}

	public void borrar(Tutoria tutoria) throws OperationNotSupportedException
	{
		tutorias.borrar(tutoria);
	}

	public void borrar(Sesion sesion) throws OperationNotSupportedException
	{
		sesiones.borrar(sesion);
	}

	public void borrar(Cita cita) throws OperationNotSupportedException
	{
		citas.borrar(cita);
	}

	public List<Alumno> getAlumnos() 
	{
		return alumnos.get();
	}

	public List<Profesor> getProfesores()
	{
		return profesores.get();
	}

	public List<Tutoria> getTutorias() 
	{
		return tutorias.get();
	}

	public List<Tutoria> getTutorias(Profesor profesor)
	{
		return tutorias.get(profesor);
	}

	public List<Sesion> getSesiones() 
	{
		return sesiones.get();
	}

	public List<Sesion> getSesiones(Tutoria tutoria) 
	{
		return sesiones.get(tutoria);
	}

	public Cita[] getCitas()
	{
		return citas.get();
	}

	public Cita[] getCitas(Sesion sesion)
	{
		return citas.get(sesion);
	}

	public Cita[] getCitas(Alumno alumno) 
	{
		return citas.get(alumno);
	}

}

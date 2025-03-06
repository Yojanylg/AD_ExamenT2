package com.examen.CentroEscolar.service;

import com.examen.CentroEscolar.model.Alumno;

import java.util.List;

public interface AlumnoService {

    Alumno agregarAlumno(Alumno alumno);
    List<Alumno> obtenerTodos();
    List<Alumno> alumnosByCurso(int curso);
}


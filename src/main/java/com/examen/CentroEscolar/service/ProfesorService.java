package com.examen.CentroEscolar.service;

import com.examen.CentroEscolar.model.Curso;
import com.examen.CentroEscolar.model.Profesor;

import java.util.List;

public interface ProfesorService {

    Profesor agregarProfesor(Profesor profesor);
    List<Profesor> getByCursos(Curso curso);
    List<Profesor> obtenerTodos();
}
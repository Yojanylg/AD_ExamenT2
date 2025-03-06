package com.examen.CentroEscolar.service;

import com.examen.CentroEscolar.model.Curso;

import java.util.List;

public interface CursoService {

    Curso getByAula(int id_aula);

    List<Curso> getByProfesor(int id_perofesor);

    Curso addCurso(Curso curso);
}
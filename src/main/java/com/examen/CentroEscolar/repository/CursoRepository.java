package com.examen.CentroEscolar.repository;

import com.examen.CentroEscolar.model.Aula;
import com.examen.CentroEscolar.model.Curso;
import com.examen.CentroEscolar.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

    Curso getByAula(Aula aula);

    List<Curso> getByProfesores(Profesor profesor);

    Curso getById(int id_curso);


}
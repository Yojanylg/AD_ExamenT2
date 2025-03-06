package com.examen.CentroEscolar.repository;

import com.examen.CentroEscolar.model.Alumno;
import com.examen.CentroEscolar.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

    List<Alumno> getByCurso(Curso curso);

}

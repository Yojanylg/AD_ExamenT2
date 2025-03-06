package com.examen.CentroEscolar.repository;

import com.examen.CentroEscolar.model.Curso;
import com.examen.CentroEscolar.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {

    List<Profesor> getByCursos(Curso curso);

}

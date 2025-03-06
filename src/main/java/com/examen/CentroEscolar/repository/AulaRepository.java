package com.examen.CentroEscolar.repository;

import com.examen.CentroEscolar.model.Aula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AulaRepository extends JpaRepository<Aula, Integer> {

    Aula getById(int id);

}

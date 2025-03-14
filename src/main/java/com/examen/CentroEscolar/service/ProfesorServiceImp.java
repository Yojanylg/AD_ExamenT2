package com.examen.CentroEscolar.service;

import com.examen.CentroEscolar.model.Curso;
import com.examen.CentroEscolar.model.Profesor;
import com.examen.CentroEscolar.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImp implements ProfesorService{

    @Autowired
    private ProfesorRepository profesorRepository;

    @Override
    public Profesor agregarProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public List<Profesor> getByCursos(Curso curso) {
        return profesorRepository.getByCursos(curso);
    }

    @Override
    public List<Profesor> obtenerTodos() {
        return profesorRepository.findAll();
    }
}
